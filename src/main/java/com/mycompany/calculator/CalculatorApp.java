/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculator;

import java.util.Scanner;

/**
 *
 * @author 5im15juroesch
 */
public class CalculatorApp{
    
    public static void main(String[] args) {
        Calculator c = new Calculator();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Bitte geben Sie eine Zhal ein: ");
        String input = scan.nextLine();
        int eingabe1 = Integer.parseInt(input);
        System.out.println("Bitte geben Sie eine Zhal ein: ");
        input = scan.nextLine();
        int eingabe2 = Integer.parseInt(input);
        System.out.println(c.addition(eingabe1,eingabe2));
        
    }
    
}
