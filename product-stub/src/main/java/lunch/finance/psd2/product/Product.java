package lunch.finance.psd2.product;

import java.math.BigDecimal;
import java.util.Date;

public class Product {

    private String productName;
    private BigDecimal cost;
    private Date updated;

    public Product() {

    }

    public Product(String name, BigDecimal cost, Date updated) {
        this.productName = name;
        this.cost = cost;
        this.updated = updated;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}
