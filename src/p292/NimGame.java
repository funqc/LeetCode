package p292;

/**
 * Created by fuqunchao on 15/11/18.
 */
public class NimGame {

    /*
    只有当石子个数为4的倍数的时候,先手能赢
     */
    public static boolean canWinNim(int n) {
        if (n % 4 == 0) return false;
        else return true;
    }
}
