package summary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Controller {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Collections.sort(students, new StudentCompare());
    }
}
