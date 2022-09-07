import java.util.Arrays;
import java.util.Locale;
import java.util.function.Function;

public class Calculator {
    interface InterfaceMath {
        int operation(int a,int b);
    }
    public int BinaryIntOperator(int a,int b,InterfaceMath intO){
        return intO.operation(a,b);
    }

    public static void main(String[] args) {

        /*Calculator c = new Calculator();
        InterfaceMath add = (a , b) -> a + b;
        InterfaceMath sub = (a,b) -> a - b ;
        System.out.println("a+b:"+c.BinaryIntOperator(40,2,add));
        System.out.println("a+b:"+c.BinaryIntOperator(20,10,sub));*/
        /*String str1 = "Bored";
        String str2 = "Robed";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();


        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.equals(ch1,ch2));

        System.out.println(ch1);
        System.out.println(ch2);*/

        String str = "rotator";
        StringBuilder strCompare = new StringBuilder(str);
        strCompare.reverse();

        if(strCompare.toString().equals(str))
            System.out.println(true);

        /*char[] charStr = str.toCharArray();
        String strCompare ="";

        for(int i=charStr.length -1 ; i >= 0; i --) {
            strCompare += charStr[i];
        }
*/
        if(str.equals(strCompare))
            System.out.println(true);
    }
}


