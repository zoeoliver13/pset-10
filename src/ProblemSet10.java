import java.util.Arrays;

public class ProblemSet10 {

    public static void main(String[] args) {
    }

    /////////////// EXERCISE 1  ///////////////
    public static String[] fizzBuzz(int start, int end) {
        String [] str = new String [end-start];
        int index = 0;
        if (start >= end) {
            return null;
        }

        for (int i = start; i < end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                str[index] = "FizzBuzz";
                index++;
            } else if (i % 3 == 0) {
                str[index] = "Fizz";
                index++;
            } else if (i % 5 == 0) {
                str[index] = "Buzz";
                index++;
            } else {
                str[index] = Integer.toString(i);
                index++;
            }
        }
        return str;

        }//DONE

    /////////////// EXERCISE 2  ///////////////
    public int maxSpan(int[] numbers) {
        int maxSpan = 0
        , count;
        count = 0;

        if(numbers == null){
            return -1;
        }

        for(int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                count++;
                if (numbers[i] == numbers[j]) {
                    if (count > maxSpan) {
                        maxSpan = count;
                    }
                }
             }
          }
            return maxSpan;
        } //DONE


    /////////////// EXERCISE 3  ///////////////
    public int[] fix34(int[] numbers) {
        int frequency1 = 0;
        int frequency2 = 0;
        int three = 3;
        int four = 4;
        int index = 1;


        if(numbers == null){
            return null;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == four) {
                frequency1++;
            }
            else {
                frequency1 = frequency1;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == three) {
                frequency2++;
            }
            else {
                frequency2 = frequency2;
            }

            if(numbers[i] == four && frequency2 < 1){
                return null;
            }
        }
        if(frequency1 != frequency2){
            return null;
        }
        for(int i = 0; i < numbers.length; i++) {
            if (numbers[numbers.length - 1] == three) {
                return null;
            }
        }
        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] == three && numbers[i + 1] == three) {
                return null;
            }
        }
        for(int i = 0; i < numbers.length - 1; i++) {
            if(numbers[i] == 3 && numbers[i+1] != 4) {
                for(; numbers[index] != 4; index++);
                numbers[index] = numbers[i+1];
                numbers[i+1] = 4;
            }
        }
        return numbers;

    } //DONE

    /////////////// EXERCISE 4  ///////////////
    public int[] fix45(int[] numbers) {

        int frequency1 = 0;
        int frequency2 = 0;
        int four = 4;
        int five = 5;

        if(numbers == null){
            return null;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == four) {
                frequency1++;
            }
            else {
                frequency1 = frequency1;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == five) {
                frequency2++;
            }
            else {
                frequency2 = frequency2;
            }
        }
        if(frequency1 != frequency2){
            return null;
        }
        for(int i = 0; i < numbers.length; i++) {
            if (numbers[numbers.length-1] == four) {
                return null;
            }
        }

        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] == four && numbers[i + 1] == four) {
                return null;
            }
        }

          int index = 0;
              for (int i = 0; i < numbers.length - 1; i++) {
                  if (numbers[i] == 4 && numbers[i + 1] != 5) {
                      for (; !(numbers[index] == 5 && (index == 0 || index > 0 && numbers[index - 1] != 4)); index++) ;
                      numbers[index] = numbers[i + 1];
                      numbers[i + 1] = 5;
                  }
              }

              return numbers;
          }
    //DONE



    /////////////// EXERCISE 5  ///////////////
    public boolean canBalance(int[] numbers) {
        int left = 0;
        int right = 0;

        if(numbers == null){
            return false;
        }
        if(numbers.length == 0){
            return false;
        }

        for(int i = 0; i < numbers.length - 1; i++) {
            left += numbers[i];
            right = numbers[numbers.length - 1];
        }
        for(int i = numbers.length - 2; i > 0; i--) {
            if(left == right)
                return true;
            left -= numbers[i];
            right += numbers[i];
        }
        return (left == right);

    }//DONE

    /////////////// EXERCISE 6  ///////////////
    public boolean linearIn(int[] outer, int[] inner) {

        boolean ifPresent;

        for(int i = 0; i < outer.length-1; i++) {
            if (outer[i] > outer[i+1]) {
                return false;
            }
        }
        for(int i = 0; i < inner.length-1; i++){
            if(inner[i] > inner[i+1]){
                return false;
            }
        }
        if(inner == null || outer == null){
            return false;
        }
        if(inner.length == 0 || outer.length == 0){
            return false;
        }

        for(int i = 0, j = 0;  i < inner.length; i++) {
            ifPresent = true;
            for(; j < outer.length && ifPresent; j++) {
                if(inner[i] == outer[j])
                    ifPresent = false;
            }
            if(ifPresent)
                return false;
        }
        return true;
        } //DONE


    /////////////// EXERCISE 7  ///////////////
    public int[] squareUp(int n) {
        if(n >= 0 ){
            int [] index = new int [n*n];
            int square;

            for(int i = 1; i <= n; i++){
                square = n*i-1;
                for(int j = 1; j <= i; j++, square--){
                    index[square] = j;
                }
            }
            return index;

        }
        else{
            return null;
        }
    }//DONE

    /////////////// EXERCISE 8  ///////////////
    public int[] seriesUp(int n) {
        if (n >= 0) {
            int[] index = new int[n * (n + 1) / 2];
            int series = 0;

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++, series++) {
                    index[series] = j;
                }
            }
            return index;
        } else {
            return null;
        }
    }//DONE

    /////////////// EXERCISE 9  ///////////////
    public int maxMirror(int[] numbers) {
        if(numbers == null){
            return -1;
        }

        int max = 0;
        for (int x = 0; x < numbers.length; ++x)
            for (int y = max + 1; y < numbers.length - x + 1; ++y)
                for (int z = x; z < numbers.length - y + 1; ++z) {
                    Boolean ifMirror = true;

                    for (int i = 0; ifMirror && i < y; ++i)

                        ifMirror = numbers[x + i] == numbers[z + y - i - 1];

                    if (ifMirror) max = y;

                }

        return max;
    }

    /////////////// EXERCISE 10  ///////////////
    public int countClumps(int[] numbers) {
        int count = 0;
        boolean clump = false;

        if(numbers == null){
            return -1;
        }
        for(int i = 0; i < numbers.length - 1; i++) {
            if(clump) {
                if(numbers[i] != numbers[i+1])
                    clump = false;
            }
            else if(numbers[i] == numbers[i+1]) {
                clump = true;
                count++;
            }
        }
        return count;
    }

}
