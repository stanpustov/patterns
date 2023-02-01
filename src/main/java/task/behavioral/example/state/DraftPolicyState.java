package task.behavioral.example.state;

import task.behavioral.example.dto.Policy;
import task.behavioral.example.dto.PolicyStatus;

public class DraftPolicyState extends PolicyState {

    public DraftPolicyState(Policy policy) {
        super(policy);
    }

    @Override
    public PolicyStatus getName() {
        return PolicyStatus.Draft;
    }

    @Override
    public void makeVerified() {
        policy.setPolicyState(new VerifiedPolicyState(policy));
    }
}
