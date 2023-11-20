package com.workintech.inheritance.model;

import java.util.Arrays;

public class HRManager extends Employee {

    private JuniorDeveloper[] juniorDeveloper;
    private MidDeveloper[] midDeveloper;
    private SeniorDeveloper[] seniorDeveloper;


    public HRManager(long id, String name, JuniorDeveloper[] juniorDeveloper, MidDeveloper[] midDeveloper, SeniorDeveloper[] seniorDeveloper) {
        super(id, name);
        this.juniorDeveloper = juniorDeveloper;
        this.midDeveloper = midDeveloper;
        this.seniorDeveloper = seniorDeveloper;
    }

    @Override
    public void work() {
        System.out.println("HR manager starts to working");
        setSalary(90000);
    }

    public void addEmployee(int index, JuniorDeveloper name) {

       try {
           if (juniorDeveloper[index] != null) {
               System.out.println("index is full");
           } else if (this.juniorDeveloper[index] == null) {
               juniorDeveloper[index] = name;
           }
       }
       catch (ArrayIndexOutOfBoundsException exception) {
           System.out.println("index not found");
       }

    }

    public void addEmployee(int index, MidDeveloper name) {

      try{

            if (this.midDeveloper[index] != null) {
                System.out.println("index is full");
            } else if (this.midDeveloper[index] == null) {
                this.midDeveloper[index] = name;
            }
        }
      catch (ArrayIndexOutOfBoundsException exception) {
          System.out.println("index not found");
      }
    }

    public void addEmployee(int index, SeniorDeveloper name) {
        try {
            if (this.seniorDeveloper[index] != null) {
                System.out.println("index is full");
            } else if (this.seniorDeveloper[index] == null) {
                this.seniorDeveloper[index] = name;
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("index not found");
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


