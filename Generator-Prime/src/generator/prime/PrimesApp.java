package generator.prime;

import generator.prime.calculation.GeneratePrimes;
import generator.prime.show.ShowPrimes;
import java.util.List;

public class PrimesApp {


    public static void main(String[] args) {
        GeneratePrimes generatePrimes = new GeneratePrimes();
        List<String> primes = generatePrimes.findPrimes(100);

        ShowPrimes.show_primes(primes);
    }
    
}
