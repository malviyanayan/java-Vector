import java.util.Vector;


class K{
    public static void main(String[] args){
        Vector<Integer> x = new Vector<Integer>();
        x.setSize(20);
        System.out.println(x.capacity());
        x.add(12);
        x.add(13);
        x.add(14);

        System.out.println(x);

        x.add(15);
        System.out.println(x);
        
        
System.out.println(x.capacity());
    }
}