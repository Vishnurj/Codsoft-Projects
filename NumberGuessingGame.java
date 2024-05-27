import java.util.Scanner;

class NumberGuessingGame{


  public static void main(String[] args) {
  int trials = 1;
  int GuessingNumber = 0;
  int HiddenNumber = (int)(Math.random() * 99 + 1);
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Hey.... player what's Your Name :");
  String Name = sc.nextLine();
    System.out.println(" Come On..." +Name +" Let Start the Number Guessing Game ..! ");
    
    do{
      System.out.println("Type your Lucky Number/Guessing Number between 1 to 100 only :");
      if (sc.hasNext()) {
        GuessingNumber = sc.nextInt();

    if(GuessingNumber == HiddenNumber){
      System.out.println("Hurry Genius..." +Name +"You Guessed The Correct Number.. Yow won the game");
    break;
    }
    
    else if ( GuessingNumber < HiddenNumber)

      System.out.println("Sorry Your Guess Number is too low Try Again...");
    

    else if (GuessingNumber > HiddenNumber)

      System.out.println("Sorry Your Guess Number is too High Try Again...");

    if (trials == 5) {
      System.out.println("oops..you exceed maximum attempts");
      break;
      
    }
    trials++;
  }
    else{
      System.out.println("Enter the Valid number between 1 to 100");
      break;
    }
    
    }
  while(HiddenNumber!=GuessingNumber);

  
  System.out.println("Thanks for Playing");
  sc.close();
  
}

}




