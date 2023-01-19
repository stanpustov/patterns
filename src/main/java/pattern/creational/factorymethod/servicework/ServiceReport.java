package pattern.creational.factorymethod.servicework;

import java.math.BigDecimal;
import java.util.StringJoiner;

public class ServiceReport {

    private final BigDecimal serviceCost;
    private final String serviceResult;

    public ServiceReport(BigDecimal serviceCost, String serviceResult) {
        this.serviceCost = serviceCost;
        this.serviceResult = serviceResult;
    }

    public BigDecimal getServiceCost() {
        return serviceCost;
    }

    public String getServiceResult() {
        return serviceResult;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ServiceReport.class.getSimpleName() + "[", "]")
                .add("serviceCost=" + serviceCost)
                .add("serviceResult='" + serviceResult + "'")
                .toString();
    }
}
