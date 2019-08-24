package spring.znevzz.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EnableSpringCloudEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnableSpringCloudEurekaApplication.class, args);
	}

}
