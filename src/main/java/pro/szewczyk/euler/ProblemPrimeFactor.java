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

    private boolean isPrime(final long primeToCheck) {
        for (int i = 1; i < primeToCheck / 2 + 1; i += 2) {
            if (i % primeToCheck == 0) {
                return false;
            }
        }
        return true;
    }
}
