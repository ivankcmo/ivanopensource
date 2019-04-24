package school.management.system;

/**
 * Created by Ivan on 4/24/19.
 * This class is responsible for keeping
 * track of student fees, name, grade & fees paid.
 *
 */
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid = 0;
    private int feesTotal = 30000;

    /**
     * The role of a constructor is to create a new (student)
     * object by initializing the values.
     * Fees for every student is $30,000.
     * Fees paid initially is 0.
     * @param id id for the student: unique.
     * @param name name of the student.
     * @param grade grade of the student.
     */

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    //not going to alter student's name, student's id.

    /**
     * feespaid = 10,000 + 5,000 + 15,000
     * Keep adding the fees to feesPaid Field.
     * Add the fees to the fees paid.
     * The School is going to receive the funds.
     * @param fees the fees that the student pays.
     */
    public void payFees(int fees) {
        this.feesPaid += fees;
        School.updateTotalMoneyEarned(this.feesPaid);
    }

    /**
     * Alt + insert pulls up generate, you can quickly
     * generate getters, setters, constructors, etc...
     * @return
     */
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getGrade() {
        return this.grade;
    }

    /**
     * Used to update the student's grade.
     * @param grade new grade of the student.
     */

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getFeesPaid() {
        return this.feesPaid;
    }

    public int getFeesTotal() {
        return this.feesTotal;
    }

    public int getRemainingFees() {
        return this.feesTotal - this.feesPaid;
    }

    public String toString() {
        return "Student's name :" + this.name + " Total fees paid so far $" + this.feesPaid;
    //print
    }

}
