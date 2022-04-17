package utils;

import java.util.Random;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2022/4/15
 */
public class GetRandom {
    public static int[] getArray(){
        int array[]=new int[5];
        Random seed = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i]= seed.nextInt(20);
            System.out.println(array[i]);
        }
        return array;
    }
}
