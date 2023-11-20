package com.workintech.inheritance.model;

public class JuniorDeveloper extends Employee {

    public JuniorDeveloper(long id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("Junior developer starts to working");
        setSalary(50000);
    }


}
