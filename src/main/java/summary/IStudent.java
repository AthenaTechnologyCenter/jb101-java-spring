package summary;

import java.util.List;
import java.util.Map;

public interface IStudent {
    List<Student> mockData();
    Map<String, List<Student>> deviceStudentToClass(List<Student> students);
    Map<String, List<Student>> limitStudentInClass(List<Student> students);
    Map<String, List<Student>> filterStudentIsNotVerify(List<Student> students);
    Map<String, List<Student>> filterStudentIsNotPhoneNumber();
    Map<String, List<Student>> filterSt();
}
