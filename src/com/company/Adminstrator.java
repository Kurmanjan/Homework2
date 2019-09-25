package com.company;

import com.Person;

public class Adminstrator extends Person implements Printable  {
    private int mSalary;
    public Adminstrator(String name, String address) {
        super(name, address);
        mSalary = 3000;
    }

    @Override
    public String print() {
        System.out.println(mSalary + "You are salary");
        return "Заработная плата" + mSalary;

    }
}
