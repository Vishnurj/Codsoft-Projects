import java.util.Scanner;

public class StudentGradeCalculator {

  @SuppressWarnings("unused")
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Student Name");
    @SuppressWarnings("unused")
    String Name = sc.nextLine();
    System.out.println("Enter Student Registered Number");
    int RegisteredNumber = sc.nextInt();
    System.out.println("Enter the Subject 1 Marks Obtained");
    int s1 = sc.nextInt();
    System.out.println("Enter the Subject 2 Marks Obtained");
    int s2 = sc.nextInt();
    System.out.println("Enter the Subject 3 Marks Obtained");
    int s3 = sc.nextInt();
    System.out.println("Enter the Subject 4 Marks Obtained");
    int s4 = sc.nextInt();
    System.out.println("Enter the Subject 5 Marks Obtained");
    int s5 = sc.nextInt();
    System.out.println("Enter the Subject 6 Marks Obtained");
    int s6 = sc.nextInt();


    int MyMarks = s1+s2+s3+s4+s5+s6;
    System.out.println("Total obtained " +MyMarks);
  
    float Percent = ((MyMarks/7));
    System.out.println("Student Percentage is " +Percent);

    if (Percent>=90) {

      System.out.println("Your Scored Grade A ");
      
    }
    else if(Percent>=80){
      System.out.println("Your Scored Grade B ");
    }
    else if(Percent>=70){
      System.out.println("Your Scored Grade C ");
    }
    else if(Percent>=60){
      System.out.println("Your Scored Grade D ");
    }
    else if(Percent>=50){
      System.out.println("Your Scored Grade E ");
    }
    else if(Percent>=40){
      System.out.println("Sorry Try hard Again ");
    }

    sc.close();

  }
  
}
