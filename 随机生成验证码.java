package study.day2;

import java.util.Random;
import java.util.Scanner;

public class Programming_thinking_training2 {
    public static void main(String[] args) {
//        开发一个程序，可以生成指定位数的验证码，每位可以是数字、大小写字母。
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 100; i++) {


        System.out.println("请输入验证码长度");
        System.out.println(yanzhengma(sc.nextInt()));
        System.out.println("请输入验证码长度");
        System.out.println(yanzhengma(sc.nextInt()));
    }
    }

    public static String yanzhengma(int n ){
        Random r = new Random();
        String arr1 = "";
        for (int i = 1; i <= n; i++) {
            int type = r.nextInt(3 );
            if (type == 0){
                arr1 += r.nextInt(10);
            }else if(type == 1){
                arr1 += (char) (r.nextInt(26)+65);
            }else if (type == 2){
                arr1 += (char) (r.nextInt(26)+97);
            }

        }
        return arr1;
    }
}
