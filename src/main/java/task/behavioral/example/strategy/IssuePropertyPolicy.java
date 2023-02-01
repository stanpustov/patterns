package task.behavioral.example.strategy;

import task.behavioral.example.dto.IssuePolicyRequest;
import task.behavioral.example.dto.Policy;
import task.behavioral.example.dto.PolicyType;
import task.behavioral.example.state.QuotedPolicyState;
import task.behavioral.example.state.VerifiedPolicyState;

import java.math.BigDecimal;

public class IssuePropertyPolicy implements IssueStrategy {

    private final Policy policy;

    public IssuePropertyPolicy(IssuePolicyRequest request) {
        this.policy = new Policy(PolicyType.Property, request.getContact(), request.getAddress());
    }

    @Override
    public void dataVerification() {
        policy.getPolicyState().makeDraft();
        if (policy.getInsuredObject() != null && policy.getInsuredObject().contains("Russia")) {
            policy.getPolicyState().makeVerified();
        } else {
            policy.getPolicyState().setDescription("Bad data");
        }
    }

    @Override
    public void requestQuote() {
        if (policy.getPolicyState() instanceof VerifiedPolicyState) {
            policy.setPremium(new BigDecimal(500));
            policy.getPolicyState().makeQuoted();
        }
    }

    @Override
    public void issue() {
        if (policy.getPolicyState() instanceof QuotedPolicyState) {
            policy.getPolicyState().makeIssued();
        }
    }

    @Override
    public Policy getPolicy() {
        return policy;
    }

}
