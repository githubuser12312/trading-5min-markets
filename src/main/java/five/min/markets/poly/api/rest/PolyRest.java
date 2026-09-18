package five.min.markets.poly.api.rest;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

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
	
	
	
	
}
