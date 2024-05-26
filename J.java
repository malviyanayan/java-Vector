import java.util.Vector;

class J{
    public static void main(String[] args){
        Vector<Character> x = new Vector<Character>();
        x.add('a');
        x.add('b');
        x.add('c');
        System.out.println(x);


        Character[] myArray =  new Character[3];

        for(int i=0;i<myArray.length;i++){
            System.out.println(myArray[i]);
        }

        x.copyInto(myArray);

        for(int i=0;i<myArray.length;i++){
            System.out.println(myArray[i]);
        }
    }
}