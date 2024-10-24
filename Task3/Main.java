package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Student student1 = new Student("Asger", new ArrayList<>());
        student1.passedCourses.add("Maths");
        student1.passedCourses.add("Java 1.0");
        student1.passedCourses.add("Geography");

        Student student2 = new Student("Daniel", new ArrayList<>());
        student1.passedCourses.add("Maths");
        student1.passedCourses.add("Geography");

        Student student3 = new Student("Mariam", new ArrayList<>());
        student1.passedCourses.add("Java 1.0");
        student1.passedCourses.add("History");

        Teacher teacher1 = new Teacher("Signe", new ArrayList<>());
        teacher1.canTeach.add("Maths");
        teacher1.canTeach.add("Java 1.0");
        teacher1.canTeach.add("Geography");

        Teacher teacher2 = new Teacher("Tine", new ArrayList<>());
        teacher2.canTeach.add("Maths");
        teacher2.canTeach.add("Geography");

        Teacher teacher3 = new Teacher("Klaus", new ArrayList<>());
        teacher2.canTeach.add("Java 1.0");
        teacher2.canTeach.add("History");

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(student1);
        persons.add(student2);
        persons.add(student3);
        persons.add(teacher1);
        persons.add(teacher2);
        persons.add(teacher3);

        for (Person s : persons) {
            if (s instanceof Student) {
                if (s.addCourse("Java 1.0")) {
                    System.out.println(s.getName() + " har lært det");
                } else {
                    System.out.println(s.getName() + " har ikke lært det");
                }
            } else if (s instanceof Teacher) {

                Teacher teacher = (Teacher) s;
                if (teacher.addCourse("Java 1.0")) {
                    System.out.println(s.getName() + " kan undervise i det fag");
                } else {
                    System.out.println(s.getName() + " har ikke lært det");
                }
            }
        }

    }
}






