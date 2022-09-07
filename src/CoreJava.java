import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CoreJava {

    public static void main(String[] args) {
        int [] elements = {2,1,4,3,6,5};
        int [] result = new int[6];
        int count = 1;
        int temp = 0;
        int k =3;
        int back = 0;
        int front = 0;
        int location = 0 ;

        List<Integer> numbers = List.of(5,10,25,45,31,16,23,51);
        List<Integer> numbersList = new LinkedList<>(numbers);

        for (int i=0;i<numbersList.size();i++) {
            front = numbersList.get(k-1);
            numbersList.remove(k-1);
            back = numbersList.get(numbersList.size()-(k));
            numbersList.add(k-1,back);

        }
        location = numbersList.size()-(k-1);
        location++;
        System.out.println("location: "+ location);
       // numbersList.remove(location);
        //numbersList.remove(location);
      //      numbersList.add(location,back);


        numbersList.forEach( number -> System.out.print(" "+ number));

       // System.exit(0);


        for (int i=0;i<elements.length;i++) {
            if( i == elements.length-1 && elements.length % 2 != 0) {
                result[i] = elements[elements.length-1];
                break;
            }
            if(count % 2 !=0) {
                result[i] = elements[i+1] ;
                temp = elements[i];
            } else {
                result[i] = temp;
            }
            count ++;

        }

        System.out.println(Arrays.toString(result));
    }
}
