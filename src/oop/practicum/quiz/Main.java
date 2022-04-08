/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.practicum.quiz;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double choose1, choose2 = 0, ws, cs, is;
        
        Scanner input = new Scanner(System.in);
        System.out.println("REGISTRATION FORM PT.HORSE");
        System.out.println("1. Android Development\n2. Web Deevelopment");
        System.out.print("Choose Form Type : ");
        choose1 = input.nextInt();
        
        if(choose1 == 1){
            System.out.print("Input NIK : ");
            String nik = input.next();
            System.out.print("Input Name : ");
            String name = input.next();
            System.out.print("Input Writing Exam Score : ");
            ws = input.nextInt();
            System.out.print("Input Coding Test Score : ");
            cs = input.nextInt();
            System.out.print("Input Interview Test Score : ");
            is = input.nextInt();
            
            do{
                System.out.println("\nMenu");
                System.out.println("1. Edit\n2. Output\n3. Exit");
                System.out.print("Choose : ");
                choose2 = input.nextInt();
                if(choose2 == 1){
                    System.out.print("Input Writing Exam Score : ");
                    ws = input.nextInt();
                    System.out.print("Input Coding Test Score : ");
                    cs = input.nextInt();
                    System.out.print("Input Interview Test Score : ");
                    is = input.nextInt();
                }else if(choose2 == 2){
                    System.out.println("Final Score : ");
                    System.out.println("INFRORMATION : ");
                    System.out.println();
                }
            }while(choose2 != 3);
            
        }else if(choose1 == 2){
            System.out.print("Input NIK : ");
            String nik = input.next();
            System.out.print("Input Name : ");
            String name = input.next();
            System.out.print("Input Writing Exam Score : ");
            ws = input.nextInt();
            System.out.print("Input Coding Test Score : ");
            cs = input.nextInt();
            System.out.print("Input Interview Test Score : ");
            is = input.nextInt();
            
            do{
                System.out.println("\nMenu");
                System.out.println("1. Edit\n2. Output\n3. Exit");
                System.out.print("Choose : ");
                choose2 = input.nextInt();
                if(choose2 == 1){
                    System.out.print("Input Writing Exam Score : ");
                    ws = input.nextInt();
                    System.out.print("Input Coding Test Score : ");
                    cs = input.nextInt();
                    System.out.print("Input Interview Test Score : ");
                    is = input.nextInt();
                }else if(choose2 == 2){
                    System.out.println("Final Score : ");
                    System.out.println("INFRORMATION : ");
                    System.out.println();
                }
            }while(choose2 != 3);
        }
    }
    
}
