package fr.mullerguillaume.gddit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import fr.mullerguillaume.gddit.config.SwaggerConfiguration;
import org.springframework.context.annotation.Import;


@SpringBootApplication
@EnableAsync
@Import(SwaggerConfiguration.class)
public class GudditApplication {

	public static void main(String[] args) {
		SpringApplication.run(GudditApplication.class, args);
	}

}
