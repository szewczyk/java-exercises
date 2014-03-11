package pro.szewczyk.euler;

public class PrimeFactor {

    public boolean isPrime(final long primeToCheck) {
        if (primeToCheck == 2l) {
            return true;
        }
        if (primeToCheck <= 0l || primeToCheck % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(primeToCheck); i += 2) {
            if (primeToCheck % i == 0) {
                return false;
            }
        }
        return true;
    }
}
