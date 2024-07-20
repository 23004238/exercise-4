/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examgrades;

import java.util.Scanner;

/**
 *
 * @author kazmo
 */
public class ExamGrades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
                System.out.println("Enter a grade:");
                int marks = scan.nextInt();
                if (marks>=80 && marks<=100){
                    System.out.println("Out Standing");
                } else if (marks>=70 && marks<=79){
                    System.out.println("Meritorious achievement");
                } else if (marks>=60 && marks<=69){
                    System.out.println("Substantial achievement");
                } else if (marks>=50 && marks<=59){
                    System.out.println("Moderate achievement");
                } else if (marks>=40 && marks<=49){
                    System.out.println("Adequate achievement");
                } else if (marks>=30 && marks<=39){
                    System.out.println("Elementary achievement");
                } else if (marks>=0 && marks<=29){
                    System.out.println("Not achievement");
                }
    }
    
}
