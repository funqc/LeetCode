package p258;

import org.junit.Test;

/**
 * Created by fuqunchao on 15/11/19.
 */
public class AddDigits {
    public int addDigits1(int num) {
        int next = getNext(num);
        while (next > 10) {
            next = getNext(num);
        }
        return next;
    }

    private int getNext(int num) {
        String str = String.valueOf(num);
        int sum = 0;
        for(char ch : str.toCharArray()) {
            sum += (ch - '0');
        }
        return sum;
    }

    public int addDigits(int num) {
        return (num -1) % 9 + 1;
    }

    @Test
    public void testAddDigits2() throws Exception {
        System.out.print(addDigits(38));
    }
}
