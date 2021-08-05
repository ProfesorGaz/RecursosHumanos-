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
public class Departamento {
    int Id;
    String title;
    String location;
    public void getDetails(){
        System.out.println("Id:" +Id);
        System.out.println("titulo:" +title);
        System.out.println("localizacion: " +location);
    }   
}   

