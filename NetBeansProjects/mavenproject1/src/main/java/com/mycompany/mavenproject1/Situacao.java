/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author senai
 */
public class Situacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
    String s ="s";
    String n ="n";
    String escolha ="";
    
    System.out.println("Esta chovendo S/N?: ");
    escolha=scanner.next();
     
    if(escolha.equals(s)){
        System.out.println("Esta chovendo");
    }else{
        System.out.println("Nao esta chovendo");
    }
    }
    
}
