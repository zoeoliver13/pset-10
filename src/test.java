import java.lang.reflect.Array;
import java.util.Arrays;

public class test {
    public static void main(String[] args){
        ProblemSet10 pst = new ProblemSet10();

        int[] iarr = {};
        String [] str = {};
        boolean b = false;
        int i = 0;
        String s = "";
        int[] input1 = {1,2,3,4};
        int[] input2 = {2,3,4};
        String[] input3 = {};
        String[] input4 = {};
        int input5=2;
        int input6=36;

        i= pst.countClumps(input1);
        System.out.printf("%s\n", i);
      // System.out.printf("%s\n", Arrays.toString(iarr));
    }
}
