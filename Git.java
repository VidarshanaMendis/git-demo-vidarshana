/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git;


import java.util.Scanner;

/**
 *
 * @author Vidarshana Mendis
 */
public class Git {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        int b;
        String operation;
        int answer;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to my calculator");
        System.out.println("Enter first num: ");
        a = scanner.nextInt();
        System.out.println("Enter second num: ");
        b = scanner.nextInt();
        System.out.println("Enter oparation: ");
        operation = scanner.next();
        
        if("+".equals(operation)){
            answer= add(a,b);
            System.out.println("Answer is: "+ answer);
        
    }
        else{
            System.out.println("Unsupported");
        }
        
        
        
        
        
    }
    private static int add(int a,int b){
        return a+b;
    }
    
}
