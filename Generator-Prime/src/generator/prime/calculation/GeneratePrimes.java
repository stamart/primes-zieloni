package generator.prime.calculation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

    public static List<Integer> findPrimesFast(int n) {
        boolean prime[] = new boolean[n + 1];
        Arrays.fill(prime, true);
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * 2; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        List<Integer> primeNumbers = new LinkedList<>();
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }
}
