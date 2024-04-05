import java.util.Scanner;

public class StudentGrade {
    void setup()
    {
        int marks[] = new int[6];
        int total = 0;
        double avg = 0;

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<marks.length;i++) {
            System.out.println("Enter the marks for subject" + i+1);
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        sc.close();

        avg = total/marks.length;
        System.out.print("The student Grade is: ");
        grade(avg);
    }
    private void grade(double avg)
    {
        if(avg>=80)
        {
            System.out.print("A");
        }
        else if(avg>=60 && avg<80)
        {
            System.out.print("B");
        }
        else if(avg>=40 && avg<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }

    }

}


