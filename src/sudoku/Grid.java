package sudoku;
import java.util.Scanner; //Reads input from System.in

/**
 *
 * @author Higbee-Keith
 */
public class Grid {
    //declare variables
    int givenNumbers = 0;
            
    public Grid(){
    }
    
    private int getGridSize() {
        //Declare a new Scanner input
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many numbers would you like to start with?");
        return givenNumbers = input.nextInt();              
    }
    
    public void displaySize() {
        getGridSize();
        System.out.println("Your game will start with " + givenNumbers + 
                " numbers already completed for you.");
    }
}
