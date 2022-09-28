package summary;

import java.time.LocalDate;
import java.util.List;

public class Student {
    private Integer id;
    private String name;
    private String course;
    private String phoneNumber;
    private LocalDate dateOfBirth;
    private Boolean isVerify;
    private List<Integer> score;

    public Student() {
    }

    public Student(Integer id, String name, String course, String phoneNumber, LocalDate dateOfBirth, Boolean isVerify, List<Integer> score) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.isVerify = isVerify;
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public Student setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public String getCourse() {
        return course;
    }

    public Student setCourse(String course) {
        this.course = course;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Student setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Student setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public Boolean getVerify() {
        return isVerify;
    }

    public Student setVerify(Boolean verify) {
        isVerify = verify;
        return this;
    }

    public List<Integer> getScore() {
        return score;
    }

    public Student setScore(List<Integer> score) {
        this.score = score;
        return this;
    }
}
