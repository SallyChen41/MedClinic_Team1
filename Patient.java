
public class Patient extends Person {

    private String insuranceCompany;
    private String insuranceCardNumber;

    public Patient(String name, String dateOfBirth, String address, String phone, String insuranceCompany, String insuranceCardNumber) {
        super(name, dateOfBirth, address, phone);
        this.insuranceCompany = insuranceCompany;
        this.insuranceCardNumber = insuranceCardNumber;
    }

    public String getInsuranceCompany() {
        return insuranceCompany;
    }
    public String getInsuranceCardNumber() {
        return insuranceCardNumber;
    }


}
