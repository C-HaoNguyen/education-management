import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Hao1", "Nguyen", LocalDate.parse("2004-01-06"), "Ho Chi Minh");
        s1.setBirthday(LocalDate.of(2003, 1, 1));
        s1.displayName();

        Student s2 = new Student(2, "Hao2", "Nguyen", LocalDate.parse("2005-01-06"), "Ho Chi Minh");
        s2.setBirthday(LocalDate.of(2003, 6, 1));
        s2.displayName();

        Student s3 = new Student(3, "Hao3", "Nguyen", LocalDate.parse("2006-01-06"), "Ho Chi Minh");
        s3.setBirthday(LocalDate.of(2003, 3, 1));
        s3.displayName();

        // find latest birthday

        List<Student> students = new ArrayList<>();
        students.add(s1);// 0
        students.add(s2);// 1
        students.add(s3);// 2
        LocalDate latestBirth = s1.getBirthday();
        for (int i = 1; i < students.size(); i++) {
            if (students.get(i).getBirthday().isAfter(latestBirth)) {
                latestBirth = students.get(i).getBirthday();
            }
        }
        System.out.println("Ngày sinh trễ nhất là: " + latestBirth.toString());
        s1.introduce();

        Teacher t = new Teacher(1, "A", "Nguuyen Van", LocalDate.parse("1996-01-06"), "Da Nang", 10000000);

        t.introduce();
        t.displayAllInformation();
    }
}