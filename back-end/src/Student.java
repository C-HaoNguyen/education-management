import java.time.LocalDate;

public class Student extends Person implements Action, FestivalEventAction {
    private int studentId;
    private double score;

    public Student() {
    }

    public Student(String firstName) {
        this.firstName = firstName;
    }

    public Student(int studentId, String firstName, String lastName, LocalDate birthday, String address) {
        super(firstName, lastName, birthday, address);
        this.studentId = studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public double getScore() {
        return score;
    }

    // student id, first-last name
    public void printStudentInfo() {
        // only can use when protected
        System.out.println(studentId + "  " + firstName + lastName);
        System.out.println(studentId + "  " + getFirstName() + getLastName());
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("Hello, I am student");
    }

    @Override
    public String getType() {
        return "Sinh viên";
    }

    @Override
    public int getId() {
        return studentId;
    }

    public void displayALlInformation() {
        super.displayAllInformation();
        System.out.println("Điểm tổng kết: " + this.getScore());
    }

    public void updateNewAddress(String address) {
        setInternalAddress(address);
    }

    @Override
    public String getEntertainmentEvent() {
        return "Nhảy dây";
    }

    @Override
    public String getWorkingEvent() {
        return "Làm Bài Tập";
    }

    @Override
    public String getTimeGoToSchool() {
        return "6:30";
    }

    @Override
    public String getPhongVeSinh() {
        return "VS1";
    }

    public String getInfoOfMember() {
        return "Sinh viên " + getFullName() + " " + getAge() + " tuổi tham dự lễ hội.";
    }

    public void updateRank(double score) {
        this.score = score;
    }
}
