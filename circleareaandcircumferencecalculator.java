import java.util.Scanner;
public class circleareaandcircumferencecalculator
{
    public static void main(String[] args)
    {
        /*a=radius
        b=area
        c=circumference */
        double a,b,c;
        try (Scanner read = new Scanner(System.in)) {
            while(true)
            {
                System.out.println("HELLO");
                System.out.println("WELCOME TO AREA AND CIRCUMFERENCE CALCULATOR");
                System.out.println("ENTRE RADIUS OF CIRCLE");
                a=read.nextDouble();
                if (a>0)
                {
                    b=(22* Math.pow(a, 2))/7;
                    c=(2*22*a)/7;
                    System.out.println("AREA OF CIRCLE IS");
                    System.out.println(b);
                    System.out.println("CIRCUMFERENCE OF CIRCLE IS");
                    System.out.println(c);
                    System.out.println("THANKS");
                    System.out.println("BYE");
                    System.out.println(".");

                }
                if (a<0)
                {
                    System.out.println("RADIUS CANT BE NEGATIVE");
                    System.out.println("TRY AGAIN");
                    System.out.println(".");
                }
            }
        }

    }

}
