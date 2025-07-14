import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionExample {

    public static void main(String[] args) {
        int budget = 1000;
        // calculate money for each student have to pay
        List<Student> students = new ArrayList<>();
//        students.add(new Student());

//        // C1: check before divide
//        if (students.size() > 0) {
//            int amountOfMoneyEachStudent = budget / students.size();
//            System.out.println("Số tiền học sinh phải đóng: " + amountOfMoneyEachStudent);
//        } else {
//            System.out.println("Lớp không có học sinh");
//        }

        //C2: Catch(bắt) ArithmeticException
//        try {
//            System.out.println("Tính toán tiền quỹ của mỗi học sinh:");
//            int amountOfMoneyEachStudent = budget / students.size();
//            System.out.println("Số tiền học sinh phải đóng: " + amountOfMoneyEachStudent);
//        } catch(ArithmeticException ex) {
//            System.out.println("Lỗi chia cho không/ Không thể tính toán được vì lý do là: " + ex.getMessage());
//        } finally {
//            System.out.println("Kết thúc chương trình");
//        }

        // Ex: NPE
        Student student = null;
        try {
            System.out.println(student.firstName);
        } catch (NullPointerException ex) {
            System.out.println("Student không tồn tại, vui lòng tạo mới");
        }
        System.out.println("Nhập tên của student:");
        Scanner input = new Scanner(System.in);
        String firstName = input.next();
        student = new Student();
        student.setFirstName(firstName);
        System.out.println("Nhập tuổi của student:");
        String age = input.next();

        try {
            Integer ageNumber = Integer.parseInt(age);
            System.out.println("Số tuổi vừa nhập là: " + ageNumber);
        } catch (NumberFormatException ex) {
            System.out.println("Vui lòng nhập số tuổi là number!");
            System.out.println("Nhập tuổi của student:");
            String age2 = input.next();
            Integer ageNumber = Integer.parseInt(age2);
            System.out.println("Số tuổi vừa nhập là: " + ageNumber);
        }

        //Ex: ArrayIndexOutOfBoundsException

        students.add(student);
        try {
            // In tên phần tử đầu tiên
            System.out.println("Tên của học sinh đầu: " + students.get(0).getFirstName());
            // In tên phần tử thứ 2
            System.out.println("Tên của học sinh hai: " + students.get(1).getFirstName());
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Lỗi không tìm thấy thông tin học sinh");
        }
        System.out.println("Đã in thông tin");
    }
}
