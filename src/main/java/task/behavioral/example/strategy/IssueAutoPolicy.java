package task.behavioral.example.strategy;

import task.behavioral.example.dto.IssuePolicyRequest;
import task.behavioral.example.dto.Policy;
import task.behavioral.example.dto.PolicyType;
import task.behavioral.example.state.QuotedPolicyState;
import task.behavioral.example.state.VerifiedPolicyState;

import java.math.BigDecimal;

public class IssueAutoPolicy implements IssueStrategy {

    private final Policy policy;

    public IssueAutoPolicy(IssuePolicyRequest request) {
        this.policy = new Policy(PolicyType.Auto, request.getContact(), request.getVin());
    }

    @Override
    public void dataVerification() {
        policy.getPolicyState().makeDraft();
        if (policy.getInsuredObject() != null && policy.getInsuredObject().length() == 17) {
            policy.getPolicyState().makeVerified();
        } else {
            policy.getPolicyState().setDescription("Bad data");
        }
    }

    @Override
    public void requestQuote() {
        if (policy.getPolicyState() instanceof VerifiedPolicyState) {
            var premium = new BigDecimal(policy.getInsuredObject()
                    .substring(policy.getInsuredObject().length() - 4)
                    .replaceAll("^\\D", ""));
            policy.setPremium(premium);
            policy.getPolicyState().makeQuoted();
        }
    }

    @Override
    public void issue() {
        if (policy.getPolicyState() instanceof QuotedPolicyState) {
            if (policy.getPremium().compareTo(new BigDecimal(5000)) > 0) {
                policy.getPolicyState().makeUnderwriting();
                policy.getPolicyState().setDescription("Premium increase 5000");
            } else {
                policy.getPolicyState().makeIssued();
            }
        }
    }

    @Override
    public Policy getPolicy() {
        return policy;
    }
}
