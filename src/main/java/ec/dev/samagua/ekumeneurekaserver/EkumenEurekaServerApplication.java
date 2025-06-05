package ec.dev.samagua.ekumeneurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EkumenEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EkumenEurekaServerApplication.class, args);
    }

}
