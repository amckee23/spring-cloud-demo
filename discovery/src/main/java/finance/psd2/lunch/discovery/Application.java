package finance.psd2.lunch.discovery;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
@EnableEurekaServer
public class Application {
    public static void main(String[] args) {
        run(Application.class, args);
    }
}
