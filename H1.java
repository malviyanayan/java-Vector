import java.util.Vector;
import java.util.LinkedList;

class H1{
    public static void main(String[] args){
        Vector<String> str = new Vector<String>();

        str.add("ironman");
        str.add("shaktiman");
        str.add("flash");
        str.add("captan america");

        System.out.println(str);
        System.out.println(str.contains("shaktiman"));  // return true if same element found
        System.out.println(str);

        // containsAll method

        LinkedList<String> x = new LinkedList<String>();
        x.add("shaktiman");
        // x.add("flash");
        x.add("ironman");
        // str.addAll(x);  
        System.out.println(x);

        System.out.println(str.containsAll(x));

        x.add("krish");
        
        System.out.println(x);
        System.out.println(str.containsAll(x));




    }
}
