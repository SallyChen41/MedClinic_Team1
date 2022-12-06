
public abstract class Person {
    
    private final String name;
    private final String dateOfBirth;

    public Person(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return String.format("%sName: %s%n, Date of Birth: ", getName(), getDateOfBirth());
    }

}
