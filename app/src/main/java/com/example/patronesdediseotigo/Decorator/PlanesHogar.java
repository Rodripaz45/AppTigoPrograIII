package com.example.patronesdediseotigo.Decorator;

public class PlanesHogar implements Plan{
    String descripcion;
    double precio;
    int dispositivos = 2;
    int canales;

    public PlanesHogar(String descripcion, double precio, int canales) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.canales = canales;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    public int getDispositivos() {
        return dispositivos;
    }

    @Override
    public int getCanales() {
        return canales;
    }
}
