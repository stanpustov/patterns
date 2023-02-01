package task.behavioral.example.dto;

public class IssuePolicyRequest {

    final String contact;
    final String vin;
    final String address;

    public IssuePolicyRequest(String contact, String vin, String address) {
        this.contact = contact;
        this.vin = vin;
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public String getVin() {
        return vin;
    }

    public String getAddress() {
        return address;
    }
}
