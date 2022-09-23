package collection;

import java.util.ArrayList;
import java.util.List;

public class Lesson7 {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Hieu");
        students.add("Minh");
        students.add("Nam");
        students.add("Thang");
        students.add("Cong");
        students.add("Hieu");
        students.add("Hieu");
        System.out.println(students);
        students.remove("Hieu");
        System.out.println("after remove " + students);
//        try {
//            students.remove(-1);
//        } catch (UnsupportedOperationException e) {
//            e.printStackTrace();
//        }
//
//        int input = xxx;
//        if (input < 0) {
//            // bao loi
//        }
//        students.remove(input);
        System.out.println(students.contains("hieu"));
        ArrayList<String> subStudents = new ArrayList<String>(){
            {
                add("Minh");
                add("Hieu");
                add("Oanh");
            }
        };
        System.out.println(students.containsAll(subStudents));


    }

}
