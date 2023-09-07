/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.parcial_ejercicio_1;

import java.util.Scanner;

/**
 *
 * @author PREDATOR
 */
public class Parcial_Ejercicio_1 {

    public static void main(String[] args) {
        Ejercicio1 ejercicio1 = new Ejercicio1();
        Scanner scanner = new Scanner(System.in);//Este lo usé para ingresar datos
        String Nombre = "";
        String Apellido = "";
        String Tipo = "";
        String Lugar = "";
        int DPI;
        int salario_base;
        double porcentaje1 = 0.05;
        double porcentaje2 = 0.03;
        double monto = 0;
        double monto2 = 0;
        double monto3 = 0;
        double monto4 = 0;
        double monto_mensual = 0;
        double monto_total = 0;
        double monto_total2 = 0;
        
        System.out.println("\nIngrese el nombre: ");
        Nombre = scanner.nextLine();
        
        System.out.println("\nIngrese el apellido: ");
        Apellido = scanner.nextLine();
        
        System.out.println("\nIngrese el dpi: ");
        DPI = scanner.nextInt();
        
        System.out.println("\nTiipo de empleado: ");
        Tipo = scanner.nextLine ();
        
        System.out.println("\nIngrese el Lugar de Trabajo: ");
        Lugar = scanner.nextLine();
        
        System.out.println("\nIngrese el salario base: ");
        salario_base = scanner.nextInt();
        
        //Ingreso de montos
         System.out.println("\nIngrese el primer monto: ");
         monto = scanner.nextInt();
         
         System.out.println("\nIngrese el segundo monto: ");
         monto2 = scanner.nextInt();
         
         System.out.println("\nIngrese el tercer monto: ");
         monto3 = scanner.nextInt();
         
         System.out.println("\nIngrese el cuarto monto: ");
         monto4 = scanner.nextInt();
         
         ejercicio1.setNombre(Nombre);
         ejercicio1.setApellido(Apellido);
         ejercicio1.setDPI(DPI);
         ejercicio1.setLugar(Lugar);
         ejercicio1.setMonto(monto);
         ejercicio1.setMonto2(monto2);
         ejercicio1.setMonto3(monto3);
         ejercicio1.setMonto4(monto4);
         ejercicio1.setMonto_mensual(monto_mensual);
         ejercicio1.setMonto_total(monto_total);
         ejercicio1.setPorcentaje1(porcentaje1);
         ejercicio1.setPorcentaje2(porcentaje2);
         ejercicio1.setMonto_total2(monto_total2);
        
         System.out.println("Nombre: " + ejercicio1.getNombre());
         System.out.println("Apellido: " + ejercicio1.getApellido());
         System.out.println("DPI: " + ejercicio1.getNombre());
         System.out.println("Lugar de trabajo: " + ejercicio1.getLugar());
         System.out.println("Salario Base: " + ejercicio1.getSalario_base());
         System.out.println("Salario devengado: " + ejercicio1.getPorcentaje1());
         System.out.println("Salario Líquido a recibir: " + ejercicio1.getPorcentaje2());
         System.out.println("Monto del bono por tipo de empleado: " + ejercicio1.getMonto());
         System.out.println("Monto del bono de ley: " + ejercicio1.getMonto2());
         System.out.println("Monto del isr: " + ejercicio1.getMonto3());
         System.out.println("Monto IGSS: " + ejercicio1.getMonto4());
         
         System.out.println("Total de ingresos: " + ejercicio1.getMonto_mensual());
         
         
         if (ejercicio1.getMonto_mensual() >= 10000){
             System.out.println("Su beneficio es: " + (ejercicio1.getMonto_total() * ejercicio1.getPorcentaje1() + ejercicio1.getMonto_total()));
             System.out.println("Su porcentaje es: " + ejercicio1.getPorcentaje1());
            
         }
         else {
              System.out.println("Su beneficio es: " + ((ejercicio1.getMonto_total2() * ejercicio1.getPorcentaje2())+ ejercicio1.getMonto_total2()));
              System.out.println("Su porcentaje es: " + ejercicio1.getPorcentaje2());
         }
             
        


    }
}

