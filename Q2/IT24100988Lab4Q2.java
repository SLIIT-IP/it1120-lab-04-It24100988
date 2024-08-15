import java.util.Scanner;
     public class IT24100988Lab4Q2 
{
    public static void main(String[] args) 
{
    Scanner input = new Scanner(System.in);

    double examMarks, labSubmission, percentageexam, percentagelab, finalexam;



     System.out.print("Please enter exam marks (out of 100): ");
      examMarks = input.nextInt();

      if(examMarks < 0 || examMarks > 100)
    {
      System.out.print("Invalid input for exam marks. Terminating program. ");
       return;
    }



     System.out.print("Please enter lab submission marks (out of 100): ");
    labSubmission = input.nextInt();


      if(labSubmission < 0 || labSubmission > 100)
    {
      System.out.print("Invalid input for exam marks. Terminating program. ");
      return;
    }



      System.out.print("Please enter the percentage given for the exam: ");
      percentageexam = input.nextInt();



     System.out.print("Please enter the percentage given for the lab submission: ");
     percentagelab = input.nextInt();

    if(percentageexam + percentagelab > 100 || percentageexam + percentagelab <= 50)
   {
           System.out.print("The percentages must add up to 100. Terminating program. ");
      return;
    }



      finalexam = (examMarks * percentageexam / 100) + (labSubmission * percentagelab / 100);
System.out.print("Final Exam Mark is: " + finalexam);

  }
}
