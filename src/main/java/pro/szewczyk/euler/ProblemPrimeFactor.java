package pro.szewczyk.euler;

public class ProblemPrimeFactor extends AbstractProblem<Long> {

    private static final Long THE_NUMBER = 851_475_143l;

    @Override
    public Long solveProblem() {
        Long prime = null;
        for (long i = 1; i < THE_NUMBER / 2; i += 2) {
            if (THE_NUMBER % i == 0) {
                System.out.print(i);
                prime = i;
                if (isPrime(i)) {
                    System.out.println("prime");
                } else {
                    System.out.println(" not prime");
                }
            }
        }

        return prime;
    }

    public boolean isPrime(final long primeToCheck) {
        if (primeToCheck == 2l) {
            return true;
        }
        if (primeToCheck <= 0l || primeToCheck % 2 == 0) {
            return false;
        }
        for (int i = 3; i < Math.sqrt(primeToCheck); i += 2) {
            if (primeToCheck % i == 0) {
                return false;
            }
        }
        return true;
    }
}
