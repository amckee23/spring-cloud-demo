package lunch.finance.psd2.product;

import lunch.finance.psd2.product.client.ProductClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableHystrixDashboard
@EnableFeignClients
public class Application {

    private static final Logger LOG = LoggerFactory.getLogger(Application.class);

    @Autowired
    private ProductClient productClient;

    @Autowired
    private ProductCache productCache;


    public static void main(String[] args) {
        run(Application.class, args);
    }

    @RestController
    class ServiceInstanceRestController {

        @RequestMapping("/")
        public Product getProduct() {
            LOG.info("Returning product");
            final Product product = productClient.getProduct();
            productCache.setProduct(product);
            return product;
        }

    }
}
