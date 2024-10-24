package Task3;

public abstract class Person {
    String name;

    Person(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

     abstract boolean addCourse(String course);


}
