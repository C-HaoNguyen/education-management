import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CollectionExample {
    public static void main(String[] args) {
        // lưu danh sach có thứ tự
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Dao"));// i = 0
        studentList.add(new Student("Huy"));// i = 1
        studentList.add(new Student("Hao")); // i = 2
        // Truy cập bằng cách: studentList.get(i)
        studentList.get(0);

        HashSet<Student> studentSet = new HashSet<>();
        studentSet.add(new Student("Dao"));
        studentSet.add(new Student("Huy"));
        studentSet.add(new Student("Hao"));
        studentSet.add(new Student("Hung"));

//        while (studentSet.iterator().hasNext()) {
//            final Student st1 = studentSet.iterator().next();
//            System.out.println(st1.getFirstName());
//        }

        Map<Long, String> nameStudenByStudentIdMap = new HashMap<>();
        nameStudenByStudentIdMap.put(1L, "Dao");
        nameStudenByStudentIdMap.put(2L, "Hao");
        nameStudenByStudentIdMap.put(3L, "Huy");
        // In tên của student có ID = 2
        System.out.println(nameStudenByStudentIdMap.get(2L));
    }
}
