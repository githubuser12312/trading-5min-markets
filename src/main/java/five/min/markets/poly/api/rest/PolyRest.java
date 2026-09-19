package five.min.markets.poly.api.rest;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Instant;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import five.min.markets.poly.model.market.Event;
import five.min.markets.poly.model.market.Market;
import lombok.extern.slf4j.Slf4j;


@Component
@Slf4j
public class PolyRest {

	private String baseUrl = "https://gamma-api.polymarket.com";
	private String slugVar = "{slug}";
	private String bySlugPath = "/markets/slug/"+slugVar;
	private HttpClient httpClient = HttpClient.newHttpClient();
	private ObjectMapper objectMapper = new ObjectMapper();
	
	public Market getMarketBySlug(String slug) throws IOException, InterruptedException {
		String url = baseUrl + bySlugPath.replace(slugVar, slug);
		log.info("Getting market for slug {}, url {}", slug, url);
		HttpRequest request = HttpRequest
				.newBuilder(URI.create(url))
				.GET()
				.build();
		HttpResponse<InputStream> res = httpClient.send(request, BodyHandlers.ofInputStream());
		return objectMapper.readValue(res.body(), Market.class);
	}
	
	private String byEventSeriesPath = "/events?series_slug={seriesSlug}&end_date_min={minEndDate}&limit={limit}&offset={offset}";
	public List<Event> getBySeriesSlug(String seriesSlug, Instant minEndDateInclusive, int limit, int offset) throws IOException, InterruptedException {
		String path = byEventSeriesPath
				.replace("{seriesSlug}", seriesSlug)
				.replace("{minEndDate}", minEndDateInclusive.toString())
				.replace("{limit}", limit + "")
				.replace("{offset}", offset + "");
		String url = baseUrl + path;
		log.info("Getting markes for events {}", url);
		HttpRequest request = HttpRequest
				.newBuilder(URI.create(url))
				.GET()
				.build();
		HttpResponse<InputStream> res = httpClient.send(request, BodyHandlers.ofInputStream());
		return objectMapper.readValue(res.body(), new TypeReference<List<Event>>() {});
	}
	
	
	
}
