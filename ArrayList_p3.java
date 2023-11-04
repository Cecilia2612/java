package ArrayListt;

import java.util.ArrayList;

public class ArrayList_p3 {
    public static void main(String[] args) {
        ArrayList <String> a = new ArrayList <>();
        System.out.println(a.size());//0
        a.add("CS");
        a.add("CIS");
        a.add("SE");
        a.add("CGA");
        System.out.println(a.size());//4
        System.out.println(a);//[CS, CIS, SE, CGA]
        System.out.println(a.get(1));//CIS
        String s1=a.get(2);
        System.out.println(s1);//SE
        System.out.println(a.contains("CS"));//true
        
        if(a.contains("Law"))
            System.out.println("Yes");
        else
            System.out.println("No");
        //No
        
        System.out.println(a.indexOf("SE"));//2
        System.out.println(a.indexOf("AIS"));//-1
        //System.out.println(a.indexOf(2,"CS"));//error
        a.add("CIS");
        a.add("Security");
        System.out.println(a);//[CS, CIS, SE, CGA, CIS, Security]
        
        System.out.println(a.lastIndexOf("CIS"));//4
        
        a.set(2, "AI");
        System.out.println(a);//[CS, CIS, AI, CGA, CIS, Security]
        a.add(3,"VR");
        System.out.println(a);//[CS, CIS, AI, VR, CGA, CIS, Security]
        
        a.remove(2);
        System.out.println(a);//[CS, CIS, VR, CGA, CIS, Security]
        a.remove("CIS");
        System.out.println(a);//[CS, VR, CGA, CIS, Security]
        boolean w=a.remove("CS");
        System.out.println(a);//[VR, CGA, CIS, Security]
        System.out.println(w);//true
        a.add(0,"CS");
        
        a.clear();
        System.out.println(a);//[]
        System.out.println(a.size());//0
        
    }
}
