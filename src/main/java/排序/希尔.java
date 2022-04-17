package 排序;

import utils.GetRandom;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2022/4/15
 */
public class 希尔 {

    /**
     * @desc  关于增量的选择
     * 如果增量之间不互质的话，那有些情况就不管用了。
     *
     * 于是有些大佬们就整出了下面这些增量序列：Hibbard增量序列、Knuth增量序列、Sedgewick增量序列等等
     * 下面主要介绍Hibbard增量序列和Sedgewick增量序列
     *
     * Hibbard增量序列
     * Hibbard增量序列的取法为Dk=2k−1：{1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191...}
     * 最坏时间复杂度为O(N3/2)；平均时间复杂度约为O(N5/4)
     * @param args
     */
    public static void main(String[] args)
    {
        int[] array = GetRandom.getArray();

        func(array);

        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void func(int [] array){
        // 1.根据数组的长度, 确定增长量 h 的初始值;
        int h=1;
        while(h<array.length/2){
            h=2*h+1;
        }

        // 2.排序
        while(h>=1){
            // ①. 找到待插入的元素
            int temp=0;
            for (int i = 0; i < array.length; i++) {
                // ②. 吧待插入的而元素插入到有序数列中
                /**
                 *
                 */
                for (int j = i; j >=h; j--) {
                    // 待插入的元素是 array[j] ,比较 array[j] 和 array[j-h]
                    if(array[j-h]>array[j]){
                        // 交换元素
                        temp=array[j];
                        array[j]=array[j-h];
                        array[j-h]=temp;
                    }else{
                        // 待插入的元素已经在 合适的位置, 结束循环
                        break;
                    }

                }
            }

            // 确定增量的值
            h=h/2;
        }
    }
}
