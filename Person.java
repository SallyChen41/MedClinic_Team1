
public abstract class Person {
    
    private final String name;
    private final String dateOfBirth;
    private final String address;
    private final String phone;

    public Person(String name, String dateOfBirth, String address, String phone) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }

}
