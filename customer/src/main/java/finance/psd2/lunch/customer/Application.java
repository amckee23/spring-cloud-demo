package finance.psd2.lunch.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
@EnableEurekaClient
public class Application {
    @Value("${HOSTNAME}")
    private String hostname;

    public static void main(String[] args) {
        run(Application.class, args);
    }

    @RestController
    class ServiceInstanceRestController {

        @RequestMapping("/")
        public CustomerWrapper getCustomer() {
            return new CustomerWrapper(hostname, new Customer("Andy", "McKee"));
        }

    }
}
