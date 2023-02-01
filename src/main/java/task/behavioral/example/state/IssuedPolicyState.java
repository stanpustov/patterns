package task.behavioral.example.state;

import task.behavioral.example.dto.Policy;
import task.behavioral.example.dto.PolicyStatus;

public class IssuedPolicyState extends PolicyState {

    IssuedPolicyState(Policy policy) {
        super(policy);
    }

    @Override
    public PolicyStatus getName() {
        return PolicyStatus.Issued;
    }

    @Override
    public void makeDraft() {
        throw new IllegalStateException();
    }


}
