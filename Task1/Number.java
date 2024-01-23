
import java.util.Random;

import javax.lang.model.util.ElementScanner14;

import java.util.*;

class Number
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        //int score;
        boolean choice=true;
        
        //System.out.println("Enter Number of chances:");
        //int chances=obj.nextInt();
        //System.out.println("Number of chances:"+chances);
        int trycount=0;

    while(choice)
    {    
        System.out.println("Enter Number of chances:");
        int chances=obj.nextInt();
        System.out.println("Number of chances:"+chances);
        Random rand=new Random();
        int randomnumber=rand.nextInt(100);
        System.out.println("Random Number is "+randomnumber);

       for(int i=chances;i>0;i--)
       // while(chances>0)
        {
              
        System.out.println("Enter your guess (0-100)");
        int playerGuess=obj.nextInt();
        ++trycount;

        if(playerGuess==randomnumber){
            System.out.println("Correct! You Win!");

           // System.out.println("How many chances you have taken:"+trycount);
            if(trycount==1)
            {
                System.out.println(" Great!!! guessed in first attempt!!");
                trycount=0;
            }
            else
            {
                System.out.println("fine...guessed in "+trycount+ " attempts");
                trycount=0;
            }
        
            break;
            
        }
        else if(randomnumber>playerGuess){
            System.out.println("Nope! The number is higher . Guess again");
        }
        else if(randomnumber<playerGuess)
        {
            System.out.println("Nope! The number is lower . Guess again");
        }
        else 
        {
            System.out.println("sorry youre chances has over");
        }
        //chances--;
    }

    System.out.println("wanna play again if yes then enter true otherwise false:");
    choice=obj.nextBoolean();

   }

    
  }

}
