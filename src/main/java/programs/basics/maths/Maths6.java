package programs.basics.maths;

public class Maths6 {
    public static void main(String[] args) {
        Maths6 obj = new Maths6();
        System.out.println(obj.isPrime(5));
        System.out.println(obj.isPrime(11));
        System.out.println(obj.isPrime(17));
        System.out.println(obj.isPrime(4));
        System.out.println(obj.isPrime2(5));
        System.out.println(obj.isPrime2(11));
        System.out.println(obj.isPrime2(17));
        System.out.println(obj.isPrime2(4));
    }

    public String isPrime(int num) {
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                count++;
                if (num / i != i) {
                    count++;
                }
            }

        }
        if (count == 2) {
            return "YES";
        } else
            return "NO";
    }
//better optimized

    public String isPrime2(int num) {
        if (num <= 1) {
            return "NO";
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return "NO";
            }
        }
        return "YES";
    }

    //brute force approach
    public String isPrime3(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return "YES";
        } else
            return "NO";
    }
}
