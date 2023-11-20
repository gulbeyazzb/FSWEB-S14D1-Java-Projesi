package com.workintech.inheritance.model;

public class SeniorDeveloper extends Employee{
    private String role;
    public SeniorDeveloper(long id, String name, double salary,String role) {
        super(id, name, salary);
        this.role=role;
    }

    @Override
    public void work() {
        System.out.println("Senior developer starts to working");
        setSalary(90000);
    }
}
