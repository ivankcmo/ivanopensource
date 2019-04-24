package school.management.system;

/**
 * This class is responsible for keeping track of the teacher's
 * name, id, and salary.
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Creates a new Teacher object.
     * @param id id for the teacher.
     * @param name name of the teacher.
     * @param salary salary of the teacher.
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    /**
     *
     * @return return the id for the teacher.
     */
    public int getId() {
        return this.id;
    }

    /**
     *
     * @return name of the teacher.
     */
    public String getName() {
        return this.name;
    }

    /**
     *
     * @return return the salary of the teacher.
     */
    public int getSalary() {
        return this.salary;
    }

    /**
     * Set (Update) the salary.
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void receiveSalary(int salary) {
        this.salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    public String toString() {
        return "Name of the Teacher: " + this.name + " Total salary earned so far $" + this.salaryEarned;
    }
}
