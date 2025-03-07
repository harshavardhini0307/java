import java.util.Scanner;
public class simpleinterest {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print(" Enter principal: ");
      double principal = input.nextDouble();
      System.out.print(" Enter rate of interest: ");
      double rateofinterest = input.nextDouble();
      System.out.print("Enter time period: ");
      double time = input.nextDouble();
      double simpleinterest = (principal*rateofinterest*time)/100;
      System.out.println("The Simple interest is: " + simpleinterest);
      System.out.println("Harsha vardhini");
      input.close();
    }
}