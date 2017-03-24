package lunch.finance.psd2.product.client;

import lunch.finance.psd2.product.Product;
import lunch.finance.psd2.product.ProductCache;
import lunch.finance.psd2.product.ProductFeignConfiguration;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@FeignClient(value = "http://product-stub:8010", fallback = ProductCache.class, configuration = ProductFeignConfiguration.class)
public interface ProductClient {

    @RequestMapping(value = "", method = GET)
    Product getProduct();
}
