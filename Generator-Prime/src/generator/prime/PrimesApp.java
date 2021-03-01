package generator.prime;

import generator.prime.calculation.GeneratePrimes;
import generator.prime.show.ShowPrimes;
import java.util.List;

public class PrimesApp {


    public static void main(String[] args) {
        GeneratePrimes generatePrimes = new GeneratePrimes();
      
        
        List<Integer> primes = generatePrimes.findPrimes(240);

        ShowPrimes.show_primes_in_columns(primes, 240, 30, ' ','*',true);
        System.out.println("");
        ShowPrimes.show_primes_in_columns(primes, 240, 6,' ','*',true); 
        
    }
    
}
