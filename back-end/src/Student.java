public class Student extends Person {
    private int studentId;
    private double score;

    public Student() {
    }

    public Student(int studentId, String firstName, String lastName, String address) {
        super(firstName, lastName, address);
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
}
