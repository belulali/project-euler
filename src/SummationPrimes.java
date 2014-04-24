import java.util.ArrayList;
import java.util.List;

/**
 * Created by pchavez on 24/04/14.
 */
public class SummationPrimes {

    public boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
            break;
        }
        return true;
    }

    public int sumPrimesBelow(int limit) {
        int result = 0;
        for (int i = 2; i < limit; i++) {
            if (isPrime(i)) {
                result += i;
                System.out.println(result);
            }
        }
        return result;
    }

    public long sumPrimes(int number) {
        List<Long> primes = new ArrayList();
        primes.add(2L);
        primes.add(3L);
        long primeSum = 5;

        for (long primeCandidate = 5; primeCandidate < 2000000; primeCandidate += 2) {
            boolean isPrime = true;
            double squareRootOfPrimeCandidate = Math.sqrt(primeCandidate);

            for (int i = 0; i < primes.size(); i++) {
                Long prime = primes.get(i);
                if (primeCandidate % prime == 0) {
                    isPrime = false;
                    break;
                }
                if (prime > squareRootOfPrimeCandidate) {
                    break;
                }
            }
            if (isPrime) {
                primes.add(primeCandidate);
                primeSum += primeCandidate;
            }
        }
        return primeSum;
    }
}





