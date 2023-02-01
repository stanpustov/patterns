package task.behavioral.example.state;

import task.behavioral.example.dto.Policy;
import task.behavioral.example.dto.PolicyStatus;

public class VerifiedPolicyState extends PolicyState {

    VerifiedPolicyState(Policy policy) {
        super(policy);
    }

    @Override
    public PolicyStatus getName() {
        return PolicyStatus.Verified;
    }

    @Override
    public void makeQuoted() {
        policy.setPolicyState(new QuotedPolicyState(policy));
    }
}
