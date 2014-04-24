/**
 * Created by pchavez on 22/04/14.
 */
public class Main {
    public static void main (String[] args) {

        Multiples multiples = new Multiples();
        System.out.println(multiples.sumMultipleNumbersOfThreeAndFive(1000));

        SmallestMultiple smallestMultiple = new SmallestMultiple();
        System.out.println(smallestMultiple.get(20));

        FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
        System.out.println(fibonacciNumbers.sumEvenFibonacciNumbers(4000000));

        SumSquare sumSquare = new SumSquare();
        System.out.println(sumSquare.difference(100));
    }
}
