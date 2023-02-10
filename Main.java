import java.util.Scanner;

class Main {
  
  public static void main(String[] args){
    
   Scanner input = new Scanner (System.in);

   
   
    System.out.println("This program will calculate the gas cost for your trip");
   
    System.out.println("Please enter the distance");
    double distance = input.nextDouble();
    
     System.out.println("Enter MPG");
    double MPG = input.nextDouble();

    System.out.println("Enter gas price");
    double gasPrice = input.nextDouble();

    System.out.println("Estimated gas amount for your trip is " + (distance / MPG) + " gallon and estimated gas cost is " + ( distance / MPG ) * gasPrice + " USD " );
     
    
   
  
  

                
  }
}

  
  


    // Write your code here


   
  