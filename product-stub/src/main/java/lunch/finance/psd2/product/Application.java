package lunch.finance.psd2.product;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
@EnableDiscoveryClient
public class Application {

    public static void main(String[] args) {
        run(Application.class, args);
    }

    @RestController
    class ServiceInstanceRestController {

        @RequestMapping("/")
        public Product getProduct() {
            return new Product("Product 1", new BigDecimal(22.50), new Date());
        }

    }

}