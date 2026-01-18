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
                System.out.println("Hello");
                System.out.println("Wwelcom to Area and Circumference Calculator");
                System.out.println("Entre Radius of the Circle");
                a=read.nextDouble();
                if (a>0)
                {
                    b=(22* Math.pow(a, 2))/7;
                    c=(2*22*a)/7;
                    System.out.println("Area of the Circle is");
                    System.out.println(b);
                    System.out.println("Circumference of the Circle is");
                    System.out.println(c);
                    System.out.println("Thank you");
                    System.out.println("Bye");
                    System.out.println(".");

                }
                else if (a<0)
                {
                    System.out.println("Radius cant be negative");
                    System.out.println("Try again");
                    System.out.println(".");
                }
                else if (a==0)
                {
                    System.out.println("Radius cant be zero");
                    System.out.println("Try again");
                    System.out.println(".");
                }
            }
        }

    }

}


