package model;

public enum AccessNation {
    KR("한국"),
    EN("미국"),
    JP("일본"),
    RU("러시아");

    private final String name;

    AccessNation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
