package task.behavioral.example.state;

import task.behavioral.example.dto.Policy;
import task.behavioral.example.dto.PolicyStatus;

public class QuotedPolicyState extends PolicyState {

    QuotedPolicyState(Policy policy) {
        super(policy);
    }

    @Override
    public PolicyStatus getName() {
        return PolicyStatus.Quoted;
    }

    @Override
    public void makeUnderwriting() {
        policy.setPolicyState(new UnderwritingPolicyState(policy));
    }

    @Override
    public void makeIssued() {
        policy.setPolicyState(new IssuedPolicyState(policy));
    }
}
