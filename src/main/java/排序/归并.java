package 排序;

import utils.GetRandom;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2022/4/16
 */
public class 归并 {
    public static void main(String[] args)
    {
        int[] array = GetRandom.getArray();

        func(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    // 归并所需要的辅助数组
    private static int [] assist;
    private static int a=0;
    private static int b=0;
    private static int c=0;
    private static int d=0;

    public static void func(int [] array){
        // 1.初始化辅助数组 assist;
        assist =new int[array.length];
        // 2.定义一个 lo 变量, 和 hi 变量, 分别记录数组中最小的索引和最大的索引;
        int lo=0;
        int hi=array.length-1;
        // 3. 调用sort重载方法 完成数组a中, 从索引 lo 到索引 hi 的元素的排序
        func(array,lo, hi);
    }

    /**
     *  对数组 a 中从lo到hi的元素进行排序
     */
    public static void func(int [] array, int lo, int hi){
        // 归并 就是 分 治 和
        // 做安全性校验  当hi=lo 的时候 说明 这个数组已经到了最后一步了 切分到每个数组只有一个对象 的时候了
        if(hi<=lo){
            return ;
        }

        // 对 lo 到 hi 之间的数据进行切分 分为两组
        int mid=lo+(hi-lo)/2;
        // 1. 分
        // 分别对每一组数据进行排序
        a++;
        System.out.println("a="+a);
        System.out.println("lo="+lo+"--1"+"hi="+hi+"mid="+mid);
        func(array,lo,mid);
        b++;
        System.out.println("b="+b);
        System.out.println("lo="+lo+"--2"+"hi="+hi+"mid="+mid);
        func(array,mid+1,hi);
        c++;
        System.out.println("c="+c);
        System.out.println("lo="+lo+"--3"+"hi="+hi+"mid="+mid);
        //再把两个数组中的数据进行归并
        merge(array,lo,mid,hi);
        d++;
        System.out.println("d="+d);
        System.out.println("lo="+lo+"--4"+"hi="+hi+"mid="+mid);
    }

    /**
     *  对数组中, 从 lo 到 mid 为一组, 从mid+1 到hi 为一组, 对这两个数组的数据进行归并
     */
    private static void merge(int[] array,int lo, int mid,int hi){
        // 定义三个指针
        int i=lo;
        int p1=lo;
        int p2=mid+1;

        // 2. 治
        // 遍历, 移动p1 指针和p2 指针, 比较对应索引处的值, 找出小的那个, 放到辅助数组的对应索引
        while(p1<=mid&&p2<=hi){
            //比较对应索引处的值
            if(array[p1]<array[p2]){
                assist[i++]=array[p1++];
            }else {
                assist[i++]=array[p2++];
            }
        }

        // 3. 和
        // 遍历, 如果p1 的指针没有走完, 那么顺序移动p1 指针, 把对应的元素方放到辅助数组的对应索引处
        while (p1<=mid){
            assist[i++]=array[p1++];
        }
        // 遍历, 如果p2 的指针没有走完, 那么顺序移动p2 指针, 把对应的与元素放到辅助数组的对应索引处.
        while (p2<=hi){
            assist[i++]=array[p2++];
        }
        // 把辅助数组的元素拷贝到原数组中
        for (int index = lo; index <= hi; index++) {
            array[index]=assist[index];
        }
    }
}
