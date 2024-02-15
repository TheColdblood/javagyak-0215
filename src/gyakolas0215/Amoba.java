/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gyakolas0215;

import java.util.Scanner;
public class Amoba {
    
    static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("az első jel (x/o): ");
        String elso = sc.nextLine();
        
        final int MERET = 3;
        String[] amoba = new String[MERET*MERET];
        amoba[0] = elso;
        
        for (int i = 1; i < MERET*MERET; i++){
            amoba[i] = Math.random()>.5 ? "x" : "o";
        }
        
         for (int i = 1; i < MERET*MERET; i++){
             
         }
    }
}
