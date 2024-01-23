import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class ATM
{
    public static void main(String[] args)
    {
       ATMop obj=new ATMop();
    }
}

class data
{
    float balance;
}

class ATMop
{
    //float balance;
    Scanner sc=new Scanner(System.in);
    HashMap<Integer , data> map=new HashMap<>();
   

    ATMop()
    {
        System.out.println("*************************************");
       System.out.println("Welcome to our ATM!!");
       op();
    }

    
    public void op()
    {
        System.out.println("****************************************");
       System.out.println("enter your pincode:");
       int pincode=sc.nextInt(); 
       if(map.containsKey(pincode)==true)
       {
          data obj=map.get(pincode);
          menu(obj);
       }
       else
       {
        System.out.println("***************************************");
         System.out.println("please create account first.");
         System.out.println("set your pin code:");
         int pin=sc.nextInt();
         data obj=new data();
         map.put(pin,obj);
         menu(obj);
       }
    }

    public void menu(data obj)
    {
        
        System.out.println("enter valid number:");
        System.out.println("1. check balance");
        System.out.println("2. deposit money");
        System.out.println("3. withdraw money");
        System.out.println("4. check another account");
        System.out.println("5. exit");

        int x=sc.nextInt();

        if(x==1)
        {
            check_balance(obj);
        }

        else if(x==2)
        {
            deposit(obj);
        }

        else if(x==3)
        {
            withdraw(obj);
        }

        else if(x==4)
        {
            op();
        }

        else if(x==5)
        {
            System.out.println("thank you!!");
        }

        else 
        {
            System.out.println("please enter valid number");
            menu(obj);
        }
    }

    public void check_balance(data obj)
    {
        System.out.println("your balance "+ obj.balance);
        menu(obj);
    }

    public void deposit(data obj)
    {
        System.out.println("enter amount:");
        float a=sc.nextFloat();

        obj.balance=obj.balance+a;
        System.out.println("amount deposites succesfully..");
        menu(obj);

    }

    public void withdraw(data obj)
    {
        System.out.println("enter your amount:");
        float a=sc.nextFloat();

        if(obj.balance>=a)
        {
          obj.balance=obj.balance-a; 
          System.out.println("amount withdraw succesfully..");
        }
        else
        {
           System.out.println("Insufficient amount.");
        }
        menu(obj);
    }
}