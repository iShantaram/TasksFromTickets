package pro.sky.codeWars;

import java.util.Scanner;

public class NextNumberWithSame1Bits {
    /**
     * @param n entry integer number
     * @return the next higher number with the same number of '1'-bits
     */
    public static int nextHigher(int n) {
        if(n == 0){
            System.out.println("No one higher number has the same '1' bits");
            return 0;
        }

        char[] symbols = ("0"+Integer.toBinaryString(n)).toCharArray();
        int positionZero = 0;
        int positionOne = 0;
        int l = symbols.length;
        if (symbols[l - 1] == '1') {
            for (int i = 1; i < l; i++) {
                if (symbols[l - 1 - i] == '0') {
                    positionZero = i+1;
                    break;
                }
            }
            symbols[l-positionZero] = '1';
            symbols[l-positionZero+1] = '0';
        } else {
            for (int i = 1; i < l; i++) {
                if (symbols[l - 1 - i] == '1') {
                    positionOne = i+1;
                    break;
                }
            }
            for (int i = positionOne; i < l; i++) {
                if (symbols[l - 1 - i] == '0') {
                    positionZero = i+1;
                    break;
                }
            }
            symbols[l-positionZero] = '1';
            for (int i = l-positionZero+1; i < l; i++) {
                if (l - i < positionZero - positionOne) {
                    symbols[i] = '1';
                } else {
                    symbols[i] = '0';
                }
            }
        }
        if (symbols[0] == '1' && symbols.length >= 32) {
            System.out.println("The next higher number is over than " + Integer.MAX_VALUE);
            return -1;
        }
        return Integer.parseInt(new String(symbols), 2);
    }

    public static void main(String[] args) {
        int number = 1;
        while(number > 0) {
            System.out.println("Enter the number:");
            number = new Scanner(System.in).nextInt();
            System.out.println("Next int with same '1' Bits for number \"" + number + "\" is: ");
            System.out.println(nextHigher(number));
        }
    }

    public static int nextHigherBest(int n) {
        int o = n & -n;
        return n + o | ((n ^ n + o) / o >> 2);
    }
}
