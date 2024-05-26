import java.util.Vector;
import java.util.LinkedList;

class E{
    public static void main(String[] args){
        Vector<String> str = new Vector<String>();

        str.add("ironman");
        str.add("shaktiman");
        str.add("flash");
        str.add("captan america");
        str.add("ironman");
        str.add("shaktiman");
        str.add("flash");
        str.add("captan america");
        str.add("captan america");
        str.add("ironman");
        
        System.out.println("Capacity : " + str.capacity());
        str.addElement("krish");
        System.out.println("Capacity : " + str.capacity());
      

        System.out.println(str);
    }
}