package spring.znevzz.demo;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class EnableSpringBootAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnableSpringBootAdminApplication.class, args);
	}

}
