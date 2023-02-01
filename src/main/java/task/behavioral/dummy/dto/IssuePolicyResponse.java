package task.behavioral.dummy.dto;

public class IssuePolicyResponse {

    Policy autoPolicy;
    Policy propertyPolicy;

    public Policy getAutoPolicy() {
        return autoPolicy;
    }

    public void setAutoPolicy(Policy autoPolicy) {
        this.autoPolicy = autoPolicy;
    }

    public Policy getPropertyPolicy() {
        return propertyPolicy;
    }

    public void setPropertyPolicy(Policy propertyPolicy) {
        this.propertyPolicy = propertyPolicy;
    }
}
