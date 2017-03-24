package finance.psd2.lunch.customer;

public class CustomerWrapper {
    private String hostname;
    private Customer customer;

    public CustomerWrapper(String hostname, Customer customer) {
        this.hostname = hostname;
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }
}
