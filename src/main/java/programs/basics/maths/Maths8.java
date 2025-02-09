package programs.basics.maths;

//Print all Prime Factors
public class Maths8 {
    public static void main(String[] args) {
        Maths8 obj = new Maths8();
        obj.printAllPrimeFactors(15);
        obj.printAllPrimeFactors(1634);
        obj.printAllPrimeFactors(60);
        obj.printAllPrimeFactors2(15);
        obj.printAllPrimeFactors2(1634);
        obj.printAllPrimeFactors2(60);
    }

    //optimized solution
    public void printAllPrimeFactors2(int n) {
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.println(i);
                n /= i;
            }
        }
        if (n > 1) System.out.println(n);
        System.out.println("--------------");
    }


    public void printAllPrimeFactors(int n) {
        Maths6 obj = new Maths6();
        if (n <= 1) System.out.println("Invalid Input/Not Prime");
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                if (obj.isPrime(i).equals("YES")) {
                    System.out.println(i);
                }
                if (n / i != i) {
                    if (obj.isPrime(n / i).equals("YES")) {
                        System.out.println(n / i);
                    }
                }
            }
        }
        System.out.println("----------------");
    }
}
