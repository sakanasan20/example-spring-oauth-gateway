package tw.niq.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ExampleSpringOauthGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleSpringOauthGatewayApplication.class, args);
	}

}
