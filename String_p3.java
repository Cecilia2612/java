package String;
import java.util.Scanner;
public class String_p3 {
    public static void main(String[] args) {
        Scanner enter=new Scanner(System.in);
        
        /*
        System.out.println("Enter the first name: ");
        String name1=enter.nextLine();
        System.out.println("Enter the second name: ");
        String name2=enter.nextLine();
        if(name1.compareToIgnoreCase(name2)<0)
            System.out.println(name1+"\n"+name2);
        else
            System.out.println(name2+"\n"+name1);
        */
        
        
        /*
        System.out.println("Enter the first name: ");
        String name1=enter.nextLine();
        char[]carr=new char[name1.length()];
        for(int i =0;i<name1.length();i++)
            carr[i]=name1.charAt(i);
        for(char a:carr)
            System.out.println(a);
        */
        
        
        System.out.println("Enter any word: ");
        String st=enter.nextLine();
        String[]sarr=new String[st.length()];
        int num=enter.nextInt();
        String result="";
        for(int i=num;i<st.length();i++)
            result+=st.charAt(i);
        
        System.out.println(result);
        
        
    }
}
