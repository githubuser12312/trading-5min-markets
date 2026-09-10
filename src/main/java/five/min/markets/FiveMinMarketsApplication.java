package five.min.markets;

import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

import jakarta.annotation.PostConstruct;
import net.javacrumbs.shedlock.spring.annotation.EnableSchedulerLock;


@SpringBootApplication
@EnableCaching
public class FiveMinMarketsApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(FiveMinMarketsApplication.class, args);
	}
   
	@PostConstruct
    public void init() {
        // Sets the JVM default timezone to UTC
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }
}
