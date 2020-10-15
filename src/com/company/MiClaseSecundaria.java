package com.company;

public class MiClaseSecundaria implements Callback{

    public MiClaseSecundaria(){
        ThreadCustomCallback tCallback = new ThreadCustomCallback(this, 1);
        tCallback.setName("Mi Thread on Callback ");
        tCallback.start();
        System.out.println("Sigo a mis cosas....");
    }

    @Override
    public void hiloTerminado(Integer resultado) {
        System.out.println("Blablabla...");
    }
}
