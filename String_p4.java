package String;
import java.util.Scanner;
public class String_p4 {
    public static void main(String[] args) {
        Scanner enter=new Scanner (System.in);
        
        System.out.println("Enter any word: ");
        String st=enter.nextLine();
        String[]sarr=new String[st.length()];
        int num1=enter.nextInt();
        int num2=enter.nextInt();
        String result="";
        for(int i=num1;i<num2;i++)
            result+=st.charAt(i);
        
        System.out.println(result);
    }
}
