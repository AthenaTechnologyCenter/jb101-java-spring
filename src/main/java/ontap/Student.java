package ontap;

public class Student extends Person {
    private String grade;

    @Override
    public String calculateGrade() {
        return grade;
    }
}
