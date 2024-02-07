package study.day4;

import java.util.Random;
import java.util.Scanner;

public class day4_homework_6 {
    public static void main(String[] args) {
        int[] usernumbers = usernumbers();
        System.out.println("您的号码为");
        print(usernumbers);

        System.out.println("中奖的号码");
        int[] createnumbers = createnumbers();
        print(createnumbers);

        System.out.println("您中奖的位数");
        int[]iii= iii(usernumbers,createnumbers);
        print(iii);
    }
    public static void print(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length-1 ? arr[i] : arr[i] + ",");
        }
        System.out.println("]");
    }
    public static int[] usernumbers(){
        int[] numbers=new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length-1; i++) {


            while (true) {
                System.out.println("请您输入第"+(i+1)+"个红球号码");
                int nummber=sc.nextInt();
                if(nummber<1 || nummber>33){
                    System.out.println("您输入的不在1-33之间");
                } else {
                    if(exist(numbers,nummber)){
                        System.out.println("重复");
                    }else {
                       numbers[i] = nummber;
                       break;
                    }
                }
            }
        }

        while (true) {
            System.out.println("输入蓝球");
            int number = sc.nextInt();
            if (number < 1 || number>16){
                System.out.println("输入的号码不在范围");
            }else {
                numbers[6] = number;
                break;
            }
        }
        return numbers;
    }
    public static boolean exist(int[] numbers, int nummber) {
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == nummber){
                return true;
            }
        }
        return false;
    }

    public static int[] createnumbers(){
        int[] numbers = new int[7];
        Random random = new Random();
        for (int i = 0; i < numbers.length -1; i++) {



            while (true){
                int number = random.nextInt(33)+1;
                if(!exist(numbers,number)){
                    numbers[i] = number;
                    break;
                }
            }
        }
        numbers[6] = random.nextInt(16)+1;
        return numbers;
    }


    public static int[] iii(int[] arr,int[] arr1){
        int[] arr2 =new int[arr.length];
        for (int i = 0 , j=0; i < arr.length && j< arr1.length;  i++,j++) {
            if(arr[i] == arr1 [i]){
                arr2[i] = arr[i];
            }else {
                continue;
            }

        }
        return arr2;
    }
}
