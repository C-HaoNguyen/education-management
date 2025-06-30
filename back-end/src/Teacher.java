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

    public void displayAllInformation() {
        System.out.println("Thông tin giảng viên:");
        System.out.println("Mã giảng viên: " + this.getTeacherId());
        super.displayAllInformation();
        System.out.println("Lương: " + this.getSalary());
    }
}
