package javaapplication36;

import java.util.Scanner;

public class NewClass2 {
    
    public static void main(String[] args){
      
        Scanner input = new Scanner(System.in);
        double inch = input.nextInt();
        double meters = inch * 0.0254;
        System.out.println(inch +  "inch is " + meters);
    }
    
}
