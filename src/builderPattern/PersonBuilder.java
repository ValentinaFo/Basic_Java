package builderPattern;

public class PersonBuilder {
    private String firstName;
    private String lastName;
    private String address;
    private int age;

    public PersonBuilder() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }
    public static PersonBuilder builder(){
        return new PersonBuilder();
    }

    public PersonBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }
    public Person build() {
        return new Person(this);
    }
}
