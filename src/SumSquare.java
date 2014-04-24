/**
 * Created by pchavez on 24/04/14.
 */
public class SumSquare {
    public int sumSquareOfNumbersUntil(int number) {
        int result = 0;
        for(int i = 0; i <= number; i++){
            double power = Math.pow(i, 2);
            result += power;
        }
        return result;
    }

    public int squareOfSumOfNumbersUntil(int number) {
        int result = 0;
        for(int i = 0; i <= number; i++){
            result += i;
        }
        result = (int) Math.pow(result, 2);
        return result;
    }

    public int difference(int number) {
        int sumOfSquares = sumSquareOfNumbersUntil(number);
        int squareOfSum = squareOfSumOfNumbersUntil(number);
        return squareOfSum - sumOfSquares;
    }
}
