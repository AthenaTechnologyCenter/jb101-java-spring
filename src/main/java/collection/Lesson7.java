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
        ArrayList<String> subStudents = new ArrayList<String>() {
            {
                add("Minh");
                add("Hieu");
                add("Oanh");
            }
        };
        System.out.println(students.containsAll(subStudents));


        int[] arr = new int[]{78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};
        System.out.println("Array elements after sorting:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.println(arr[i]);
        }
    }

}
