package videoregistrator;

import java.util.ArrayList;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import controllers.VideoRegistratorController;

@SpringBootApplication
public class Application {
	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String args[]) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner init(VideoRegistratorController videoRepository) {
		return (evt) -> 	
			log.info((new ArrayList<>(Arrays.asList(evt))).toString());
//			Video video = accountRepository.video();
	}

	// @Bean
	// public RestTemplate restTemplate(RestTemplateBuilder builder) {
	// return builder.build();
	// }
	//
	// @Bean
	// public CommandLineRunner run(RestTemplate restTemplate) throws Exception
	// {
	// return args -> {
	// VideoRegistratorController controller = new VideoRegistratorController();
	// Video quote = controller.video();
	//// Video quote =
	// restTemplate.getForObject("http://www.json-generator.com/api/json/get/cpsYgNWMrS?indent=2",
	// Video.class);
	// log.info(quote.toString());
	// };
	// }
}
