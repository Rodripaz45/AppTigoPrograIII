package com.example.patronesdediseotigo.Decorator;

public class Dispositivos extends Decorador{

    public Dispositivos(Plan plan) {
        super(plan);
    }

    @Override
    public int getDispositivos() {
        return super.getDispositivos() + 1;
    }
    public double getPrecio(){
        return super.getPrecio() + 15;
    }
}
