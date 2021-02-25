/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numparesimpares55473;

/**
 *
 * @author Denilson
 */
import java.util.Scanner;
public class NumParesImpares55473 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num = 1;
        int pares = 0;
        int impares = 0;
        
        while(num <= 100){
            if(num %2==0){
                pares = num + pares;
            }else{
                impares = num + impares;
            }
            ++num;
        }
        System.out.println("La suma de pares es = " + pares);
        System.out.println("La suma de impares es = " + impares);
    }
    
}
