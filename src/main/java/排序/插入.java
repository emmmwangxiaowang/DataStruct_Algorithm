package 排序;

import utils.Change;
import utils.GetRandom;

import java.util.Random;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2022/4/14
 */
public class 插入 {

    public static void main(String[] args)
    {
        int[] array = GetRandom.getArray();

        func(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void func(int [] array){
        int temp=0;
        // 第一层还是 比较 n-1 次
        for (int i = 0; i < array.length-1; i++) {
            // 第二层为啥 是倒序比较? 因为插入排序 是往前比较的, 每次与前面的数比较 只要 比前面的数小, 就交换位置, 直到
            // 这个 出现了比这个数小的数, 就计数
            for(int j=i;j>=0;j--){
                if(array[j+1]>array[j]){
                    Change.func(array,j+1,j);
                }else{
                    // 出现了比这个数小的数, 说明 这个数到了自己的位置了 结束本次循环
                    break;
                }
            }
        }
    }
}
