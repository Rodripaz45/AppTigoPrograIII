package com.example.patronesdediseotigo.Singleton;

public class Singleton {
    private static Singleton instance;
    private String usuario;
    private String password;

    private Singleton(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public static Singleton getInstance(String usuario, String password) {
        if (instance == null) {
            instance = new Singleton(usuario, password);
        }
        return instance;
    }

    // Métodos get/set para usuario y password
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

