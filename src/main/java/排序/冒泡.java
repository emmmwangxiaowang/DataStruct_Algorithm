package 排序;

import java.util.Random;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2022/4/14
 */
public class 冒泡 {
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

    public static void func(int[] array){
        int temp=0;
        // n 个数比较 只用比 n-1 次
        for (int i = 0; i < array.length-1; i++) {

            // 每次将该次最大的元素找出来 排在最后面
            // 因为每次都是放在最后面, 所以最后面不用每次都要比,只用从最前面开始
            // 因为每次都是将 较小的数字放在前面, 所以前面 每次都是从 0 开始
            // 这里的比较次数也是 每次都产生勒一个最大的元素, 所以每次比较都少比一次
            // 所以是 array.length-i  因为是比较, 所以 总的比较次数是 元素的个数 -1
            for (int j = 0; j < array.length-i-1; j++) {
                if(array[j]>array[j+1]){
                    temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                    temp=0;
                }
            }
        }
    }
}
