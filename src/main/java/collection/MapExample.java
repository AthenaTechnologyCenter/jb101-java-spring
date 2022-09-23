package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>() {
            {
                add(new Student("10A1", " Minh", 1442));
                add(new Student("10A2", " Nam", 441));
                add(new Student("10A3", " Thang", 133));
                add(new Student("10A1", " Hieu", 121));
                add(new Student("10A1", " Anh", 31));
                add(new Student("10A3", " Giang", 21));
                add(new Student("10A2", " Dat", 11));
                add(new Student("10A1", " Thang", 10));
            }
        };

        /**
         * logic handle map device student to class
         */

        Map<String, List<Student>> school = new HashMap<>();
        students.forEach(student -> {
            List<Student> classStudent = school.get(student.getClassName());
            if (classStudent == null) {
                classStudent = new ArrayList<Student>() {{
                    add(student);
                }};
            } else {
                classStudent.add(student);
            }
            school.put(student.getClassName(), classStudent);

        });


        school.put("10A4", new ArrayList<Student>() {
            {
                add(new Student("10A4", " Minh", 1442));
                add(new Student("10A3", " Nam", 441));
                add(new Student("10A4", " Thang", 133));
                add(new Student("10A4", " Hieu", 121));
                add(new Student("10A4", " Anh", 31));
                add(new Student("10A4", " Giang", 21));
                add(new Student("10A4", " Dat", 11));
                add(new Student("10A4", " Thang", 10));
            }
        });
        System.out.println(school.get("10A4"));
    }
}
