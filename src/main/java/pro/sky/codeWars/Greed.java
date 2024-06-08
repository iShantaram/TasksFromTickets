package pro.sky.codeWars;

public class Greed {

    public static int greedy(int[] dice) {
        int sum = 0;
        int[] counts = new int[7];
        for (int d:dice) {
            counts[d]++;
        }
        sum += counts[1]/3*700 + counts[1]*100;
        sum += counts[2]/3*200;
        sum += counts[3]/3*300;
        sum += counts[4]/3*400;
        sum += counts[5]/3*350 + counts[5]*50;
        sum += counts[6]/3*600;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(greedy(new int[]{1,5,5,1,1}));
    }
}
