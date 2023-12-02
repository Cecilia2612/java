package blank;

public class Blank {
    public static void main(String[] args) {
        String s1="Hello!";
        StringBuffer sb=new StringBuffer (s1);
        sb.append("Hi!");
        String s2 = new String (sb);
        System.out.println(s2);
    }
}
