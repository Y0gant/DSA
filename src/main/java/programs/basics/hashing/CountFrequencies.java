package programs.basics.hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class FrequencyCounter {

    private final char[] alphabets;
    private int[] hashArray;

    FrequencyCounter() {
        alphabets = new char[26];
        for (int i = 0; i < alphabets.length; i++) {
            alphabets[i] = (char) ('a' + i);
        }
    }


    public void printCharCount() {

        for (int i = 0; i < 26; i++) {
            if (hashArray[i] != 0) {
                System.out.print(alphabets[i] + "=" + hashArray[i] + " ,");
            }
        }
        System.out.println();
    }

    public void characterCount(String str) {
        int n = str.length();
        hashArray = new int[26];//27-Alphabets
        String s = str.toLowerCase();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                hashArray[c - 'a'] += 1;
            }
        }
        printCharCount();
    }

    //Using Arraylist
    public List<Integer> frequencyCount(int[] arr) {
        int n = arr.length;
        List<Integer> hashArr = new ArrayList<>(Collections.nCopies(n, 0));
        for (int i = 0; i < n; i++) {
            int num = arr[i]; // Get the number at index i
            if (num >= 1 && num <= n) {
                hashArr.set(num - 1, hashArr.get(num - 1) + 1);
            }
        }
        return hashArr;
    }

    //Using array
    public int[] f(int[] arr) {
        int n = arr.length;
        hashArray = new int[n];
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            if (num >= 1 && num <= n) {
                hashArray[num - 1] += 1;
            }
        }
        return hashArray;
    }

    //Get count of specific number
    public int find(int r) {
       /* Edge case if input is smaller than or equals 0
        or is bigger than the size of hashArray*/
        if (r <= 0 || r > hashArray.length) {
            return 0;
        }

        return hashArray[r - 1];
    }
}

public class CountFrequencies {


    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 3, 3, 4, 4, 4, 5, 6, 6, 6};
        FrequencyCounter count = new FrequencyCounter();
        System.out.println(count.frequencyCount(arr));

        int[] ans = count.f(arr);
        for (int t : ans) {
            System.out.print(t + " ");
        }
        System.out.println();

        System.out.println("Frequency of 6 in given array = " + count.find(6));
        System.out.println("Frequency of 40 in given array = " + count.find(40));
        System.out.println("Frequency of -1 in given array = " + count.find(-1));


        //counting string character elements
        String s = "Hey there!! I am a Master's student pursuing " +
                "computer science, passionate about Full stack development, and problem-solving." +
                " Currently, I am invested in Java and DSA, SQL-NoSql databases, and technologies such as Spring Boot, Hibernate and RESTful APIs." +
                " As for new things: DevOps tools- Docker CI/CD pipelines and cloud technologies to improve the deployment and scalability of applications." +
                " I am interested in software architecture and distributed systems," +
                " and I always try to write clean, maintainable, and structured code!" +
                "Open to collaboration. Excited to learn new technologies!";
        count.characterCount(s);

    }

}
