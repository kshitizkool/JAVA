package com.company;
import java.util.Scanner;
class NegativeAmountexception extends Exception{
}
class Account extends Exception{
    int accountno;
    String name;
    float balance;
    int branchcode;
    Scanner sc1=new Scanner(System.in);
    void details()
    { System.out.println("ENTER THE NAME OF THE CUSTOMER\n");
        name=sc1.nextLine();
        System.out.println("ENTER THE ACCOUNTNO\n");
        accountno=sc1.nextInt();
        System.out.println("ENTER THE BRANCH CODE\n");
        branchcode=sc1.nextInt();
        System.out.println("ENTER THE INITIAL BALANCE IN THE ACCOUNT\n");
        balance=sc1.nextFloat();
    }
    void deposit()
    {
        System.out.println("ENTER THE AMOUNT TO BE DEPOSITED\n");
        float deposits;
        deposits=sc1.nextFloat();
        balance=deposits+balance;
    }
    void withdrawal()
    { System.out.println("ENTER THE AMOUNT OT BE WITHDRAWAL\n");
        float withdraws;
        withdraws=sc1.nextFloat();
        if(withdraws<0)
        {
            try
            {
                throw new NegativeAmountexception();

            }catch(NegativeAmountexception e)
            {
                System.out.println("ENTER THE WITHDRAW AMOUNT AGAIN PLEASE\n");
                withdrawal();
                return;
            }
        }
        else if(balance<withdraws)
        {
            try
            {
                throw new NegativeAmountexception();
            }
            catch(NegativeAmountexception e)
            { System.out.println("ACCOUNT BALANCE ERROR\n");
                withdrawal();
                return;
            }
        }
        else {
            balance=balance-withdraws;
        }
    }
    void checkbalance()
    {
        System.out.println("YOUR BALANCE IS\n"+balance);
    }
    void display()
    {
        System.out.println("\nYOUR NAME IS "+name);
        System.out.println("\nYOUR ACCOUNT NO IS "+accountno);
        System.out.println("\nYOUR BANK CODE is "+branchcode);
        System.out.println("\nYOUR BALANCE IS "+balance);
    }
}
public class QU1 {
    public static void main(String[] args)
    { int choice;
        int num=1;
        Account oAc=new Account();
        System.out.println("ENTER THE DETAILS OF THE CUSTOMER \n");
        oAc.details();
        while(num!=0)
        {
            System.out.println("MENU \n 1.DEPOSIT \n2.WITHDRAWAL \n3.CHECK BALANCE");
            System.out.println("\nENTER THE CHOICE\n");
            Scanner scw=new Scanner(System.in);
            choice=scw.nextInt();
            switch(choice)
            { case 1:oAc.deposit();
                oAc.display();
                break;
                case 2:oAc.withdrawal();
                    oAc.display();
                    break;
                case 3:oAc.checkbalance();
                    break;
            }
            System.out.println("WANT TO CONTINUE ENTER 1(YES) OR 0(NO)\n");
            num=scw.nextInt();
            if(num==0)
            { System.out.println("THANK YOU VISIT AGAIN");
            }
        }
    }
}
