package com.company;

public class Dog implements Animal
{
    private int age;
    private int size;
    private String name;
    private String ownerName;

    public Dog(int age, int size, String name) {
        this.age = age;
        this.size = size;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public void run() {
        System.out.println("Playing");
    }

    @Override
    public void jump() {
        System.out.println("Jumping");
    }

    @Override
    public void voice() {
        System.out.println("Bark");
    }

    @Override
    public void sleep() {
        System.out.println("ZZZzzz...");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", size=" + size +
                ", name='" + name + '\'' +
                '}';
    }
}