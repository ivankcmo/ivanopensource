package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Teacher Ivan = new Teacher(1, "Ivan", 500);
        Teacher Lisa = new Teacher(2, "Lisa", 700);
        Teacher CoronelSanders = new Teacher(3, "CoronelSanders", 600);

        List<Teacher> teacherList = new ArrayList();
        teacherList.add(Ivan);
        teacherList.add(Lisa);
        teacherList.add(CoronelSanders);

        Student tamasha = new Student(1, "Tamasha", 4);
        Student rakshith = new Student(2, "Rakshith Vasudev", 12);
        Student rabbi = new Student(3, "Rabbi", 5);

        List<Student> studentList = new ArrayList();
        studentList.add(tamasha);
        studentList.add(rabbi);
        studentList.add(rakshith);

        School KFCSchool = new School(teacherList, studentList);

        tamasha.payFees(5000);
        rakshith.payFees(6000);
        System.out.println("KFCSchool has earned $" + KFCSchool.getTotalMoneyEarned());
        System.out.println("------Making SCHOOL PAY SALARY----");

        Ivan.receiveSalary(Ivan.getSalary());
        System.out.println("KFCSchool has spent for salary to " + Ivan.getName() + " and now has $" + KFCSchool.getTotalMoneyEarned());

        CoronelSanders.receiveSalary(CoronelSanders.getSalary());
        System.out.println("KFCSchool has spent for salary to " + CoronelSanders.getName() + " and now has $" + KFCSchool.getTotalMoneyEarned());
        System.out.println(rakshith);

        Lisa.receiveSalary(Lisa.getSalary());
        System.out.println(Lisa);
    }
}
