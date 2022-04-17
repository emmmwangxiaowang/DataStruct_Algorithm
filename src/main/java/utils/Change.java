package utils;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2022/4/16
 */
public class Change {

    public static void func(int [] array,int i,int j){
        int temp=0;
        temp=array[i];
        array[i]=array[j];
        array[j]=temp;

    }
}
