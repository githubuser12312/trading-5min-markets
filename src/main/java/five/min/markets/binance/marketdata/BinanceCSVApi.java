package five.min.markets.binance.marketdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.LocalDate;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.springframework.stereotype.Component;

import five.min.markets.entity.Period;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class BinanceCSVApi {

	public File getCsvFile(String marketCode, Period period, LocalDate start) throws MalformedURLException, IOException, URISyntaxException {
		InputStream checksumFile = null;
		InputStream zipFileIn = null;
		ZipInputStream zis = null;
		File zipFile = null;
		try {
			CsvDownloanUrl csvDownloanUrl = new CsvDownloanUrl();
			csvDownloanUrl.setCode(marketCode);
			csvDownloanUrl.setDate(start);
			csvDownloanUrl.setTimePeriod(period);
			//checksumFile = new URI(csvDownloanUrl.toCheckSumUrl()).toURL().openStream();
			//File checkSumFile = new File("/tmp/" + UUID.randomUUID().toString() + ".CHECKSUM");
			//checkSumFile.mkdirs();
			//checkSumFile.createNewFile();
			//Files.copy(checksumFile, checkSumFile.toPath(),StandardCopyOption.REPLACE_EXISTING);
			//String checksumFileContents = Files.readString(checkSumFile.toPath());
			zipFileIn = new URI(csvDownloanUrl.toString()).toURL().openStream();
			zipFile = new File("/tmp/" + UUID.randomUUID().toString() + ".zip");
			zipFile.mkdirs();
			zipFile.createNewFile();
			Files.copy(zipFileIn, zipFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
			zis = new ZipInputStream(new FileInputStream(zipFile));
	        ZipEntry zipEntry = zis.getNextEntry();
	        File csvFile = new File("/tmp/"+UUID.randomUUID().toString() + ".csv");
	        Files.copy(zis, csvFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
			return csvFile;
		} catch (Exception e) {
			log.error("Error fetching {}, {}, {} - {}", marketCode, period, start, e.getMessage());
			return null;
		}
		finally {
			//checksumFile.close();
			if(zipFileIn != null) {
				zipFileIn.close();
			}
			if(zis != null) {
				zis.close();
			}
			//checkSumFile.delete();
			if(zipFile != null) {
				zipFile.delete();	
			}
		}
		
	}
	
	public static void main(String... args)  {
		BinanceCSVApi api = new BinanceCSVApi();
		try {
			File csvFile = api.getCsvFile("BTCUSDC", Period.FIVE_MINUTES, LocalDate.of(2026, 4, 14));
			System.out.println(csvFile.getCanonicalPath());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
