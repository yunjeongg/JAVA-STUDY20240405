package day08.static_.quiz1;

public class Department {

    private String departmentName; // 학과명
    private int studentCount; // 학과 학생 수
    private static int totalStudents; // 학교의 총 학생 수

    public Department(String departmentName, int initCount) {
        this.departmentName = departmentName;
        this.studentCount = initCount;
        totalStudents += initCount;
    }

    public void addStudent(int number) {
        this.studentCount += number;
        totalStudents += number;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }
}
