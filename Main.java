import java.util.Scanner;

/**
 *
 * @author Zachary Balean
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner
    Scanner input = new Scanner(System.in);

    //asks user for their number
    System.out.println("Which number would you like to check?");
    
    //users number
    int usersNumber = input.nextInt();
    //divisor number
    int divideNumber = 1;

    //while loop to figure out if its a prime number
    while(divideNumber <= usersNumber){
      if(usersNumber % divideNumber == 0){
        divideNumber = divideNumber + 1;
        System.out.println("this is prime");
      } else if(usersNumber % divideNumber != 0){
        divideNumber = divideNumber + 1;


      }

    }
    
  }
}
