import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Date;

public class Teacher extends Person {
    private int teacherId;
    private int salary;

    public Teacher() {

    }

    public Teacher(int teacherId, String firstName, String lastName, LocalDate birthday, String address, int salary) {
        super(firstName, lastName, birthday, address);
        this.teacherId = teacherId;
        this.salary = salary;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void introduce() {
        System.out.println("I'm a teacher");
    }

    @Override
    public String getType() {
        return "giảng viên";
    }

    @Override
    public int getId() {
        return teacherId;
    }

    public void displayAllInformation() {
        super.displayAllInformation();
        System.out.println("Lương: " + this.getSalary());
    }
}
