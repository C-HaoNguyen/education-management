import java.util.ArrayList;
import java.util.List;

public class ExceptionExample {

    public static void main(String[] args) {
        int budget = 1000;
        // calculate money for each student have to pay
        List<Student> students = new ArrayList<>();

        // C1: check before divide
        if (students.size() > 0) {
            int amountOfMoneyEachStudent = budget / students.size();
            System.out.println("Số tiền học sinh phải đóng: " + amountOfMoneyEachStudent);
        } else {
            System.out.println("Lớp không có học sinh");
        }

        //C2: Catch(bắt) exception
        try {
            int amountOfMoneyEachStudent = budget / students.size();
            System.out.println("Số tiền học sinh phải đóng: " + amountOfMoneyEachStudent);
        } catch(ArithmeticException ex) {
            System.out.println("Lỗi chia cho không/ Không thể tính toán được vì lý do là: " + ex.getMessage());
        }
    }
}
