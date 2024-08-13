//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
import java.util.Scanner;

public class program4{
    public static void main (String[] args){
        //Make a Scanner
        Scanner myScanner = new Scanner(System.in);
        
        //Create 6 variables
        int firstNum = 0;
        int secondNum = 0;
        int thirdNum = 0;
        int fourthNum = 0;
        int sumOfNums = 0;
        double averageOfNums = 0;
        int numOfNums = 0;
        
        //ask for input
        System.out.print("Enter the First 3-digit Number: ");
        //get input
        firstNum = myScanner.nextInt();
        numOfNums++;
        
        //ask for 2nd number
        System.out.print("Enter the Second 3-digit Number: ");
        //get input
        secondNum = myScanner.nextInt();
        numOfNums++;
        
        //ask for 3rd number
        System.out.print("Enter the Third 3-digit Number: ");
        //get input
        thirdNum = myScanner.nextInt();
        numOfNums++;
        
        //ask for 4th number
        System.out.print("Enter the Fourth 3-digit Number: ");
        //get input
        fourthNum = myScanner.nextInt();
        numOfNums++;
        
        
        //calcualte
        sumOfNums = firstNum + secondNum + thirdNum + fourthNum;
        averageOfNums = (double)sumOfNums / numOfNums;
        
        //output
        System.out.println();
        System.out.println("The sum of the four numbers is "+ sumOfNums);
        System.out.println("The average of the four numbers is " + averageOfNums);
    }
}



//Paste console output below:
/*
Enter the First 3-digit Number: 475
Enter the Second 3-digit Number: 821
Enter the Third 3-digit Number: 369
Enter the Fourth 3-digit Number: 562

The sum of the four numbers is 2227
The average of the four numbers is 556.75

*/
