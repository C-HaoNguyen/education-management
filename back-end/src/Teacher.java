import java.util.Date;

public class Teacher {
    private int teacherID;
    private String firstName;
    private String lastName;
    private Date birthday;

    public Teacher (int teacherID, String firstName, String lastName) {
        this.teacherID = teacherID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public String getFullName() {
        return lastName + " " + firstName;
    }

    public void displayName() {
        System.out.println("Teacher's name is: " + this.getFullName());
    }
}
