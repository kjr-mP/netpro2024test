package netpro2024.mid_exam.q12;
import java.util.Random;

public class SortBattle {
    public static void main(String[] args) {
        int count = 20000;
        Random r = new Random();

        Thread[] threads1 = new Thread[5];
        Thread[] threads2 = new Thread[5];

        for (int i = 0; i < 5; i++) {
            int[] nums = new int[count];
            // FIXME: nums配列に入るすべての整数値を を1000未満のランダムな数で初期化せよ
						//threads1も実装せよ。
            threads2[i] = new Thread(new JavaUtilSortRunnable(nums));
        }

        // FIXME: Thread をそれぞれ実行せよ
        for (int i = 0; i < 5; i++) {
            threads2[i].start();
        }
    }
}