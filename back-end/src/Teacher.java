import java.time.LocalDate;

public class Teacher extends Person implements Action {
    private int teacherId;
    private int salary;

    public Teacher() {

    }

    public Teacher(String firstName) {
        this.firstName = firstName;
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

    @Override
    public String getTimeGoToSchool() {
        return "7:00";
    }

    @Override
    public String getPhongVeSinh() {
        return "VIP01";
    }

    public void updateAddress(String address) {

    }

    @Override
    public void updateNewAddress(final String address) {
        setInternalAddress(address);
    }

    @Override
    public String getEntertainmentEvent() {
        return "Nhảy múa";
    }

    @Override
    public String getWorkingEvent() {
        return "Giảng dạy";
    }

    public String getInfoOfMember() {
        return "Giáo viên " + getFullName() + " " + getAge() + " tuổi tham dự lễ hội.";
    }
}
