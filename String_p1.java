package String;

import java.util.Scanner;

/*
the difference between string and char
string --> buil in class
char --> datta type
*/
public class String_p1 {
    public static void main(String[] args) {
        //this code prints the array easly :
        String[] sarr={"mouse","keybourd","display"};
        for(String a : sarr)//left:data type+viriable, right:array name
            System.out.println(a);
        
        
        System.out.println("==============================");
        
        
        //ways to defined string:
        String st1="Hello";
        String st2 = new String();
        String st3 = new String ("cup");
        char[]d={'d','o','o','r'};
        String st4 = new String (d);
        System.out.println(st4);
        
        
        System.out.println("==============================");
        
        
        Scanner enter=new Scanner(System.in);
        System.out.println("Enter the first word: ");
        String word1=enter.nextLine();
        System.out.println("Enter the second word: ");
        String word2=enter.nextLine();
        if(word1.length()==word2.length())
            System.out.println("Do have the same length");
        else
            System.out.println("Does NOT have the same length");
        
    }
    
}
