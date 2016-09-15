package demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Dave Syer
 */
@SpringBootApplication
@EnableEurekaClient
public class StandaloneClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(StandaloneClientApplication.class, args);
	}

	@Value("${foo}")
	private String foo;

	@PostConstruct
	public void show() {
		System.out.println("foo=" + foo);
	}

}
