package task.behavioral.example.state;

import task.behavioral.example.dto.Policy;
import task.behavioral.example.dto.PolicyStatus;

abstract public class PolicyState {

    protected Policy policy;
    protected String description;

    PolicyState(Policy policy) {
        this.policy = policy;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    abstract public PolicyStatus getName();

    public void makeDraft() {
        policy.setPolicyState(new DraftPolicyState(policy));
    }

    public void makeVerified() {
        throw new IllegalStateException();
    }

    public void makeQuoted() {
        throw new IllegalStateException();
    }

    public void makeUnderwriting() {
        throw new IllegalStateException();
    }

    public void makeIssued() {
        throw new IllegalStateException();
    }

}
