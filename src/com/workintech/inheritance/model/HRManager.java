package com.workintech.inheritance.model;

import java.util.Arrays;

public class HRManager extends Employee {

    private String[] juniorDeveloper;
    private String[] midDeveloper;
    private String[] seniorDeveloper;


    public HRManager(long id, String name, double salary, String[] juniorDeveloper, String[] midDeveloper, String[] seniorDeveloper) {
        super(id, name, salary);
        this.juniorDeveloper = juniorDeveloper;
        this.midDeveloper = midDeveloper;
        this.seniorDeveloper = seniorDeveloper;
    }

    @Override
    public void work() {
        System.out.println("HR manager starts to working");
        setSalary(90000);
    }

    public void addEmployee(int index, String name, String role) {

        if (role.equals("junior")) {
            if (index >= juniorDeveloper.length) {
                System.out.println("index is greater than length of the array");
            } else {
                for (int i = 0; i < juniorDeveloper.length; i++) {
                    if (this.juniorDeveloper[index] != null) {
                        System.out.println("index is full");
                    } else if (this.juniorDeveloper[index] == null) {
                        this.juniorDeveloper[index] = name;
                    }
                }
            }
        }

        else if (role.equals("mid")) {
            if (index >= midDeveloper.length) {
                System.out.println("index is greater than length of the array");
            } else {
                for (int i = 0; i < midDeveloper.length; i++) {
                    if (this.midDeveloper[index] != null) {
                        System.out.println("index is full");
                    } else if (this.midDeveloper[index] == null) {
                        this.midDeveloper[index] = name;
                    }
                }
            }
        }


        else if (role.equals("senior")) {
            if (index >= seniorDeveloper.length) {
                System.out.println("index is greater than length of the array");
            } else {
                for (int i = 0; i < seniorDeveloper.length; i++) {
                    if (this.seniorDeveloper[index] != null) {
                        System.out.println("index is full");
                    } else if (this.seniorDeveloper[index] == null) {
                        this.seniorDeveloper[index] = name;
                    }
                }
            }
        }

    }

    @Override
    public String toString() {
        return "HRManager{" +
                "juniorDeveloper=" + Arrays.toString(juniorDeveloper) +
                ", midDeveloper=" + Arrays.toString(midDeveloper) +
                ", seniorDeveloper=" + Arrays.toString(seniorDeveloper) +
                '}';
    }
}


