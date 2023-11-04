package ArrayListt;

import java.util.ArrayList;

public class ArrayList_p2 {
    public static void main(String[] args) {
        ////// Methods in ArrayList built-in class //////
        ArrayList <Integer> a = new ArrayList <>();
        ArrayList <Integer> b = new ArrayList <>();
        
        //1. size
        System.out.println(a.size());//0
        int W=a.size();
        System.out.println(W);//0
        System.out.println("==========================================");
        
        
        //2. add
        b.add(4);//add variable
        b.add(new Integer (7));//add object
        System.out.println(b.size());//2 (two index from the above lines)
        System.out.println(b);//[4,7](to print all the elements in the ArrayList)
        System.out.println(b.add(6));//true(it returns boolean)
        boolean k = b.add(87);
        System.out.println(k);//true
        b.add(1, 13);
        System.out.println(b);//[4,13,7,6,87]
        b.add(0, -8);
        System.out.println(b);//[-8,4,13,7,6,87]
        //System.out.println(b.add(2,23));//error cause it's void method(no return)
        //b.add(6, 63);
        //System.out.println(b);//error(IndexOutOfBoundsException)
        System.out.println("==========================================");
        
        
        //3. get
        ArrayList <Integer> c = new ArrayList <>();
        c.add(11);
        c.add(8);
        System.out.println(c);//[11,8]
        //System.out.println(c[1]);//error
        //c[1]=17;//error
        System.out.println(c.get(0));//11
        int Q = c.get(1);//this data type depinds on the ArrayList type
        System.out.println(Q);//8
        //System.out.println(c.get(2));//run time error
        //System.out.println(c.get(-6));//run time error
        //How to prind the indexes of the ArrayList in the normal way:
        c.add(55);
        for(int i=0;i<c.size();i++)
            System.out.println(c.get(i)); 
        System.out.println("==========================================");
        
        
        //4. contains
        ArrayList <Integer> d = new ArrayList <>();
        d.add(3);
        d.add(-2);
        d.add(9);
        if(d.contains(5))
            System.out.println("It is found");
        else 
            System.out.println("Not found");
        boolean P = d.contains(-2);
        System.out.println(P);//true
        System.out.println("==========================================");
        
        
        //5+6. indexOf/lastIndexOf
        ArrayList <Integer> e = new ArrayList <>();
        e.add(10);
        e.add(2);
        e.add(5);
        e.add(2);
        System.out.println(e);
        System.out.println(e.indexOf(2));//1
        System.out.println(e.indexOf(4));//-1
        //System.out.println(e.indexOf(4,6));//error
        System.out.println(e.lastIndexOf(2));//3
        System.out.println(e.lastIndexOf(8));//-1
        System.out.println(e.lastIndexOf("Hi"));//-1
        System.out.println("==========================================");
        
        
        //7. set
        ArrayList <Integer> f = new ArrayList <>();
        f.add(3);
        f.add(15);
        f.add(-4);
        System.out.println(f);//[3, 15, -4]
        f.set(1, 25);
        System.out.println(f);//[3, 25, -4]
        //f.set(4);//error
        //f.set(3, 90);//error(IndexOutOfBoundsException)
        //f.set(-2, 4)//error
        //This way is used when you want to save the old element:
        System.out.println(f);//[3, 25, -4]
        int x = f.set(1, 4);
        System.out.println(f);//[3, 4, -4]
        System.out.println(x);//25(the old element is saved in x)
        System.out.println(f.set(1, 3));//4(to show you ehat it returns)
        System.out.println("==========================================");
        
        
        //8. remove
        //it has wo forms
        /*1*/ArrayList <Integer> g = new ArrayList <>();
        g.add(5);
        g.add(33);
        g.add(22);
        System.out.println(g);//[5, 33, 22]
        System.out.println(g.size());//3
        g.remove(0);
        System.out.println(g.size());//2
        System.out.println(g);//[33, 22]
        g.add(48);
        g.add(68);
        System.out.println(g);//[33, 22, 48, 68]
        int L=g.remove(3);
        System.out.println(g);//[33, 22, 48]
        System.out.println(L);//68
        /*2*/
        g.remove(new Integer(22));
        System.out.println(g);//[33, 48]
        g.remove(new Integer(44));
        System.out.println(g);//[33, 48](nothing changes)
        g.add(7);
        g.add(10);
        System.out.println(g);//[33, 48, 7, 10]
        boolean E=g.remove(new Integer(7));
        System.out.println(E);//true
        System.out.println(g);//[33, 48, 10]
        g.add(48);
        System.out.println(g);//[33, 48, 10, 48]
        g.remove(new Integer(48));
        System.out.println(g);//[33, 10, 48]
        System.out.println("==========================================");
        
        
        //9. clear
        ArrayList <Integer> h = new ArrayList <>();
        h.add(15);
        h.add(-8);
        h.add(27);
        System.out.println(h);//[15, -8, 27]
        h.clear();
        System.out.println(h);//[]
        System.out.println(h.size());//0
        //System.out.println(h.clear());//It returns no value(void method)
        
    }
}
