package task.behavioral.example.dto;

import task.behavioral.example.state.DraftPolicyState;
import task.behavioral.example.state.PolicyState;

import java.math.BigDecimal;

public class Policy {

    private final PolicyType policyType;
    private final String insured;
    private final String insuredObject;
    private BigDecimal premium;

    PolicyState policyState;

    public Policy(PolicyType policyType, String insured, String insuredObject) {
        this.policyType = policyType;
        this.insured = insured;
        this.insuredObject = insuredObject;
        this.policyState = new DraftPolicyState(this);
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
        return policyState.getName();
    }

    // ----------------------------------------------

    public PolicyState getPolicyState() {
        return policyState;
    }

    public void setPolicyState(PolicyState policyState) {
        this.policyState = policyState;
    }
}
