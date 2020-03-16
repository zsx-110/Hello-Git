package Test;

/**
 * 2.字符串“1,2,3,4,5,6,7”，根据“，”分开，将其转化为字符串数组，并在控制台打印。
 */
public class test4 {
    public static void main(String[] args) {
        String str = "1,2,3,4,5,6,7";
        String[] a = str.split(",");
        for (String s : a) {
            System.out.print(s + "\t");
        }
    }
}
