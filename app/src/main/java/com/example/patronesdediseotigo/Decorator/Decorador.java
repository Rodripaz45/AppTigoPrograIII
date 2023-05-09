package com.example.patronesdediseotigo.Decorator;

public abstract class Decorador implements Plan{
    protected Plan plan;

    public Decorador(Plan plan){
        this.plan = plan;
    }
    public String getDescripcion(){
        return plan.getDescripcion();
    }

    public double getPrecio() {
        return plan.getPrecio();
    }
    public int getDispositivos(){
        return plan.getDispositivos();
    }
    public int getCanales(){
        return plan.getCanales();
    }
}
