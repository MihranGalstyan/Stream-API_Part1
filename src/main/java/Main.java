import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Main {
    public static void main(final String[] args) {
        Director director = new Director();
        String result = director.force((number) -> {
            for (int i = 0; i < number; i++) {
                System.out.println("Working...");
            }
            return "finished";
        }, 4);
        System.out.println(result);

        List<Integer> numbers =new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add((int)(Math.random() * 1000));
        }

        List<Integer> filtered = filter(numbers, (num) -> num % 2 == 0);

        for (int i : filtered){
            System.out.println(i);
        }
    }

    public static List<Integer> filter(List<Integer> list, MyPredicate predicate){
        List<Integer> newList = new ArrayList<>();
        for (final int integer : list) {
            if (predicate.test(integer)){
                newList.add(integer);
            }
        }
        return newList;
    }
}
