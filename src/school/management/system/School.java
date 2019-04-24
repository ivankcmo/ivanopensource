package school.management.system;

/**
 * Many teachers, many students.
 * Implements teachers and students using an ArrayList.
 */

import java.util.List;

public class School {
    private static int totalMoneyEarned;
    private static int totalMoneySpent;
    private List<Teacher> teachers;
    private List<Student> students;

    /**
     * new school object is created.
     * @param teachers list of teachers in the school.
     * @param students list of students in the school.
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }

    /**
     *
     * @return the list of the teachers in the school.
     */
    public List<Teacher> getTeachers() {
        return this.teachers;
    }

    /**
     *adds a teacher to the school.
     * @param teacher the teacher to be added.
     */
    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }
}

