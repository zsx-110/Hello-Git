package Test;
/**
 * 1.数组排序：{1,23,6,74,8,19,104} 按 从小到大排序
 */
public class test {
    public static void main(String[] args) {
        int[] a = {1, 23, 6, 74, 8, 19, 104};
        int temp = 0;
        for (int i = 0; i < a.length - 1; i++)
        {
            for (int j = 0; j < a.length - i - 1; j++)
            {
                if (a[j] > a[j + 1])
                {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}