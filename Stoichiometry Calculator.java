/*
 Steps to using the Stoichiometry Calculator

*Seperate each step by a new line

1. Enter your starting unit. Acceptable inputs are Mass, Volume, Particles, and Moles
2. Enter your ending unit. Acceptable inputs are Mass, Volume, Particles, and Moles
3. Enter your given value that the probelm provides. Ex. If the problem gives 10.0L of H20 then enter 10.0
4. (If chosen Mass as first option) Enter the mass of starting element
5. Enter your starting mole number (The number at the bottom of the mole ratio)
6. Enter your ending mole number (The number at the top of the mole ratio)
7. (If chosen  Mass as second option) Enter mass of ending element
8. Answer along with it's unit appears
 */
package Stoichiometry;

import java.util.Scanner;


public class Stoichiometry{
public static void main(String[] args) {
    
    
Scanner input= new Scanner(System.in);
String Unit1= input.nextLine();
String Unit2= input.nextLine();

if (Unit1.equalsIgnoreCase("mass")){

    //User inputs given mass of Element
    double num1= input.nextDouble();
    //User inputs average atomic mass
    //of element
    double num2= input.nextDouble();
    //Converts Mass to Moles
    double Var1= num1/num2;
    //User inputs # of moles of first
    //element
    double Mol1= input.nextDouble();
    //User inputs # of moles of second
    //element
    double Mol2= input.nextDouble();
    //Acquires mole ratio
    double Var2= Mol2/Mol1;
    //Obtains answer in moles
    double Var3= Var1*Var2;
    
    if(Unit2.equalsIgnoreCase("volume")){
    double Var4= Var3*22.4;

    System.out.println("Your answer is"+ " "+ Var4 + "L" );
    }
    
    else if(Unit2.equalsIgnoreCase("mass")){
        //User inputs Mass of ending Element
        double Var5= input.nextDouble();
        double Var4= Var3*Var5;
        
        System.out.println("Your answer is"+ " "+ Var4 + "g" ); 
    }
    
    else if(Unit2.equalsIgnoreCase("particles")){
        double Var4= Var3*6.02e23;
        
        System.out.println("Your answer is"+ " "+ Var4 +" "+ "particles" ); 
    }
    
    else if(Unit2.equalsIgnoreCase("moles")){
    
        System.out.println("Your answer is"+ " "+ Var3 +" "+ "moles" ); 
    }
}
    
    if (Unit1.equalsIgnoreCase("volume")){
        //User inputs given volume in L of element
        double value1= input.nextDouble();
        //Converts Liters to moles
        double value2= value1/22.4;
        //User inputs # of moles of first element
        double value3= input.nextDouble();
        //User inputs # of moles for second element
        double value4= input.nextDouble();
        //Accquires mole ratio
        double value5= value4/value3;
        //Obtains answer in moles
        double value6= value2*value5;
        
        
        if(Unit2.equalsIgnoreCase("volume")){
            double value7= value6*22.4;
            
            System.out.println("Your answer is"+ " "+ value7 + "L" );
        }
        else if(Unit2.equalsIgnoreCase("mass")){
            //User inputs mass of ending element
            double value8= input.nextDouble();
            double value7= value6*value8;
            
            System.out.println("Your answer is"+ " "+ value7 + "g" );
    }
            
        else if(Unit2.equalsIgnoreCase("particles")){
            double value7= value6*6.02e23;
            
            System.out.println("Your answer is"+ " "+ value7 + "particles" );
        }
        
        else if(Unit2.equalsIgnoreCase("moles")){
            System.out.println("Your answer is"+ " "+ value6 +" "+ "moles" ); 
        }
    }
    
    if(Unit1.equalsIgnoreCase("particles")){
        //User inputs given particles of element
        double number1= input.nextDouble();
        //Converts particles to moles
        double number2= number1/6.02e23;
        //User inputs # of moles for first element
        double number3= input.nextDouble();
        //User inputs # of moles for second element
        double number4= input.nextDouble();
        //Accquires mole ratio
        double number5= number4/number3;
        //Obtains mole ratio
        double number6= number2*number5;
        
        if(Unit2.equalsIgnoreCase("volume")){
            double number7= number6*22.4;
            
            System.out.println("Your answer is"+ " "+ number7 + "L" );
        }
        
        else if(Unit2.equalsIgnoreCase("mass")){
            //User inputs mass of ending element
            double number8= input.nextDouble();
            double number7= number6*number8;
            
            System.out.println("Your answer is"+ " "+ number7 + "g" );
        }
        
        else if(Unit2.equalsIgnoreCase("particles")){
            double number7= number6*6.02e23;
            
            System.out.println("Your answer is"+ " "+ number7 + "particles" );
            
        }
        else if(Unit2.equalsIgnoreCase("moles")){
            System.out.println("Your answer is"+ " "+ number6 +" "+ "moles" ); 
        }
    }
    
        if (Unit1.equalsIgnoreCase("moles")){
            //User inputs given #
            double variable1= input.nextDouble();
            //User inputs # of moles for first element
            double variable2= input.nextDouble();
            //User inputs # of moles for second element
            double variable3= input.nextDouble();
            //Accquires mole ratio
            double variable4= variable3/variable2;
            //Obtains answer in moles
            double variable5= variable1*variable4;
            
         if (Unit2.equalsIgnoreCase("volume")){
             double variable6= variable5*22.4;
             
             System.out.println("Your answer is"+ " "+ variable6 + "L" );
         }
         else if  (Unit2.equalsIgnoreCase("mass")){
             //User inputs mass of ending element
             double variable7= input.nextDouble();
             double variable6= variable5*variable7;
             
             System.out.println("Your answer is"+ " "+ variable6 + "g" );
         }
         else if (Unit2.equalsIgnoreCase("particles")){
            double variable6= variable5*6.02e23;
            
            System.out.println("Your answer is"+ " "+ variable6 + "particles" );
        }
         else if (Unit2.equalsIgnoreCase("moles")){
            
            System.out.println("Your answer is"+ " "+ variable5 +" "+ "moles" );
        }
        }
 
    }
}
//RKPost