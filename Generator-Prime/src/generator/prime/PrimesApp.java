package generator.prime;

import generator.prime.calculation.GeneratePrimes;
import generator.prime.show.ShowPrimes;
import java.util.List;

public class PrimesApp {


    public static void main(String[] args) {
        List<Integer> primes = GeneratePrimes.find_primes();
        ShowPrimes.show_primes(primes);
    }
    
}
