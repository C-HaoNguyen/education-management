import java.time.LocalDate;

public class Person {
    protected String firstName;
    protected String lastName;
    private LocalDate birthday;
    private String address;

    public Person() {
    }

    public Person(String firstName, String lastName, LocalDate birthday, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return lastName + " " + firstName;
    }

    public void displayName() {
        System.out.println(this.getFullName());
    }

    public void setBirthday(LocalDate date) {
        this.birthday = date;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void introduce() {
        System.out.println("Hello I am person");
    }

    public void displayAllInformation() {
        System.out.println("Họ và tên: " + this.getLastName() + " " + this.getFirstName());
        System.out.println("Địa chỉ " + address);
        System.out.println("Ngày sinh: " + birthday);
    }
}
