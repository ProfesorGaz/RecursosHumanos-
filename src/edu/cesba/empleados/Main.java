/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cesba.empleados;

import javax.swing.JOptionPane;

/**
 *
 * @author 52442
 */
public class Main {
    public static void main(String[] args) {
        Empleados e1 = new Empleados();
        Empleados e2 = new Empleados();
        //
        Departamento d1 = new Departamento ();
        Departamento d2 = new Departamento ();
        //
        Trabajo t1 = new Trabajo ();
        Trabajo t2 = new Trabajo ();
        //
        e1.Id = 1;
        e1.nombre = "Fatima ";
        e1.apellidoPaterno = "Vargas";
        e1.apellidoMaterno = "Silva";
        e1.edad = 21;
        e1.email = "fatima@cesba.mx";
        e1.telefono = 442266022;
        e1.salario = 30000.00f;
        e1.hiredate = "25/02/2021";
        // Empleado 2 //
        e2.Id = 2;
        e2.nombre = "Fernando";
        e2.apellidoPaterno = "Aguilar";
        e2.apellidoMaterno = "Sanchez";
        e2.edad = 33;
        e2.email = "fernando@cesba.mx";
        e2.telefono = 442386707;
        e2.salario = 40000.00f;
        e2.hiredate = "23/05/2021";
        // 
        e1.Id = Integer.parseInt(JOptionPane.showInputDialog("ingresa el Id"));
        e1.nombre = JOptionPane.showInputDialog("Ingresa el nombre ");
        e1.apellidoPaterno = JOptionPane.showInputDialog("Ingrese el Apellido");
        e1.edad = Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad"));
        e1.email = JOptionPane.showInputDialog("Ingresa el correo");
        e1.telefono = Double.parseDouble(JOptionPane.showInputDialog("ingresa el numero de telefono"));
        e1.salario = Float.parseFloat(JOptionPane.showInputDialog("ingresa el salario"));
        e1.hiredate = JOptionPane.showInputDialog("Ingresa la fecha de contratacion");
        //
        e2.Id = Integer.parseInt(JOptionPane.showInputDialog("ingresa el Id"));
        e2.nombre = JOptionPane.showInputDialog("Ingresa el nombre ");
        e2.apellidoPaterno = JOptionPane.showInputDialog("Ingrese el Apellido");
        e2.edad = Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad"));
        e2.email = JOptionPane.showInputDialog("Ingresa el correo");
        e2.telefono = Double.parseDouble(JOptionPane.showInputDialog("ingresa el numero de telefono"));
        e2.salario = Float.parseFloat(JOptionPane.showInputDialog("ingresa el salario"));
        e2.hiredate = JOptionPane.showInputDialog("Ingresa la fecha de contratacion");
        // Departamento
        d1.Id = Integer.parseInt(JOptionPane.showInputDialog("ingresa el Id"));
        d1.title = JOptionPane.showInputDialog("Ingresa su titulo ");
        d1.location = JOptionPane.showInputDialog("Ingrese su locacion");
        //
        d2.Id = Integer.parseInt(JOptionPane.showInputDialog("ingresa el Id"));
        d2.title = JOptionPane.showInputDialog("Ingresa su titulo ");
        d2.location = JOptionPane.showInputDialog("Ingrese su locacion");
        // Trabajo
        t1.Id = Integer.parseInt(JOptionPane.showInputDialog("ingresa el Id"));
        t1.title = JOptionPane.showInputDialog("ingrese su titulo");
        t1.minSalary = JOptionPane.showInputDialog("Salario Minimo");
        t1.maxSalary = JOptionPane.showInputDialog ("Salario Maximo");
        //
        t2.Id = Integer.parseInt(JOptionPane.showInputDialog("ingresa el Id"));
        t2.title = JOptionPane.showInputDialog("ingrese su titulo");
        t2.minSalary = JOptionPane.showInputDialog("Salario Minimo");
        t2.maxSalary = JOptionPane.showInputDialog("Salario Maximo");
        
        
        e1.getDetails();
        System.out.println("--------------");
        e2.getDetails();
        System.out.println("--------------");
        d1.getDetails();
        System.out.println("--------------");
        d2.getDetails();
        System.out.println("--------------");
        t1.getDetails();
        System.out.println("--------------");
        t2.getDetails();

    }
}

