/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplicationcalculator;

import java.awt.SystemColor;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
/**
 *
 * @author mig
 */
public class JavaApplicationCalculator {
    //Notas :Double.parseDouble(scanner.next().trim());
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
       
        System.out.print("Aantal geld wat jy wil bele ? : ");
        double geld = Double.parseDouble(scanner.next().trim());
        
        System.out.print("% Maandelikse Rente? : ");
        double rente = Double.parseDouble(scanner.next().trim());
        rente = rente/100; 
        rente = rente/12;
        
        System.out.print("Vir hoeveel jaar wil jy bele? : ");
        double aantalBetalings = Double.parseDouble(scanner.next().trim());
        aantalBetalings = aantalBetalings*12;
        
        
        double totaalMaandelikseRente = geld *(rente * Math.pow(1 + rente , aantalBetalings))
                                                  /(Math.pow(1+ rente, aantalBetalings)-1);
        
        
       //NumberFormat maandeliksePaaiementFormatted = NumberFormat.getCurrencyInstance();
       System.out.println("");
       
       System.out.println("Jou maandelikse paaiement is R"+ (totaalMaandelikseRente));
        
       System.out.println("");
        
        
        
        
       System.out.println("Die geld inbetaal is: " + geld);                      //{Toets of my variables reg uitwerk
       System.out.println("Die rente op jou geld is: " + rente);
       System.out.println("Die aantal keer wat jy moet betaal is: " + aantalBetalings);
        
        
        
        
        
        
       // System.out.println();
        
    }   
    
}
