package task.behavioral.dummy.dto;

import java.math.BigDecimal;

public class Policy {

    private final PolicyType policyType;
    private final String insured;
    private final String insuredObject;
    private BigDecimal premium;

    public Policy(PolicyType policyType, String insured, String insuredObject) {
        this.policyType = policyType;
        this.insured = insured;
        this.insuredObject = insuredObject;
    }

    public PolicyType getPolicyType() {
        return policyType;
    }

    public String getInsured() {
        return insured;
    }

    public String getInsuredObject() {
        return insuredObject;
    }

    public void setPremium(BigDecimal premium) {
        this.premium = premium;
    }

    public BigDecimal getPremium() {
        return premium;
    }

    public PolicyStatus getPolicyStatus() {
        return null;
    }

}
