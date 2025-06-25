import java.time.LocalDate;
import java.util.Date;

public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private String address;
    private double score;
    private LocalDate birthday;

    public Student() {

    }

    public Student(int studentId, String firstName, String lastName, String address) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public int getStudentId() {
        return studentId;
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

    public double getScore() {
        return score;
    }
}
