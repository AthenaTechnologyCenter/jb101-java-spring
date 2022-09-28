package summary;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StudentAthenaImpl implements IStudent {
    @Override
    public List<Student> mockData() {
        return new ArrayList<>() {
            {
                add(new Student(1, "Hieu", "JSP", "0987654321", LocalDate.parse("2000-09-08"), true, List.of(10, 7, 8, 9)));
                add(new Student(2, "Nam", "RJ", "0987654321", LocalDate.parse("2000-09-08"), true, List.of(10, 7, 8, 9)));
                add(new Student(3, "Oanh", "JS", "0987654321", LocalDate.parse("2000-09-08"), true, List.of(10, 7, 8, 9)));
                add(new Student(4, "Minh", "JB", "0987654321", LocalDate.parse("2000-09-08"), true, List.of(1, 1, 4, 6)));
                add(new Student(5, "Thang", "JB", "0987654321", LocalDate.parse("2000-09-08"), true, List.of(3, 4, 7, 8)));
                add(new Student(6, "Giang", "JSP", "0987654321", LocalDate.parse("2000-09-08"), true, List.of(4, 6, 5, 2)));
                add(new Student(7, "Dat", "JB", "0987654321", LocalDate.parse("2000-09-08"), true, List.of(10, 9, 8, 9)));
                add(new Student(8, "Anh", "RJ", "0987654321", LocalDate.parse("2000-09-08"), true, List.of(10, 7, 8, 9)));
                add(new Student(9, "Ha", "JB", "", LocalDate.parse("2000-09-08"), true, List.of(10, 7, 8, 9)));
                add(new Student(9, "Hoa", "JB", "0987654321", LocalDate.parse("2000-09-08"), true, List.of(4, 7, 8, 5)));
                add(new Student(9, "Linh", "AD", "0987654321", LocalDate.parse("2000-09-08"), true, List.of(6, 7, 9, 8)));
                add(new Student(9, "Nhung", "RJ", "0987654321", LocalDate.parse("2000-09-08"), true, List.of(10, 7, 8, 9)));
                add(new Student(9, "Ha", "RN", "", LocalDate.parse("2000-09-08"), true, List.of(10, 7, 8, 9)));
            }
        };
    }

    @Override
    public Map<String, List<Student>> deviceStudentToClass(List<Student> students) {
//        Map<String, List<Student>> athena = new HashMap<>();
//        students.forEach(student -> {
//            List<Student> classStudent = athena.get(student.getCourse());
//            if (classStudent == null) {
//                classStudent = new ArrayList<>() {{
//                    add(student);
//                }};
//            } else {
//                classStudent.add(student);
//            }
//            athena.put(student.getCourse(), classStudent);
//
//        });
        return students.stream()
                .collect(Collectors.groupingBy(Student::getCourse,
                        HashMap::new,
                        Collectors.mapping(Function.identity(), Collectors.toList())));
    }

    @Override
    public Map<String, List<Student>> limitStudentInClass(List<Student> students) {
        var athena = students.stream()
                .collect(Collectors.groupingBy(Student::getCourse,
                        HashMap::new,
                        Collectors.mapping(Function.identity(), Collectors.toList())));
        Map<String, List<Student>> newClass = new HashMap<>();
        athena.forEach((course, studentsInClass) -> {
            newClass.put(course, studentsInClass.stream().limit(2).collect(Collectors.toList()));
        });
        return newClass;
    }

    @Override
    public Map<String, List<Student>> filterStudentIsNotVerify(List<Student> students) {
        return students.stream().filter(Student::getVerify)
                .collect(Collectors.groupingBy(Student::getCourse,
                        HashMap::new,
                        Collectors.mapping(Function.identity(), Collectors.toList())));
    }

    @Override
    public Map<String, List<Student>> filterStudentIsNotPhoneNumber() {
        return null;
    }

    @Override
    public Map<String, List<Student>> filterSt() {
        return null;
    }
}
