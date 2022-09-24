package collection.homework.util;


public enum Position {
    HR("Human resource"), DEV("Developer"), TESTER("Tester"), RECEPTIONIST("Receptionist"),
    TECH_LEAD("Technical leading"), SALE("sale");

    public String getName() {
        return name;
    }

    private final String name;

    Position(String name) {
        this.name = name;
    }
}
