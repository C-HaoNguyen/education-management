public class Student {
    private int studentID;
    private String firstName;
    private String lastName;

    public Student(int studentID, String firstName, String lastName) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getFullName() {
        return lastName + " " + firstName;
    }

    public void displayName() {
        System.out.println(this.getFullName());
    }
}
