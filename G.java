import java.util.Vector;

class G{
    public static void main(String[] args){
        Vector<String> str = new Vector<String>();

        str.add("ironman");
        str.add("shaktiman");
        str.add("flash");
        str.add("captan america");

        Vector<String> str1 = (Vector)str.clone();  // str ka clone return hoga
        System.out.println(str);
        System.out.println(str1);

        str1.add("krish");   // chack ker rhe hai ki clone hi return hoga ya same object ka refrence code

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(str);
        System.out.println(str1);

    }
}



