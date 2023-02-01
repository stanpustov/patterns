package task.behavioral.example.state;

import task.behavioral.example.dto.Policy;
import task.behavioral.example.dto.PolicyStatus;

public class UnderwritingPolicyState extends PolicyState {

    UnderwritingPolicyState(Policy policy) {
        super(policy);
    }

    @Override
    public PolicyStatus getName() {
        return PolicyStatus.Underwriting;
    }

    @Override
    public void makeIssued() {
        policy.setPolicyState(new IssuedPolicyState(policy));
    }

}
