// Ternary Operator.


import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
      
        // Even or Odd using Ternary Operator.
        int n = scn.nextInt();
        String result = (n % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);
    }
}
