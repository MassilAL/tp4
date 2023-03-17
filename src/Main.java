import java.util.ArrayList;
import java.util.Collections;
import java.util.ArrayList;

public class Main {


        public static void main(String[] args) {
            String[] tab = {"ba", "sherif", "clara", "zassil", "leo"};
            int[] tableau = {2,3,5,1,10,7,4};
            tab = alphabet(tab);
            tableau = trinombre(tableau);
            System.out.println(tab);

            for(int a: tableau){
                System.out.println(a+ "");
            }

        }


        public static String[] alphabet(String[] arr){
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j].compareTo(arr[j + 1]) > 0) {
                        String temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            for (String s : arr) {
                System.out.println(s);
            }
            return arr;
        }

        public static int[] trinombre(int[] t){
            int nb=t.length;
            for (int i=0; i < nb;i++) {
                for (int j =i;j < nb; j++) {
                    if (t[j]<t[i]) {
                        int a = t[i];
                        t[i]=t[j];
                        t[j]=a;
                    }
                }
            }
            return t;
        }
}