package com.example.patronesdediseotigo.Decorator;

public class Canales extends Decorador{

    public Canales(Plan plan) {
        super(plan);
    }
    public int getCanales(){
        return super.getCanales() + 20;
    }
    public double getPrecio(){
        return super.getPrecio() + 30;
    }
}
