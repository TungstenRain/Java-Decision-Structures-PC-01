package ch03pc01;
import java.util.Scanner;
/**
 *
 * @author frank.olson
 * date: 11/1/2017
 * 
 * purpose: to display the Roman numeral version of a number input by a user
 */
public class Ch03pc01 {
    
    public static void main(String[] args) {
        //variables
        int num;
        String rNum;
                        
        //create a keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        //Request input
        System.out.println("Please enter a number between 1 and 10. ");
        num = keyboard.nextInt();
        
        //switch statement
        switch (num)
        {
            case 1:
                rNum = "I";
                break;
            
            case 2:
                rNum = "II";
                break;
            
            case 3:
                rNum = "III";
                break;
            
            case 4:
                rNum = "IV";
                break;
            
            case 5:
                rNum = "V";
                break;
                
            case 6:
                rNum = "VI";
                break;
                
            case 7:
                rNum = "VII";
                break;
                
            case 8:
                rNum = "VIII";
                break;
                
            case 9:
                rNum = "IX";
                break;
                
            default:
                rNum = "X";
                break;
        }
        
        //Display Roman Numeral
        if (num >=1 && num <=10)
        {
            System.out.println("The Roman numeral for " + num + " is: " + rNum);
        }
        else
        {
            System.out.println("Error!  You input a number outside the range of 1 - 10.");
        }
    }
    
}
