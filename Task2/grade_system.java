
import java.util.*;

class grade_system
{
    public static void main(String[] args)
    {

        Scanner obj=new Scanner(System.in);
        String Grade=null;
        float avg_percentage;
        float total_marks=0;

        System.out.println("Enter the number of subjects:");
        int subjects=obj.nextInt();
        System.out.println("The number of subjects are:"+subjects);

        String name[]=new String[subjects];
        float marks[]=new float[subjects];

        for(int i=0;i<subjects;i++)
        {
              System.out.println("Enter "+(i+1)+" subject:");
              name[i]=obj.next();

        }

        System.out.println("Enter marks for each subjects out of 100");

        for(int i=0;i<subjects;i++)
        {
            System.out.println("Enter marks for "+name[i]+":");
            marks[i]=obj.nextFloat();
        }

        for(int i=0;i<subjects;i++)
        {
            total_marks=total_marks+marks[i];

        } 

        avg_percentage=(total_marks/500)*100;


        if(avg_percentage>=90 && avg_percentage<=100)
        {
            Grade="A+";
        }
        else if(avg_percentage>=80 && avg_percentage<=89)
        {
            Grade="A";
        }
        else if(avg_percentage>=70 && avg_percentage<=79)
        {
            Grade="B";
        }
        else if(avg_percentage>=60 && avg_percentage<=69)
        {
            Grade="C";
        }
        else if(avg_percentage>=35 && avg_percentage<=59)
        {
            Grade="D";
        }
        else if(avg_percentage>=0 && avg_percentage<35)
        {
            Grade="F";
        }


        
        System.out.println("total marks:"+total_marks);
        System.out.println("average percentage:"+avg_percentage);
        System.out.println("Grade:"+Grade);
    }
}