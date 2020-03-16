package Test;
/**
 * 2.数组{1,2,3,4,5,5,5,5,5,6,7,8,9}，去掉数组中的 5 生成新的数组。
 */
public class test1 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 5, 5, 5, 5, 6, 7, 8, 9};
        int len = 0;
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 5) {
                len++;
            }
        }
        int[] b = new int[len];
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 5) {
                b[s] = a[i];
                s++;
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + "\t");
        }
    }
}