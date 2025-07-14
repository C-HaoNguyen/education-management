import java.util.Scanner;

public class InterfaceExample {

    public static void main(String[] args) {
        Student student = new Student("Dao");
        Teacher teacher = new Teacher("John");

        //In h đi làm của mn
        System.out.println(student.getTimeGoToSchool());
        System.out.println(teacher.getTimeGoToSchool());

        //Update address for student, teacher
        updateAddressForPerson(student);
        updateAddressForPerson(teacher);


        //In thông tin giải trí, học tập của hs, gv
        inThongTinGiaiTriHocTap(student);
        inThongTinGiaiTriHocTap(teacher);
    }

    public static void inThongTinGiaiTriHocTap(SchoolAction schoolAction) {
        System.out.println("Hoạt động giải trí là:" + schoolAction.getEntertainmentEvent());
        System.out.println("Hoạt động học tap là:" + schoolAction.getWorkingEvent());

    }

    public static void updateAddressForPerson(Person person) {
        System.out.println("Nhập địa chỉ:");
        Scanner input = new Scanner(System.in);
        String address = input.next();
        person.updateNewAddress(address);
        System.out.println("Thông tin địa chỉ vua nhap: " + person.getAddress());
    }
}
