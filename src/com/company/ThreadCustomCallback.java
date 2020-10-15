package com.company;

interface Callback {
    void hiloTerminado(Integer resultado);
}

public class ThreadCustomCallback extends Thread {

    Callback miCallback;
    Integer numeroBase;

    public ThreadCustomCallback(Callback miCallback, Integer numeroBase) {
        this.miCallback = miCallback;
        this.numeroBase = numeroBase;
    }

    @Override
    public void run() {
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Mi Id es " + getId() + " y mi Nombre es " + getName());
        Integer resultado =  numeroBase + 1;
        miCallback.hiloTerminado(resultado);
    }

}
