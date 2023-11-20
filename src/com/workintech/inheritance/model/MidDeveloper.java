package com.workintech.inheritance.model;

public class MidDeveloper extends  Employee{

    public MidDeveloper(long id, String name) {
        super(id, name);
    }


    @Override
    public void work() {
        System.out.println("MidDeveloper starts to working");
        setSalary(70000);
    }


}
