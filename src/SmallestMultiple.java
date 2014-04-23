/**
 * Created by pchavez on 22/04/14.
 */
public class SmallestMultiple {
    public int get(int number) {
        int smallesDivisibleNumber = 1;
        boolean isDivisible = false;

        while (!isDivisible) {
            for (int i = 1; i <= number; i++) {
                isDivisible = isDivisibleBy(smallesDivisibleNumber, i);
                if(!isDivisible){
                    break;
                }
            }
            if (!isDivisible) {
                smallesDivisibleNumber++;
            }
        }
        return smallesDivisibleNumber;
    }

    public boolean isDivisibleBy(int dividend, int divisor) {
        if(dividend % divisor == 0){
        return true;
        }
        return false;
    }

}
