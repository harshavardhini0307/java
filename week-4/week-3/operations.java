//operations

public class operations{
   public static void main(String args[]){
  
      int a = 12, b = 5;
    System.out.println("addition opeartion : " + (a + b));
    System.out.println("subtraction operation: " + (a - b));
    System.out.println("multiplication operation:" + (a *b));
    System.out.println("division operation: " + (a / b));
    System.out.println("modulo division operation:" +(a %b));

    // create variables
    int p = 4;
    int var;
    var = p;
    System.out.println("variable creating using =: " + var);

    // assign value using =+
    var += p;
    System.out.println("variable using += is: " + var);

    // assign value using =*
    var *= p;
    System.out.println("variable  using *= is: " + var);


    int m = 7, n = 11;
    System.out.println("m is " + m + " and n is " + n);
    System.out.println(m == n);
    System.out.println(m != n);
    System.out.println(m > n);
    System.out.println(m < n);
    System.out.println(m >= n);
    System.out.println(m <= n);
   }
}