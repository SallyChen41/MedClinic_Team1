
public class Doctor extends Person{

    private String specialty;
    private String idNumber;

    public Doctor(String name, String dateOfBirth, String address, String phone, String specialty, String idNumber) {
        super(name, dateOfBirth, address, phone);
        this.specialty = specialty;
        this.idNumber = idNumber;
    }
    
    public String getSpecialty() {
        return specialty;
    }
    public String getIdNumber() {
        return idNumber;
    }

}
