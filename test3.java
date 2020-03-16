package Test;

/**
 * 1.字符串：“Hello World!”，在字符串前面拼接自己的名字。
 */
public class test3 {
    public static void main(String[] args) {
        String str = "Hello World!";
        String str1 = "周少雄，";
        System.out.println(str1.concat(str));
    }
}
