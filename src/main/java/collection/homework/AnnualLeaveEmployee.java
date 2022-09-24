package collection.homework;

public class AnnualLeaveEmployee {
    private String name;
    private int annualLeave;

    public AnnualLeaveEmployee() {
    }

    public AnnualLeaveEmployee(String name, int annualLeave) {
        this.name = name;
        this.annualLeave = annualLeave;
    }

    public String getName() {
        return name;
    }

    public AnnualLeaveEmployee setName(String name) {
        this.name = name;
        return this;
    }

    public int getAnnualLeave() {
        return annualLeave;
    }

    public AnnualLeaveEmployee setAnnualLeave(int annualLeave) {
        this.annualLeave = annualLeave;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", annualLeave=" + annualLeave +
                "}\n";
    }
}
