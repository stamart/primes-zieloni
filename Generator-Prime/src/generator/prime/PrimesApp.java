package generator.prime;

import generator.prime.calculation.GeneratePrimes;
import java.util.List;

public class PrimesApp {


    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        
        GeneratePrimes generatePrimes = new GeneratePrimes();
              
        List<Integer> primes = generatePrimes.findPrimesFast(2*3*5*7*11*13*17*19);
        long end = System.currentTimeMillis();

        System.out.println((end - start) / 1000.0);
        System.out.println(primes.size());
        
//        ShowPrimes.show_primes_in_columns(primes, 300, 30, ' ','*',true);
        
    }
    
}
