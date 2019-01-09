/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Sara Omar Badawoud
osa3242@hotmail.com
DCR
Hotel Management System Report
Sunday, October 22th, 2017
*/

package hotelmanagementsystem;

/**
 *
 * @author user
 */

import java.util.Scanner;
public class P11422972Dcr {
    public static void main (String [] args){
    System.out.println("-------------------------------------------------------------------------------");
    System.out.println("-------------------------Hotel Management System ------------------------------");
    System.out.println("Welcome to our Hotel Management System , we can help you to manage your hotel .");
     
    Scanner input = new Scanner (System.in);
    System.out.print("How many floors in your hotel ? ");
    double num1 = input.nextDouble();  
    
    System.out.print("How many rooms in each floor ?  ");
    double num2 = input.nextDouble(); 
   
    System.out.print("How much room cost per day ?    ");
    double num3 = input.nextDouble(); 
    
    System.out.println("How many reserved rooms in : ");
    System.out.print("Thursday :\t");
    double num4 = input.nextDouble(); 
    System.out.print("Friday   :\t"); 
    double num5 = input.nextDouble(); 
    System.out.print("Saturday :\t"); 
    double num6 = input.nextDouble(); 
    
    System.out.println("-------------------------------------------------------------------------------");
    System.out.println("\tYour hotel report is here…");
    
    //total number of rooms in the hotel
    final double TotalRoom = num1*num2 ;
    
    //Number of non-reserved rooms for each day
    double nonR1,nonR2,nonR3 ;
    nonR1=(TotalRoom - num4);
    nonR2=(TotalRoom - num5);
    nonR3=(TotalRoom - num6);
    
    //Incomes for each day
    double income1, income2 ,income3;
    income1 = num3*num4;
    income2 = num3*num5;
    income3 = num3*num6;
    
    //Occupancy in each day
    double res1,res2,res3,occ1 ,occ2 ,occ3 ,sum4;
    occ1=(num4/TotalRoom);
    res1=occ1*100;
    occ2=(num5/TotalRoom);
    res2=occ2*100;
    occ3=(num6/TotalRoom);
    res3=occ3*100;
    sum4=(res1+res2+res3)/3;
    
    //all sum of reserved , nonreserved ,Incomes 
    double sum1 ,sum2 ,sum3  ;
    sum1=(num4+num5+num6);
    sum2=(nonR1+nonR2+nonR3);
    sum3=(income1+income2+income3);
   
   
    
    System.out.printf("Day\t Reserved rooms        Non-reserved rooms         Incomes        Occupancy        \nThursday %-21d %-26d %-14d %-13.2f \nFriday   %-21d %-26d %-14d %-13.2f \nSaturday %-21d %-26d %-14d %-13.2f \n------------------------------------------------------------------------------- \nTotal    %-21d %-26d %-14d %-13.2f"
            ,(int)num4,(int)nonR1,(int)income1,res1,(int)num5,(int)nonR2,(int)income2,res2,(int)num6,(int)nonR3,(int)income3,res3,(int)sum1,(int)sum2,(int)sum3,sum4);
    
       
     System.out.println("\n\nThank you for using our service, Good bye...");
     System.out.println("\n\t\t\t\t\t Printed by Sami");
     System.out.println("------------------------------------------------------------------------------------------------");
             
    

    
    }
}
