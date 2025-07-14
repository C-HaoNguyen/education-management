
public class InterfaceExample {

    public static void main(String[] args) {
        Student student = new Student("Dao");
        Teacher teacher = new Teacher("John");

        //In h đi làm của mn
        System.out.println(student.getTimeGoToSchool());
        System.out.println(teacher.getTimeGoToSchool());
    }
}
