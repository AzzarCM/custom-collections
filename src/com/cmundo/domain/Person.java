package com.cmundo.domain;

public class Person implements Comparable<Person> {
    Integer id;
    String name, lastName;
    Integer age;

    public Person(Integer id, String name, String lastName, Integer age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if(id > o.id){
            return 1;
        }else if(id<o.id){
            return -1;
        }else {
            return 0;
        }
    }
}
