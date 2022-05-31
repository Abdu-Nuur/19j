package com.company;

public class People {
    private String name;
    private int age;
    private String person;

    public People(String name, int age, String person) {
        this.name = name;
        this.age = age;
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "People " +
                "name = " + name +
                " age = " + age +
                " person = " + person +
                '\n';
    }
}
