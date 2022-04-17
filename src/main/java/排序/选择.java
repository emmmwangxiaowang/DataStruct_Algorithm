package 排序;

import java.util.Random;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2022/4/14
 */
public class 选择 {
    public static void main(String[] args)
    {
        int array[]=new int[10];
        Random seed = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i]= seed.nextInt(20);
            System.out.println(array[i]);
        }

        func(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void func(int [] array){
        int min=0;
        int temp=0;
        for (int i = 0; i < array.length-1; i++) {
            // 选择排序  每次循环 都找出当前最小的元素, 只用记住它的序号, 最后循环结束后进行一次交换
            // 冒泡排序  只要看到比自己大的(小的) 就进行交换, 交换的次数 比选择排序频繁的多
            min=i;
            for (int j = i+1; j < array.length-1; j++) {
                // 找到较小的 用min 记录其位置,和后面依次比, 直到比完 ,最后的 就是最小的
                if(array[min]>array[j]){
                    min=j;
                }
            }

            temp=array[i];
            array[i]=array[min];
            array[min]=temp;
        }
    }
}
