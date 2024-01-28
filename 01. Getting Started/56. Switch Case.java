// Switch Case.


import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        while(true)
        {
            int n1 = scn.nextInt();
            int n2 = scn.nextInt();
            char operator = scn.next().charAt(0);
            switch(operator)
            {
                case '+':
                    System.out.println(n1 + n2);
                    break;
                case '-':
                    System.out.println(n1 - n2);
                    break;
                case '*':
                    System.out.println(n1 * n2);
                    break;
                case '/':
                    System.out.println(n1 / n2);
                    break;
                default:
                    System.out.println("Input Operator");
                    return;
            }   
        }
    }
}
