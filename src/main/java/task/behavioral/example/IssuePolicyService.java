package task.behavioral.example;

import task.behavioral.example.dto.IssuePolicyRequest;
import task.behavioral.example.dto.IssuePolicyResponse;
import task.behavioral.example.process.IssuePolicyProcess;
import task.behavioral.example.strategy.IssueAutoPolicy;
import task.behavioral.example.strategy.IssuePropertyPolicy;

public class IssuePolicyService {

    public IssuePolicyResponse issuePolicy(IssuePolicyRequest request) {
        var issueProcess = new IssuePolicyProcess();
        var response = new IssuePolicyResponse();

        if (request.getVin() != null) {
            issueProcess.setStrategy(new IssueAutoPolicy(request));
            var policy = issueProcess.issuePolicy();
            response.setAutoPolicy(policy);
        }
        if (request.getAddress() != null) {
            issueProcess.setStrategy(new IssuePropertyPolicy(request));
            var policy = issueProcess.issuePolicy();
            response.setPropertyPolicy(policy);
        }

        return response;
    }

}
