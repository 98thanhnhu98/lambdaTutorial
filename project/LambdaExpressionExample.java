package lambda.project;

import java.util.ArrayList;
import java.util.Comparator;

public class LambdaExpressionExample {
    public void example(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(15);
        numbers.add(5);
        numbers.add(3);
        numbers.add(7);
        numbers.add(9);
        numbers.add(10);
        numbers.add(6);
        numbers.add(11);
        numbers.add(18);

        // use for each printf list Integer
        System.out.println("use for each printf list Integer :");
        for (Integer integer : numbers){
            System.out.println(integer);
        }

        // use lambda printf list Integer
        System.out.println("use lambda printf list Integer :");
        numbers.forEach((number) ->{
            System.out.println(number);});

        //soft list with comparator
        System.out.println("soft list with comparator :");
        numbers.sort(new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

        //soft list with lambda
        System.out.println("soft list with lambda :");
        numbers.sort((Integer num1,Integer num2) ->{
            return num1-num2;
        });
        System.out.println("Sort List:");
        numbers.forEach((number) -> {
            System.out.println(number);
        });

    }
}
