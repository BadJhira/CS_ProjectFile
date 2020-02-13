package CS_141.W11.InClass;
// Doug Gilchrist 12/3/19 [Classes & Objects]
public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("Mary", "Jane", 91535364);
        student1.registerClass("Physics 101", 7173);
        student1.registerClass("English 201", 6543);
        student1.registerClass("Math 153", 7171);
        student1.GPA = 3.7;

        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student ID: " + student1.SID);
        System.out.printf("Student GPA: %.1f\n", student1.getGrade());
        student1.getClassList();
    }
}
