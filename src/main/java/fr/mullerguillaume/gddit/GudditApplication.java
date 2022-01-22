package fr.mullerguillaume.gddit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class GudditApplication {

	public static void main(String[] args) {
		SpringApplication.run(GudditApplication.class, args);
	}

}
