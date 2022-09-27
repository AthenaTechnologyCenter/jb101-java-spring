package lambda;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public static void main(String[] args) {
        IPerson<List<Person>> people = (p1, p2) -> new ArrayList<>() {
            {
                add(p1);
                add(p2);
            }
        };

        System.out.println(people.apply(new Person("Oanh", 27), new Person("Minh", 25)));
    }
}
