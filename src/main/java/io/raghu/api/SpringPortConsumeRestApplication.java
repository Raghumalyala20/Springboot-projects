package io.raghu.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;


@SpringBootApplication
public class SpringPortConsumeRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPortConsumeRestApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			JSONObject quote = restTemplate.getForObject("http://localhost:8080/getPort/1236783",JSONObject.class);
			System.out.println(new JSONParser().parse(quote.toString()));
			
		};
	}

}
