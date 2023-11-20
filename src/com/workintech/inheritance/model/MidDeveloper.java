package com.workintech.inheritance.model;

public class MidDeveloper extends  Employee{

    private String role;
    public MidDeveloper(long id, String name, double salary,String role) {
        super(id, name, salary);
        this.role=role;
    }


    @Override
    public void work() {
        System.out.println("MidDeveloper starts to working");
        setSalary(70000);
    }

    @Override
    public String toString() {
        return "MidDeveloper{" +
                "role='" + role + '\'' +
                '}';
    }
}
