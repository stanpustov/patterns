package task.behavioral.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import task.behavioral.example.dto.IssuePolicyRequest;
import task.behavioral.example.dto.PolicyStatus;
import task.behavioral.example.dto.PolicyType;

import static org.junit.jupiter.api.Assertions.*;

class IssuePolicyServiceTest {

    private final String CONTACT_NAME = "Ivanov I. I.";
    private final String VIN_OK = "ZFA22300005555000";
    private final String ADDRESS = "Russia, Moscow";

    @Test
    void issueSingleAutoPolicy_Issued() {
        var request = new IssuePolicyRequest(CONTACT_NAME, VIN_OK, null);
        var response = new IssuePolicyService().issuePolicy(request);
        assertNotNull(response.getAutoPolicy());
        Assertions.assertEquals(PolicyType.Auto, response.getAutoPolicy().getPolicyType());
        assertEquals(PolicyStatus.Issued, response.getAutoPolicy().getPolicyStatus());
    }

    @Test
    void issueSingleAutoPolicy_Draft() {
        var request = new IssuePolicyRequest(CONTACT_NAME, "0000", null);
        var response = new IssuePolicyService().issuePolicy(request);
        assertNotNull(response.getAutoPolicy());
        assertEquals(PolicyStatus.Draft, response.getAutoPolicy().getPolicyStatus());
    }

    @Test
    void issueSingleAutoPolicy_Underwriting() {
        var request = new IssuePolicyRequest(CONTACT_NAME, "ZFA22300005555001", null);
        var response = new IssuePolicyService().issuePolicy(request);
        assertNotNull(response.getAutoPolicy());
        assertEquals(PolicyStatus.Underwriting, response.getAutoPolicy().getPolicyStatus());
    }

    @Test
    void issueSinglePropertyPolicy_Issued() {
        var request = new IssuePolicyRequest(CONTACT_NAME, null, ADDRESS);
        var response = new IssuePolicyService().issuePolicy(request);
        assertNotNull(response.getPropertyPolicy());
        Assertions.assertEquals(PolicyType.Property, response.getPropertyPolicy().getPolicyType());
        assertEquals(PolicyStatus.Issued, response.getPropertyPolicy().getPolicyStatus());
    }

    @Test
    void issueOneAutoAndOnePropertyPolicy_Issued() {
        var request = new IssuePolicyRequest(CONTACT_NAME, VIN_OK, ADDRESS);
        var response = new IssuePolicyService().issuePolicy(request);
        Assertions.assertNotNull(response.getAutoPolicy(), "Auto Policy not found");
        assertEquals(PolicyStatus.Issued, response.getAutoPolicy().getPolicyStatus());
        Assertions.assertNotNull(response.getPropertyPolicy(), "Auto Policy not found");
        assertEquals(PolicyStatus.Issued, response.getPropertyPolicy().getPolicyStatus());
    }

}