package pro.sky.codeWars;

public class Prime {
    public static boolean isPrime(int num) {
        int sqrt = (int) Math.sqrt(num);
        if (num < 2) return false;
        if (num == 2) return true;
        if ((num % 2) == 0) return false;
        for (int i = 3; i <= sqrt; i+=2) {
            if(num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 7;
        String not = "";
        if (!isPrime(n)) not = "NOT ";
        System.out.println(n + " is " + not + "prime");
    }
}

