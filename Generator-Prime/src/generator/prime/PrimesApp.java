package generator.prime;

import generator.prime.calculation.GeneratePrimes;
import generator.prime.show.ShowPrimes;
import java.util.List;

public class PrimesApp {


    public static void main(String[] args) {
        GeneratePrimes generatePrimes = new GeneratePrimes();
              
        List<Integer> primes = generatePrimes.findPrimes(300);

        ShowPrimes.show_primes_in_columns(primes, 300, 30, ' ','*',true);
        System.out.println("");
        
        
    }
    
}
