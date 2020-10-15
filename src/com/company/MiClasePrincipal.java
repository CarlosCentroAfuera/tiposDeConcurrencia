package com.company;



public class MiClasePrincipal implements Callback {

    public MiClasePrincipal(){
        ThreadCustomCallback tCallback = new ThreadCustomCallback(this, 1);
        tCallback.setName("Mi Thread on Callback ");
        tCallback.start();

        System.out.println("Sigo a mis cosas....");
    }

    @Override
    public void hiloTerminado(Integer resultado) {
        System.out.println("Resultado del Callback es : " + resultado);
        hazCosasPrivadas();
    }

    private void hazCosasPrivadas(){
        System.out.println("Hago cosas privadas");

    }
}
