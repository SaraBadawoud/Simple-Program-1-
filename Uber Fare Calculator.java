/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;
/*
Sara Omar Badawoud
osa3242@hotmail.com

Uber Fare Calculator 
Thursday, November 30, 2017
*/
/**
 *
 * @author user
 */
import java.util.Scanner;
public class NewClass {
public static void main (String[]args){
final double BaseFare = 3.2 ; //UberX 
final double CostPerMinute = 0.25 ; //UberX 
final double CostPerKm = 0.9 ; //UberX 
final double ServiceFee = 0 ; //UberX 
final double CancellationFee =8; //UberX 
final double MinimumFee = 8 ; //UberX 
int  FareInfo =0 ;//UberX 
int  FareEst=0;//UberX 
int  SubmittedRatings=0;//UberX 

final double BaseFare2 = 5.5 ;//UberXL
final double CostPerMinute2 =0.4 ;//UberXL
final double CostPerKm2 = 1.25 ;//UberXL
final double ServiceFee2 = 0 ;//UberXL
final double CancellationFee2 = 12 ;//UberXL
final double MinimumFee2 = 12 ;//UberXL
int  FareInfo2 =0 ;//UberXL
int  FareEst2=0;//UberXL
int  SubmittedRatings2=0;//UberXL

final double BaseFare3 = 9.5 ;//UberBlack 
final double CostPerMinute3 =0.85  ;//UberBlack 
final double CostPerKm3 = 1.8  ;//UberBlack 
final double ServiceFee3 = 1.3  ;//UberBlack 
final double CancellationFee3 = 20 ;//UberBlack 
final double MinimumFee3 = 20 ;//UberBlack 
int  FareInfo3 =0 ;//UberBlack 
int  FareEst3=0;//UberBlack 
int  SubmittedRatings3=0;//UberBlack 

loop4:while(true){//begin while 1    
System.out.println("----------------------------------------------------");
System.out.println("###        Welcome to Uber Fare Calculator       ###");
System.out.println("----------------------------------------------------");
System.out.println("| 1  : Get fare information about available rides  |"
        + "\n| 2  : Get a Fare Estimate for your Journey        |"
        + "\n| 3  : Submit Rating of your Ride                  |"
        + "\n| 4  : Exit and display summary                    |");
System.out.println("----------------------------------------------------");
System.out.print("Please enter your choice... (1-4):");

Scanner input = new Scanner (System.in);
int choice = input.nextInt(); 
if((choice<1) || (choice>4)){
System.out.println("Invalid Choice!! Please Try again");
continue;
}
 
loop1:while (true){// begin while 2   
switch (choice) { // begin
     case 1:
while (true){//begin while for chosin 1       
System.out.println("-------------------------------------");
System.out.println("***             RIDES             ***");
System.out.println("-------------------------------------");
System.out.println("| X or x : UberX                    |"
        + "\n| L or l : UberXL                   |"
        + "\n| B or b : UberBlack                |"
        + "\n| R or r : Return to Main Menu      |");
System.out.println("-------------------------------------");
System.out.print("Please enter your choice..."); 
Scanner input1 = new Scanner (System.in);
char n =input1.next().charAt(0);//enter char
if((n!='X') && (n!='x') && (n!='L') && (n!='l') && (n!='B') && (n!='b')
   && (n!='R') && (n!='r')){
System.out.println("Invalid Choice!! Please Try again");
continue;   
}
 //if (R==true) break; // if switch 2 


loop2:while(true){// begin while 3    
switch (n){//begin switch 2 
    case 'X':
        FareInfo++;
        System.out.println("-------------------------------------");
        System.out.println("***            OPTIONS            ***");
        System.out.println("-------------------------------------");
        System.out.println("| B or b:  Base fare                |"
                + "\n| M or m:  Cost per minute          |"
                + "\n| K or k:  Cost per km              |"
                + "\n| S or s:  Service fee              |"
                + "\n| C or c:  Cancellation fee         |"
                + "\n| F or f:  Minimum fee              |"
                + "\n| R or r:  Previous Menu            |");
        System.out.println("-------------------------------------");
        System.out.println("Please enter your choice...");
        char n1 =input1.next().charAt(0);
           
      
switch (n1){//begin switch 3 for X
    
    case 'B':System.out.println("Base fare for UberX is " +BaseFare+"SR");
    break;
    case 'b':System.out.println("Base fare for UberX is " +BaseFare+"SR");
    break;
    case 'M':System.out.println("Cost per minute for UberX is "+CostPerMinute+"SR");
    break;
    case 'm':System.out.println("Cost per minute for UberX is "+CostPerMinute+"SR");
    break;
    case 'K':System.out.println("Cost per km for UberX is "+CostPerKm+"SR");
    break;
    case 'k':System.out.println("Cost per km for UberX is" +CostPerKm+"SR");
    break;
    case 'S':System.out.println("Service fee for UberX is "+ServiceFee+"SR");
    break;
    case 's':System.out.println("Service fee for UberX is "+ServiceFee+"SR");
    break;
    case 'C':System.out.println("Cancellation fee  for UberX is "+CancellationFee+"SR");
    break;
    case 'c':System.out.println("Cancellation fee  for UberX is "+CancellationFee+"SR");
    break;
    case 'F':System.out.println("Minimum fare for UberX is "+MinimumFee+"SR");
    break;
    case 'f':System.out.println("Minimum fare for UberX is "+MinimumFee+"SR");
    break;
    case 'R': break loop2 ;
    case 'r': break loop2 ;
   
    default :System.out.println("Invalid Choice!! Please Try again");continue;
    
}//end switch 3 for X

  // if switch 3 
     
 
    case 'x':
        FareInfo++;
        System.out.println("-------------------------------------");
        System.out.println("***            OPTIONS            ***");
        System.out.println("-------------------------------------");
        System.out.println("| B or b:  Base fare                |"
                + "\n| M or m:  Cost per minute          |"
                + "\n| K or k:  Cost per km              |"
                + "\n| S or s:  Service fee              |"
                + "\n| C or c:  Cancellation fee         |"
                + "\n| F or f:  Minimum fee              |"
                + "\n| R or r:  Previous Menu            |");
        System.out.println("-------------------------------------");
        System.out.println("Please enter your choice...");
        char n2 =input1.next().charAt(0); 
      
        
switch (n2){//begin switch 3 for x
    case 'B':System.out.println("Base fare for UberX is " +BaseFare+"SR");
    break;
    case 'b':System.out.println("Base fare for UberX is " +BaseFare+"SR");
    break;
    case 'M':System.out.println("Cost per minute for UberX is "+CostPerMinute+"SR");
    break;
    case 'm':System.out.println("Cost per minute for UberX is "+CostPerMinute+"SR");
    break;
    case 'K':System.out.println("Cost per km for UberX is "+CostPerKm+"SR");
    break;
    case 'k':System.out.println("Cost per km for UberX is" +CostPerKm+"SR");
    break;
    case 'S':System.out.println("Service fee for UberX is "+ServiceFee+"SR");
    break;
    case 's':System.out.println("Service fee for UberX is "+ServiceFee+"SR");
    break;
    case 'C':System.out.println("Cancellation fee  for UberX is "+CancellationFee+"SR");
    break;
    case 'c':System.out.println("Cancellation fee  for UberX is "+CancellationFee+"SR");
    break;
    case 'F':System.out.println("Minimum fare for UberX is "+MinimumFee+"SR");
    break;
    case 'f':System.out.println("Minimum fare for UberX is "+MinimumFee+"SR");
    break;
    case 'R':break loop2 ;
    case 'r':break loop2 ;
    default :System.out.println("Invalid Choice!! Please Try again");continue;
    
}//end switch 3 for x         
        
        
    case 'L':
        FareInfo2++;
        System.out.println("-------------------------------------");
        System.out.println("***            OPTIONS            ***");
        System.out.println("-------------------------------------");
        System.out.println("| B or b:  Base fare                |"
                + "\n| M or m:  Cost per minute          |"
                + "\n| K or k:  Cost per km              |"
                + "\n| S or s:  Service fee              |"
                + "\n| C or c:  Cancellation fee         |"
                + "\n| F or f:  Minimum fee              |"
                + "\n| R or r:  Previous Menu            |");
        System.out.println("-------------------------------------");
        System.out.println("Please enter your choice...");
        char n3 =input1.next().charAt(0);
        
        
switch (n3){//begin switch 3 for L
    case 'B':System.out.println("Base fare for UberX is " +BaseFare2+"SR");
    break;
    case 'b':System.out.println("Base fare for UberX is " +BaseFare2+"SR");
    break;
    case 'M':System.out.println("Cost per minute for UberX is "+CostPerMinute2+"SR");
    break;
    case 'm':System.out.println("Cost per minute for UberX is "+CostPerMinute2+"SR");
    break;
    case 'K':System.out.println("Cost per km for UberX is "+CostPerKm2+"SR");
    break;
    case 'k':System.out.println("Cost per km for UberX is" +CostPerKm2+"SR");
    break;
    case 'S':System.out.println("Service fee for UberX is "+ServiceFee2+"SR");
    break;
    case 's':System.out.println("Service fee for UberX is "+ServiceFee2+"SR");
    break;
    case 'C':System.out.println("Cancellation fee  for UberX is "+CancellationFee2+"SR");
    break;
    case 'c':System.out.println("Cancellation fee  for UberX is "+CancellationFee2+"SR");
    break;
    case 'F':System.out.println("Minimum fare for UberX is "+MinimumFee2+"SR");
    break;
    case 'f':System.out.println("Minimum fare for UberX is "+MinimumFee2+"SR");
    break;
    case 'R':break loop2 ;
    case 'r':break loop2 ;
    default :System.out.println("Invalid Choice!! Please Try again");continue;
}//end switch 3  for L              

        
    case 'l':
        FareInfo2++;
        System.out.println("-------------------------------------");
        System.out.println("***            OPTIONS            ***");
        System.out.println("-------------------------------------");
        System.out.println("| B or b:  Base fare                |"
                + "\n| M or m:  Cost per minute          |"
                + "\n| K or k:  Cost per km              |"
                + "\n| S or s:  Service fee              |"
                + "\n| C or c:  Cancellation fee         |"
                + "\n| F or f:  Minimum fee              |"
                + "\n| R or r:  Previous Menu            |");
        System.out.println("-------------------------------------");
        System.out.println("Please enter your choice...");
        char n4 =input1.next().charAt(0); 
       
        
switch (n4){//begin switch 3 for l
    case 'B':System.out.println("Base fare for UberX is " +BaseFare2+"SR");
    break;
    case 'b':System.out.println("Base fare for UberX is " +BaseFare2+"SR");
    break;
    case 'M':System.out.println("Cost per minute for UberX is "+CostPerMinute2+"SR");
    break;
    case 'm':System.out.println("Cost per minute for UberX is "+CostPerMinute2+"SR");
    break;
    case 'K':System.out.println("Cost per km for UberX is "+CostPerKm2+"SR");
    break;
    case 'k':System.out.println("Cost per km for UberX is" +CostPerKm2+"SR");
    break;
    case 'S':System.out.println("Service fee for UberX is "+ServiceFee2+"SR");
    break;
    case 's':System.out.println("Service fee for UberX is "+ServiceFee2+"SR");
    break;
    case 'C':System.out.println("Cancellation fee  for UberX is "+CancellationFee2+"SR");
    break;
    case 'c':System.out.println("Cancellation fee  for UberX is "+CancellationFee2+"SR");
    break;
    case 'F':System.out.println("Minimum fare for UberX is "+MinimumFee2+"SR");
    break;
    case 'f':System.out.println("Minimum fare for UberX is "+MinimumFee2+"SR");
    break;
    case 'R':break loop2 ;
    case 'r':break loop2 ;
    default :System.out.println("Invalid Choice!! Please Try again");continue;
}//end switch 3  for l 


    case 'B':
        System.out.println("-------------------------------------");
        System.out.println("***            OPTIONS            ***");
        System.out.println("-------------------------------------");
        System.out.println("| B or b:  Base fare                |"
                + "\n| M or m:  Cost per minute          |"
                + "\n| K or k:  Cost per km              |"
                + "\n| S or s:  Service fee              |"
                + "\n| C or c:  Cancellation fee         |"
                + "\n| F or f:  Minimum fee              |"
                + "\n| R or r:  Previous Menu            |");
        System.out.println("-------------------------------------");
        System.out.println("Please enter your choice...");
        char n5 =input1.next().charAt(0);
        FareInfo3--;
        
 switch (n5){//begin switch 3 for B
    case 'B':System.out.println("Base fare for UberX is " +BaseFare3+"SR");
    break;
    case 'b':System.out.println("Base fare for UberX is " +BaseFare3+"SR");
    break;
    case 'M':System.out.println("Cost per minute for UberX is "+CostPerMinute3+"SR");
    break;
    case 'm':System.out.println("Cost per minute for UberX is "+CostPerMinute3+"SR");
    break;
    case 'K':System.out.println("Cost per km for UberX is "+CostPerKm3+"SR");
    break;
    case 'k':System.out.println("Cost per km for UberX is" +CostPerKm3+"SR");
    break;
    case 'S':System.out.println("Service fee for UberX is "+ServiceFee3+"SR");
    break;
    case 's':System.out.println("Service fee for UberX is "+ServiceFee3+"SR");
    break;
    case 'C':System.out.println("Cancellation fee  for UberX is "+CancellationFee3+"SR");
    break;
    case 'c':System.out.println("Cancellation fee  for UberX is "+CancellationFee3+"SR");
    break;
    case 'F':System.out.println("Minimum fare for UberX is "+MinimumFee3+"SR");
    break;
    case 'f':System.out.println("Minimum fare for UberX is "+MinimumFee3+"SR");
    break;
    case 'R':break loop2 ;
    case 'r':break loop2 ;
    default :System.out.println("Invalid Choice!! Please Try again");continue;
}//end switch 3  for B       

        
        
    case 'b':
        System.out.println("-------------------------------------");
        System.out.println("***            OPTIONS            ***");
        System.out.println("-------------------------------------");
        System.out.println("| B or b:  Base fare                |"
                + "\n| M or m:  Cost per minute          |"
                + "\n| K or k:  Cost per km              |"
                + "\n| S or s:  Service fee              |"
                + "\n| C or c:  Cancellation fee         |"
                + "\n| F or f:  Minimum fee              |"
                + "\n| R or r:  Previous Menu            |");
        System.out.println("-------------------------------------");
        System.out.println("Please enter your choice...");
        char n6 =input1.next().charAt(0); 
        FareInfo3++;
        
switch (n6){//begin switch 3 for b
    case 'B':System.out.println("Base fare for UberX is " +BaseFare3+"SR");
    break;
    case 'b':System.out.println("Base fare for UberX is " +BaseFare3+"SR");
    break;
    case 'M':System.out.println("Cost per minute for UberX is "+CostPerMinute3+"SR");
    break;
    case 'm':System.out.println("Cost per minute for UberX is "+CostPerMinute3+"SR");
    break;
    case 'K':System.out.println("Cost per km for UberX is "+CostPerKm3+"SR");
    break;
    case 'k':System.out.println("Cost per km for UberX is" +CostPerKm3+"SR");
    break;
    case 'S':System.out.println("Service fee for UberX is "+ServiceFee3+"SR");
    break;
    case 's':System.out.println("Service fee for UberX is "+ServiceFee3+"SR");
    break;
    case 'C':System.out.println("Cancellation fee  for UberX is "+CancellationFee3+"SR");
    break;
    case 'c':System.out.println("Cancellation fee  for UberX is "+CancellationFee3+"SR");
    break;
    case 'F':System.out.println("Minimum fare for UberX is "+MinimumFee3+"SR");
    break;
    case 'f':System.out.println("Minimum fare for UberX is "+MinimumFee3+"SR");
    break;
    case 'R':break loop2 ;
    case 'r':break loop2 ;
    default :System.out.println("Invalid Choice!! Please Try again");continue;
}//end switch 3  for b       
             


    case 'R': break loop1 ;
    case 'r': break loop1 ; 
    default : 
    
}//end switch 2
}//end while for chosin 1 
}//end while 3

     case 2 :
while(true){//begain while for chosie 2         
System.out.println("-------------------------------------");
System.out.println("***             RIDES             ***");
System.out.println("-------------------------------------");
System.out.println("| X or x : UberX                    |"
        + "\n| L or l : UberXL                   |"
        + "\n| B or b : UberBlack                |"
        + "\n| R or r : Return to Main Menu      |");
System.out.println("-------------------------------------");
System.out.print("Please enter your choice..."); 
Scanner  input2 = new Scanner (System.in);
char n2 =input2.next().charAt(0);//enter char
if((n2!='X') && (n2!='x') && (n2!='L') && (n2!='l') && (n2!='B') && (n2!='b')
   && (n2!='R') && (n2!='r')){
System.out.println("Invalid Choice!! Please Try again");
continue;   
}

Scanner input3 = new Scanner (System.in);
switch(n2){//begin switch 4 for chosin 2 
    case 'X':
System.out.println("Please provide the information about your journey: ");
System.out.println("------------------------------------------------------ ");
System.out.print("Ride time in minutes: ");

double num = input3.nextDouble(); 
System.out.print("Ride distance in KM(s):");
double num1 = input3.nextDouble();
input3.nextLine();

System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
double TotalFare ;
TotalFare= BaseFare
        +(num * CostPerMinute)
        +(num1* CostPerKm)
        +ServiceFee ;
if(TotalFare < MinimumFee){//begin if for X c.2
   TotalFare= MinimumFee ;
}//end if for X c.2    
System.out.println("    Expected ride fare:    "+TotalFare+"SR");
FareEst++;
break;

    case 'x':
System.out.println("Please provide the information about your journey: ");
System.out.println("------------------------------------------------------ ");
System.out.print("Ride time in minutes: ");

double num2 = input3.nextDouble(); 
System.out.print("Ride distance in KM(s):");
double num3 = input3.nextDouble();
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

TotalFare= BaseFare
        +(num2 * CostPerMinute)
        +(num3* CostPerKm)
        +ServiceFee ;
if(TotalFare < MinimumFee){//begin if for x c.2
   TotalFare= MinimumFee ;
}//end if for x c.2    
System.out.println("    Expected ride fare:    "+TotalFare+"SR");
FareEst++;
break;
    
    case 'L':
System.out.println("Please provide the information about your journey: ");
System.out.println("------------------------------------------------------ ");
System.out.print("Ride time in minutes: ");
double num4 = input3.nextDouble(); 
System.out.print("Ride distance in KM(s):");
double num5 = input3.nextDouble();
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
TotalFare= BaseFare2
        +(num4 * CostPerMinute2)
        +(num5* CostPerKm2)
        +ServiceFee2 ;
if(TotalFare < MinimumFee2){//begin if for L c.2
   TotalFare= MinimumFee2 ;
}//end if for L c.2    
System.out.println("    Expected ride fare:    "+TotalFare+"SR");
FareEst2++;
break;  

    case 'l':
System.out.println("Please provide the information about your journey: ");
System.out.println("------------------------------------------------------ ");
System.out.print("Ride time in minutes: ");
double num6 = input3.nextDouble(); 
System.out.print("Ride distance in KM(s):");
double num7 = input3.nextDouble();
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
TotalFare= BaseFare2
        +(num6 * CostPerMinute2)
        +(num7* CostPerKm2)
        +ServiceFee2 ;
if(TotalFare < MinimumFee2){//begin if for l c.2
   TotalFare= MinimumFee2 ;
}//end if for l c.2    
System.out.println("    Expected ride fare:    "+TotalFare+"SR");
FareEst2++;
break;  

    case 'B':
System.out.println("Please provide the information about your journey: ");
System.out.println("------------------------------------------------------ ");
System.out.print("Ride time in minutes: ");
double num8 = input3.nextDouble(); 
System.out.print("Ride distance in KM(s):");
double num9 = input3.nextDouble();
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
TotalFare= BaseFare3
        +(num8 * CostPerMinute3)
        +(num9* CostPerKm3)
        +ServiceFee3 ;
if(TotalFare < MinimumFee3){//begin if for B c.2
   TotalFare= MinimumFee3 ;
}//end if for B c.2    
System.out.println("    Expected ride fare:    "+TotalFare+"SR");
FareEst3++;
break; 
  
   case 'b':
System.out.println("Please provide the information about your journey: ");
System.out.println("------------------------------------------------------ ");
System.out.print("Ride time in minutes: ");
double num10 = input3.nextDouble(); 
System.out.print("Ride distance in KM(s):");
double num11 = input3.nextDouble();
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
TotalFare= BaseFare3
        +(num10 * CostPerMinute3)
        +(num11* CostPerKm3)
        +ServiceFee3 ;
if(TotalFare < MinimumFee3){//begin if for B c.2
   TotalFare= MinimumFee3 ;
}//end if for B c.2    
System.out.println("    Expected ride fare:    "+TotalFare+"SR");
FareEst3++;
break; 
  
    case 'R':break loop1 ;
    case 'r':break loop1 ;
    
}//end switch 4 for chosin 2 
}//end while for chose 2

     case 3 :
while(true){//begain while for chosin 3          
System.out.println("-------------------------------------");
System.out.println("***             RIDES             ***");
System.out.println("-------------------------------------");
System.out.println("| X or x : UberX                    |"
        + "\n| L or l : UberXL                   |"
        + "\n| B or b : UberBlack                |"
        + "\n| R or r : Return to Main Menu      |");
System.out.println("-------------------------------------");
System.out.print("Please enter your choice..."); 
Scanner  input4 = new Scanner (System.in);
char n3 =input4.next().charAt(0);//enter char
if((n3!='X') && (n3!='x') && (n3!='L') && (n3!='l') && (n3!='B') && (n3!='b')
   && (n3!='R') && (n3!='r')){
System.out.println("Invalid Choice!! Please Try again");
continue;   
}

Scanner input5 = new Scanner (System.in);
switch(n3){//begin switch 5 for chosin 3
    case 'X':
System.out.println("------------------------------------- "); 
System.out.println("***           RATING              *** ");        
System.out.println("------------------------------------- ");        
System.out.println("| 1 Poor                            | ");        
System.out.println("| 2 Borderline                      | ");        
System.out.println("| 3 Satisfactory                    | ");        
System.out.println("| 4 Good                            | ");        
System.out.println("| 5 Outstanding                     | ");        
System.out.println("------------------------------------- ");        
System.out.print(" Please enter your choice... (1-5):"); 
int rating = input5.nextInt();
if(rating<= 0 || rating >5){
System.out.println("Invalid Choice!! Please Try again");
continue;    
}
SubmittedRatings++;//for summary 
System.out.println("Thank you for your rating! ");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");        
System.out.println(" You give rating "+rating); 
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
break;

    case 'x':
System.out.println("------------------------------------- "); 
System.out.println("***           RATING              *** ");        
System.out.println("------------------------------------- ");        
System.out.println("| 1 Poor                            | ");        
System.out.println("| 2 Borderline                      | ");        
System.out.println("| 3 Satisfactory                    | ");        
System.out.println("| 4 Good                            | ");        
System.out.println("| 5 Outstanding                     | ");        
System.out.println("------------------------------------- ");        
System.out.print(" Please enter your choice... (1-5):"); 
int rating1 = input5.nextInt();
if(rating1<= 0 || rating1 >5){
System.out.println("Invalid Choice!! Please Try again");
continue;    
}
SubmittedRatings++;
System.out.println("Thank you for your rating! ");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");        
System.out.println(" You give rating "+rating1); 
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
break;

    case 'L':
System.out.println("------------------------------------- "); 
System.out.println("***           RATING              *** ");        
System.out.println("------------------------------------- ");        
System.out.println("| 1 Poor                            | ");        
System.out.println("| 2 Borderline                      | ");        
System.out.println("| 3 Satisfactory                    | ");        
System.out.println("| 4 Good                            | ");        
System.out.println("| 5 Outstanding                     | ");        
System.out.println("------------------------------------- ");        
System.out.print(" Please enter your choice... (1-5):"); 
int rating2 = input5.nextInt();
if(rating2<= 0 || rating2 >5){
System.out.println("Invalid Choice!! Please Try again");
continue;    
}
SubmittedRatings2++;
System.out.println("Thank you for your rating! ");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");        
System.out.println(" You give rating "+rating2); 
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
break;

   case'l':
System.out.println("------------------------------------- "); 
System.out.println("***           RATING              *** ");        
System.out.println("------------------------------------- ");        
System.out.println("| 1 Poor                            | ");        
System.out.println("| 2 Borderline                      | ");        
System.out.println("| 3 Satisfactory                    | ");        
System.out.println("| 4 Good                            | ");        
System.out.println("| 5 Outstanding                     | ");        
System.out.println("------------------------------------- ");        
System.out.print(" Please enter your choice... (1-5):"); 
int rating3 = input5.nextInt();
if(rating3<= 0 || rating3 >5){
System.out.println("Invalid Choice!! Please Try again");
continue;    
}
SubmittedRatings2++;
System.out.println("Thank you for your rating! ");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");        
System.out.println(" You give rating "+rating3); 
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
break; 

   case 'B':
System.out.println("------------------------------------- "); 
System.out.println("***           RATING              *** ");        
System.out.println("------------------------------------- ");        
System.out.println("| 1 Poor                            | ");        
System.out.println("| 2 Borderline                      | ");        
System.out.println("| 3 Satisfactory                    | ");        
System.out.println("| 4 Good                            | ");        
System.out.println("| 5 Outstanding                     | ");        
System.out.println("------------------------------------- ");        
System.out.print(" Please enter your choice... (1-5):"); 
int rating4 = input5.nextInt();
if(rating4<= 0 || rating4 >5){
System.out.println("Invalid Choice!! Please Try again");
continue;    
}
SubmittedRatings3++;
System.out.println("Thank you for your rating! ");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");        
System.out.println(" You give rating "+rating4); 
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
break; 

   case 'b':
System.out.println("------------------------------------- "); 
System.out.println("***           RATING              *** ");        
System.out.println("------------------------------------- ");        
System.out.println("| 1 Poor                            | ");        
System.out.println("| 2 Borderline                      | ");        
System.out.println("| 3 Satisfactory                    | ");        
System.out.println("| 4 Good                            | ");        
System.out.println("| 5 Outstanding                     | ");        
System.out.println("------------------------------------- ");        
System.out.print(" Please enter your choice... (1-5):"); 
int rating5 = input5.nextInt();
if(rating5<= 0 || rating5 >5){
System.out.println("Invalid Choice!! Please Try again");
continue;    
}
SubmittedRatings3++;
System.out.println("Thank you for your rating! ");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");        
System.out.println(" You give rating "+rating5); 
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
break; 

   case 'R':break loop1 ;
   case 'r':break loop1 ;    
}//end switch 5 for chosin 3
}//end while for chosin 3     
     case 4 :
System.out.println("------------------------------------------------------------------------ "); 
System.out.println("###                          SUMMARY                                 ### "); 
System.out.println("------------------------------------------------------------------------ "); 
System.out.println("| Ride       | # of Fare Info. | # Fare Est. | # of Submitted Ratings |  "); 
System.out.println("------------------------------------------------------------------------ "); 
System.out.println("| UberX      |\t " +FareInfo+ "\t       | \t"+FareEst+"    |       \t"+SubmittedRatings+"             |  "); 
System.out.println("| UberXL     |\t " +FareInfo2+"\t       | \t"+FareEst2+"    |      \t"+SubmittedRatings2+"             |  "); 
System.out.println("| UberXBlack |\t " +FareInfo3+"\t       | \t"+FareEst3+"    |      \t"+SubmittedRatings3+"             |  "); 
System.out.println("------------------------------------------------------------------------"); 
System.out.println(" Thank you for using Uber Fare Calculation System! "); 
break loop4 ;

}//end switch 1
 

 
 }//end while 2

 
 }//end while 1
 








}//main
}//end class
