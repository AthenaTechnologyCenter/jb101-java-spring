package collection.homework.util;

public enum Department {

    HCNS("Hành chính nhân sư"), CSKH("Chăm sóc khách hàng"), SALE("kinh doanh"), BOD("ban điều hành"), PRODUCT("Phòng sản xuất");

    private final String name;

    Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
