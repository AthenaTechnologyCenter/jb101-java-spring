package collection;

public class Student {
    private String className;
    private String name;
    private int id;

    public Student() {
    }

    public Student(String className, String name, int id) {
        this.className = className;
        this.name = name;
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public Student setClassName(String className) {
        this.className = className;
        return this;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public int getId() {
        return id;
    }

    public Student setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
                "className='" + className + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
