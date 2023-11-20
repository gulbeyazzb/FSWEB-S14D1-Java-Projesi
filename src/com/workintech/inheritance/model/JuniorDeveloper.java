package com.workintech.inheritance.model;

public class JuniorDeveloper extends Employee {
    private String role;

    public JuniorDeveloper(long id, String name, double salary, String role) {
        super(id, name, salary);
        this.role = role;
    }

    @Override
    public void work() {
        System.out.println("Junior developer starts to working");
        setSalary(50000);
    }


}
