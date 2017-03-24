package lunch.finance.psd2.product;

import lunch.finance.psd2.product.client.ProductClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ProductCache implements ProductClient {
    private static final Logger LOG = LoggerFactory.getLogger(ProductCache.class);
    private Product product;

    @Override
    public Product getProduct() {
        LOG.info("Error finding product using cached product");
        if (null != product) {
            return product;
        }
        return new Product();
    }

    public void setProduct(final Product product) {
        this.product = product;
    }
}
