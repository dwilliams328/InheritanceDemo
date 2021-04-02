package com.company;

class Main {
    public static void main(String[] args) {
        Child child = new Child(11);
        Parent parent = new Child(15);

        System.out.println(child.x);
        System.out.println(parent.x);
        System.out.println("\n");
        System.out.println(child.x);
        System.out.println(parent.x);
    }
}

class Parent{
    public int x;
    public Parent(int x) {
        this.x = x;
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent{
    public Child(int x) {
        super(x);
        System.out.println("Child Constructor");
    }
}
