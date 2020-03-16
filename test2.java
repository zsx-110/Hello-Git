package Test;
/**
 * 3.数字 a{1,3,5,7,9}  b{2,4,6,8,10},将两个数组合并，并按照从小到大的顺序排序，生成新数组。
 */
public class test2 {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 4, 6, 8, 10};
        printArray(merge(a, b));  //调用printArray方法，并将merge方法的返回值传给printArray
    }
    public static int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0; //i用于标记数组a
        int j = 0; //j用于标记数组b
        int k = 0; //用于标记数组c
        while (i < a.length && j < b.length) {  //a，b数组都有元素时
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        while (i < a.length) {   //若a有剩余
            c[k++] = a[i++];
        }
        while (j < b.length) {   //若b有剩余
            c[k++] = b[j++];
        }
        return c;
    }
    public static void printArray(int[] arr) {   //打印数组
        for (int i : arr) {
            System.out.print(i + " \t ");
        }
    }
}