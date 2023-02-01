package task.behavioral.example.strategy;

import task.behavioral.example.dto.Policy;

public interface IssueStrategy {

    void dataVerification();
    void requestQuote();
    void issue();

    Policy getPolicy();


}
