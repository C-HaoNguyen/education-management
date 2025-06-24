import java.util.Date;

public class Teacher {
    private int teacherId;
    private String firstName;
    private String lastName;
    private Date birthday;
    private int salary;

    public Teacher() {

    }

    public Teacher(int teacherId, String firstName, String lastName) {
        this.teacherId = teacherId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return lastName + " " + firstName;
    }

    public void displayName() {
        System.out.println("Teacher's name is: " + this.getFullName());
    }
}
