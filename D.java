import java.util.Vector;

class D{
    public static void main(String[] args){
        Vector<String> str = new Vector<String>();

        str.add("ironman");
        str.add("shaktiman");
        str.add("flash");
        str.add("captan america");

       Vector<String> str1 = new Vector<String>();
       str1.add("krish");
       str1.add("spiderman");
       str1.add("thor");
       str1.add("hulk");

       System.out.println("is add : " + str.addAll(2,str1));
       // str1 ke saare elements str me 2 index se jud chuke hai

        System.out.println(str);
    }
}