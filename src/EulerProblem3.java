/*
Largest prime factor

Problem 3
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?

 */
public class EulerProblem3 {

    public static boolean Prime(long a){
        long s = (long) Math.sqrt(a);

        for (long i = 2; i <= s; i++) if ((a % i) == 0) return false;
        return true;
    }
    public static void main(String[] args) {
        long x = 600851475143L;
        long largestPrimeFactor = 600851475143L;
        //long x = 43932L;
        //long largestPrimeFactor = x;

        if (Prime(x)) {
            System.out.println("The largest prime factor of the number " + x + " is " + x);
        } else {
            //I can see that 2 is not factor of 600851475143
            for (long i = 3; i < (long) (x/2); i++) {
               if ((x % i) == 0) if (Prime(i)) largestPrimeFactor = i;
            }
            System.out.println("The largest prime factor of the number " + x + " is " + largestPrimeFactor);
        }

    }
}
