package generator.prime.show;

import java.util.List;

/**
 * Klasa odpowiada za wypisywanie liczb pierwszych
 *
 * @author Marcin Pham
 * @version 1.1, 2021-02-24
 */
public class ShowPrimes {
    /**
     * Wypisuje liczby od 1 do 120
     * w rzędach po 6 liczb, oznaczając liczby
     * pierwsze znakiem "*".
     * Ostatni wiersz zawiera podsumowanie
     * liczby liczb pierwszych w danej kolumnie.
     *
     * @param primes Lista liczb pierwszych
     */
    public static void show_primes(List<Integer> primes) {
        show_primes_in_columns(primes, 120, 6, ' ', '*', true);
    }

    /**
     * Wypisuje w zadanej liczbie kolumn liczby z oznaczeniem liczb pierwszych.
     *
     * @param primes              Lista liczb pierwszych
     * @param maxNumberToGenerate Maksymalna liczba do wypisania
     * @param numberOfColumns     Liczba kolumn w rzędzie
     * @param numberSeparator     Separator liczb
     * @param primeMarker         Znacznik liczby pierwszej
     * @param showSummary         Czy wyświetlać podsumowanie
     */
    static void show_primes_in_columns(List<Integer> primes, int maxNumberToGenerate, int numberOfColumns, char numberSeparator, char primeMarker, boolean showSummary) {
        String primesOutput = "";
        int numberOfPrimes = primes.size();
        int cellLength = Integer.toString(maxNumberToGenerate).length() + 1; // dodatkowy znak na ewentualny znacznik liczby pierwszej
        int primesIterator = 0;
        int prime = primes.get(0);
        int[] summary = new int[numberOfColumns + 1]; // dla łatwiejszego wypisywania, pomijamy komórkę o indexie = 0

        for (int numberIterator = 1; numberIterator <= maxNumberToGenerate; numberIterator++) {
            primesOutput += String.format("%" + cellLength + "d", numberIterator); // wypisujemy liczbę razem z poprzedzającymi spacjami
            if (prime == numberIterator) {
                //if(primes.get(primesIterator) == numberIterator){
                primesOutput += primeMarker; // oznaczamy liczbę pierwszą
                /*
                 * Zliczamy liczby pierwsze w kolumnie
                 * Wynik zapisujemy do tabeli podsumowania, wyliczając kolumnę przez obliczenie reszty z dzielenia
                 * danej liczby przez liczbę kolumn.
                 * Jeśli trafimy na ostatnią kolumnę, to wynik zapisujemy w ostatniej komórce tabeli,
                 * a nie w pierwszej (o indexie = 0)
                 */
                summary[(numberIterator % numberOfColumns) > 0 ? (numberIterator % numberOfColumns) : numberOfColumns]++;
                if (primesIterator < (numberOfPrimes - 1)) {
                    primesIterator++;
                    prime = primes.get(primesIterator);
                }
            } else {
                primesOutput += numberSeparator;
            }
            if (numberIterator % numberOfColumns == 0) {
                primesOutput += System.lineSeparator();
            }
        }
        if (showSummary == true) {
            primesOutput += String.format("%0" + numberOfColumns * (cellLength + 1) + "d", 0).replace("0", "-") + System.lineSeparator();
            for (int i = 1; i <= numberOfColumns; i++) {
                primesOutput += String.format("%" + cellLength + "d", summary[i]) + numberSeparator;
            }
        }
        System.out.print(primesOutput);
    }
}
