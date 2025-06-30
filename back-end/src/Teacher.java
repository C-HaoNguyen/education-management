import java.sql.SQLOutput;
import java.util.Date;

public class Teacher extends Person {
    private int teacherId;
    private int salary;

    public Teacher() {

    }

    public Teacher(int teacherId, String firstName, String lastName, String address) {
        super(firstName, lastName, address);
        this.teacherId = teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void introduce() {
        System.out.println("I'm a teacher");
    }
}
