package String;

import java.util.Scanner;

public class String_p2 {
    public static void main(String[] args) {
        Scanner enter = new Scanner (System.in);
        
        /*
        System.out.println("Enter your phone number(10num):");
        String num1 = enter.nextLine();
        
        if(num1.length()!=10)
            System.out.println("Wrong number!");
        else if(num1.charAt(2)=='9')
                System.out.println("Zain");
            else if(num1.charAt(2)=='8')
                System.out.println("Umnia");
            else if(num1.charAt(2)=='7')
                System.out.println("Orange");
        else
                System.out.println("Incorrect number");
        */
        
        
        /*
        System.out.println("Enter your email: ");
        String email=enter.nextLine();
        int start=email.indexOf('@');
        System.out.println(email.substring(start+1));

        
        System.out.println("Enter your email: ");
        String email1=enter.nextLine();
        int start1=email1.lastIndexOf('@');
        System.out.println(email1.substring(0,start1));
        */
        
        
        
        System.out.println("Enter your full name: ");
        String name=enter.nextLine();
        int space = name.indexOf(' ');
        System.out.println("Your first name: "+name.substring(0,space));
        System.out.println("Your second name: "+name.substring(space));
        
    }
}
