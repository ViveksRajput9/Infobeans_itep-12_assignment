
import java.util.Arrays;

class Institution {
    String name;
    String location;

    Institution(String name, String location) {
        this.name = name;
        this.location = location;
    }
    void displayDetails(){
        System.out.println("Institution Name: "+name);
        System.out.println("Institution Location: "+location);
    }
}

class School extends Institution {
    int numOfStudents;
    School(String name, String location,int numOfStudents) {
        super(name, location);
        this.numOfStudents = numOfStudents;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Number of Students: "+numOfStudents);
    }
}

class College extends Institution {
    String[] courseOffered;
    College(String name, String location,String[] courseOffered) {
        super(name, location);
        this.courseOffered = courseOffered;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Course Offered: "+Arrays.toString(courseOffered));
    }
}

class University extends Institution {
    String[] researchPrograms;
    University(String name, String location,String[] researchPrograms) {
        super(name, location);
        this.researchPrograms = researchPrograms;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Research Programs: "+Arrays.toString(researchPrograms));
    }
}

public class InstitudeMain {
    public static void main(String[] args) {
        School school = new School("ABC School", "New York", 1000);
        school.displayDetails();
        College college = new College("XYZ College", "Los Angeles", new String[]{"Bcom","MCA","B.tech","MBA","BCA","BBA"});
        college.displayDetails();
        University university = new University("PQR University", "Chicago", new String[]{"Artificial Intelligence","Human intelligence", "Data Science","Machine Learning"});
        university.displayDetails();
    }
}
