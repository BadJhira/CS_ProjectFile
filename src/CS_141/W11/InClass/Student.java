package CS_141.W11.InClass;

import java.util.ArrayList;

// Doug Gilchrist 12/3/19 [Classes & Objects]
public class Student {
    // properties
    String firstName;
    String lastName;
    int SID;
    double GPA;
    ArrayList<Integer> classIDList = new ArrayList<Integer>();
    ArrayList<String> classNameList = new ArrayList<String>();

    //constructors
    public Student(String firstName, String lastName, int SID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SID = SID;
        this.GPA = 0.0;
    }

    //methods
    public String getName() {
        return this.lastName + ", " + this.firstName;
    }

    public double getGrade() {
        return this.GPA;
    }

    public void getClassList() {
        System.out.println("---Class List---");
        for (int i = 0; i < this.classIDList.size(); i++) {
            System.out.println(this.classNameList.get(i) + ", " + this.classIDList.get(i));
        }
    }

    public void registerClass(String className, int classID) {
        this.classNameList.add(className);
        this.classIDList.add(classID);
    }
}
