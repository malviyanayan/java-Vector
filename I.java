import java.util.Vector;

class I{
    public static void main(String[] args){
        Vector<int[]> x = new Vector<int[]>();

        // System.out.println("Working");
        int[] x1 = {1,2,3,4,5};
        int[] x2 = {3,4,5,6,7};

        System.out.println(x);
        x.add(x1);
        x.add(x2);

        System.out.println(x);
    }
}