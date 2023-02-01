package task.behavioral.example.process;

import task.behavioral.example.dto.Policy;
import task.behavioral.example.strategy.IssueStrategy;

public class IssuePolicyProcess {

    private IssueStrategy strategy;

    public void setStrategy(IssueStrategy strategy) {
        this.strategy = strategy;
    }

    public Policy issuePolicy() {
        strategy.dataVerification();
        strategy.requestQuote();
        strategy.issue();

        return strategy.getPolicy();
    }
}
