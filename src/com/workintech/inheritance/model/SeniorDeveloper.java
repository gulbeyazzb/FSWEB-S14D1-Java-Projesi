package com.workintech.inheritance.model;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(long id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("Senior developer starts to working");
        setSalary(90000);
    }
}
