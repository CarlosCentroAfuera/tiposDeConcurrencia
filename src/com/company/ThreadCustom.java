package com.company;

public class ThreadCustom extends Thread {

    @Override
    public void run() {
        System.out.println("Mi Id es " + getId() + " y mi Nombre es " + getName());
        Integer i = 1;
    }
}
