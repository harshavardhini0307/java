import java.util.Scanner; 
 public class factorial {
   public static void main(String[]args) {
       Scanner input = new Scanner(System.in);
       System.out.println("enter a number: ");
       int number = input.nextInt();
       if (number<0) {
           System.out.println("factorial is not possible for negative intgers: ");
       }  else{
            long factorial = 1;
            for(int i = 1; i<=number; i++) {
                factorial *=i;
            }
             System.out.println("Factorial: " +factorial);

            }
             System.out.println("Harsha vardhini");
             input.close();
           }
       
       }
