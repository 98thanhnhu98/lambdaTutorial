package lambda.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Application {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Khoi",35));
        persons.add(new Person("Minh",20));
        persons.add(new Person("Viet Anh",18));
        persons.add(new Person("Hoang",40));
        persons.add(new Person("Ngoc",30));
        persons.add(new Person("My",30));

        show(persons);

        // use Comparator
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        //use lambda
        Collections.sort(persons,(((o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        })));

        //use lambda to sort by Name with method compareByName
        Collections.sort(persons,(((o1, o2) -> Person.compareByName(o1,o2))));
        show(persons);

        //List people over 30 years old . Not use lambda
        System.out.println("List people over 30 years old : ");
        for (Person person:persons){
            if (person.getAge() > 30){
                System.out.println(person);
            }
        }


        // List people over 30 years old .  Use lambda
        System.out.println("List people over 30 years old : ");
        persons.stream().filter(person -> person.getAge() > 30)
                .forEach(person -> System.out.println(person));
    }

    private static void show(ArrayList<Person> persons) {
        persons.forEach(person -> System.out.println(person));
    }
}
