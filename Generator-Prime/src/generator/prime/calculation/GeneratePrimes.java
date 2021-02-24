
package generator.prime.calculation;

import java.util.ArrayList;
import java.util.List;

public class GeneratePrimes {

    public GeneratePrimes() {}

    public List<String> findPrimes(long target){
        List<String> primes = new ArrayList<>();
        for (int i=2;i<=target;i++){
            if (isPrime(i)){
                primes.add(i+"*");
            } else {
                primes.add(i+"");
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
    
}
