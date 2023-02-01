package task.behavioral.dummy;

import task.behavioral.dummy.dto.IssuePolicyResponse;
import task.behavioral.dummy.dto.IssuePolicyRequest;
import task.behavioral.dummy.process.IssuePolicyProcess;

public class IssuePolicyService {

    public IssuePolicyResponse issuePolicy(IssuePolicyRequest request) {
        var policy = new IssuePolicyProcess().issuePolicy();
        var response = new IssuePolicyResponse();
        response.setAutoPolicy(policy);
        response.setPropertyPolicy(policy);
        return response;
    }

}
