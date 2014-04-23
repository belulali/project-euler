import java.util.ArrayList;
import java.util.List;

/**
 * Created by pchavez on 23/04/14.
 */
public class FibonacciNumbers {
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public List<Integer> getFibonacciNumbers(int term) {

        List fibonacciNumbers = new ArrayList();
        int anterior = 1;
        int actual = 2;

        for(int i = 1; i < term; i++){
            if(i <= 2){
                fibonacciNumbers.add(i);
            }else {

                int temporal = anterior + actual;
                fibonacciNumbers.add(temporal);
                anterior = actual;
                actual = temporal;
            }

            if(actual + anterior >= term){
                break;
            }
        }
        return fibonacciNumbers;
    }

    public int sumEvenFibonacciNumbers(int term) {
        List<Integer> fibonacciNumbers = getFibonacciNumbers(term);
        int result = 0;
        for(Integer fibonacci : fibonacciNumbers){
            if(isEven(fibonacci)){
                result += fibonacci;
            }
        }
        return result;
    }
}
