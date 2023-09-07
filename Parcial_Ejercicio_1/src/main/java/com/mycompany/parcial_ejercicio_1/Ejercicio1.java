/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial_ejercicio_1;

/**
 *
 * @author PREDATOR
 */
class Ejercicio1 {
        String Nombre;
        String Apellido;
        String Lugar;
        String Tipo;
        int DPI;
        int salario_base;
        double porcentaje1;
        double porcentaje2;
        double monto;
        double monto2;
        double monto3;
        double monto4;
        double monto_mensual;
        double monto_total;
        double monto_total2;

    public Ejercicio1(String Nombre, String Apellido) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        
    }

   

    Ejercicio1() {
        
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
 

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getDPI() {
        return DPI;
    }

    public void setDPI(int DPI) {
        this.DPI = DPI;
    }
    
    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }
    
    public int getSalario_base() {
        return salario_base;
    }

    public void setSalario_base(int salario_base) {
        this.salario_base = salario_base;
    }

    public double getPorcentaje1() {
        return porcentaje1;
    }

    public void setPorcentaje1(double porcentaje1) {
        this.porcentaje1 = porcentaje1;
    }

    public double getPorcentaje2() {
        return porcentaje2;
    }

    public void setPorcentaje2(double porcentaje2) {
        this.porcentaje2 = porcentaje2;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getMonto2() {
        return monto2;
    }

    public void setMonto2(double monto2) {
        this.monto2 = monto2;
    }

    public double getMonto3() {
        return monto3;
    }

    public void setMonto3(double monto3) {
        this.monto3 = monto3;
    }

    public double getMonto4() {
        return monto4;
    }

    public void setMonto4(double monto4) {
        this.monto4 = monto4;
    }

    public double getMonto_mensual() {
        return monto_mensual;
    }

    public void setMonto_mensual(double monto_mensual) {
        this.monto_mensual = (monto + monto2 + monto3 +monto4);
    }

    public double getMonto_total() {
        return monto_total;
    }

    public void setMonto_total(double monto_total) {
        this.monto_total = (monto_mensual + (monto_mensual*porcentaje1));
        
    }

    public double getMonto_total2() {
        return monto_total2;
    }

    public void setMonto_total2(double monto_total2) {
        this.monto_total2 = (monto_mensual + (monto_mensual*porcentaje2));
    }
    
}
