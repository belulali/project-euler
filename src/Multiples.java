import java.lang.reflect.Array;
import java.util.List;

/**
 * Created by pchavez on 22/04/14.
 */
public class Multiples {

    public boolean isMultipleOfThreeOrFive(int number) {
        if(number % 3 == 0){
            return true;
        }if(number % 5 == 0){
            return true;
        }else
            return false;
    }

    public int sumMultipleNumbersOfThreeAndFive(int number) {
        int sumOfNumbers = 0;
        int i;
        for(i = 1; i < number; i = i + 1){
            if(isMultipleOfThreeOrFive(i)){
               sumOfNumbers = sumOfNumbers + i;
            }
        }
        return sumOfNumbers;
    }
}


