/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2120180202.sk01.pbo.ti20192020.pkg3.pkg4.pkg05;

/**
 *
 * @author asus
 */
public class Sk01PBOTI201920203405 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Siti Lutfiatun N
        for (int i = 10; i >= 1; i--) { 
            for (int j = 9; j >= i; j--) { 
                System.out.print(" ");
            }
            for (int k = 0; k <= (i * 2) - 2; k++) { 
                System.out.print("4");
            }
            System.out.println();
        }
    }
    
}
