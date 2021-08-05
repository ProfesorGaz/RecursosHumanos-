/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cesba.empleados;

/**
 *
 * @author 52442
 */
public class Empleados {
     int Id;
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    int edad;
    String email;
    double telefono;
    float salario;
    String hiredate;
    public void getDetails(){
        System.out.println("Id:" +Id);
        System.out.println("Nombre:" +nombre);
        System.out.println("Apellido paterno: " +apellidoPaterno);
        System.out.println("Apellido materno : " +apellidoMaterno);
        System.out.println("Age: " +edad);
        System.out.println("Email: " +email);
        System.out.println("Phone Number: " +telefono);
        System.out.println("Salary: " +salario);
        System.out.println("Hire Date: " +hiredate);
    }
}   
