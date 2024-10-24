package Task3;

import java.util.ArrayList;

public class Student extends Person {


    public Student(String name,ArrayList <String> passedCourses){
        super(name);

    }
    ArrayList <String> passedCourses = new ArrayList<String>();
    ArrayList <String> currentCourses = new ArrayList<String>();




@Override
    boolean addCourse(String course) {
    if(passedCourses.contains(course)){
        return false;
    }
    else{
        currentCourses.add(course);
        return true;
    }


    }
}
