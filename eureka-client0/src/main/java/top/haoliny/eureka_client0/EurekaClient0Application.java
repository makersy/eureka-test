package top.haoliny.eureka_client0;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClient0Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClient0Application.class, args);
    }
}
