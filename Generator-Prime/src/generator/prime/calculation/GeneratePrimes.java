package generator.prime.calculation;

import java.util.ArrayList;
import java.util.List;

public class GeneratePrimes {

    public GeneratePrimes() {
    }

    public List<Integer> findPrimes(long target) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= target; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    private boolean isPrime(long number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static Boolean isCursedPrime(int team, int number) {
        String courseNumber = String.valueOf(team);
        Integer checkNumber = String.valueOf(number).indexOf(courseNumber);
        if (checkNumber == -1) {
            return false;
        }
        return true;
    }

}
