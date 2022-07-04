package lambda.project;

public class Person {
    private String name;
    private int age;
    public Person(){}
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int compareByName(Person s1, Person s2) {return s1.getName().compareTo(s2.getName());}

    @Override
    public String toString() {
        return "Person : S" +
                "name = '" + name + '\'' +
                ", age = " + age;
    }
}
