import java.util.Scanner;

public class GpaCalculation {
   public static void main(String[]args)
   {
       int mat,physics,literally,chemistry,music,english;

       Scanner input=new Scanner(System.in);

       System.out.println("Enter your Math grade: ");
       mat=input.nextInt();
       System.out.println("Enter your Physics grade: ");
       physics=input.nextInt();
       System.out.println("Enter your Literally grade: ");
       literally=input.nextInt();
       System.out.println("Enter your Chemistry grade: ");
       chemistry=input.nextInt();
       System.out.println("Enter your Music grade: ");
       music=input.nextInt();
       System.out.println("Enter your English grade:  ");
       english=input.nextInt();

       int total=(mat+physics+literally+chemistry+music+english);
       double result=total/6.0;
       System.out.println(result);
       System.out.println(result >= 60 ? "Student is successful." : "Student fails.");
   }


}
