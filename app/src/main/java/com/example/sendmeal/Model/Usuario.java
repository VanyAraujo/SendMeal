package com.example.sendmeal.Model;

public class Usuario {
    private int id;
    private String nombre;
    private String clave;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    private String email;
    private Double credito;
    private Tarjeta tarjeta;
    private CuentaBancaria cuentaBancaria;

    public Usuario(int id, String nombre, String clave, String email, Double credito, Tarjeta tarjeta, CuentaBancaria cuentaBancaria) {
        this.id = id;
        this.nombre = nombre;
        this.clave = clave;
        this.email = email;
        this.credito = credito;
        this.tarjeta = tarjeta;
        this.cuentaBancaria = cuentaBancaria;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public String getEmail() {
        return email;
    }

    public Double getCredito() {
        return credito;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }
}