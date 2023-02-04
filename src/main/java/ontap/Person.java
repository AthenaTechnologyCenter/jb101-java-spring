package ontap;


public abstract class Person{
    private String name;
    private int age;
    private String address;


    public String getName() {
        return name;
    }

    public abstract String calculateGrade();
}
