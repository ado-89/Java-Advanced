package org.example.one;

public enum Gender {
    MALE("Muski"),FEMALE("Zenski");
    private String name;

    Gender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
