import java.util.Vector;

class C{
    public static void main(String[] args){
        Vector<String> str = new Vector<String>();

        str.add("ironman");
        str.add("shaktiman");
        str.add("flash");
        str.add("captan america");// append the end of this vector

        str.add(4,"spiderman");// append element in index 4 of the vector

        System.out.println(str);
    }
}