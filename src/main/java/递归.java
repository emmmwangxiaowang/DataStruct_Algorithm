/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2022/4/16
 */
public class 递归 {
    public static void main(String[] args)
    {
        long func = func(1000);

        System.out.println(func);
    }

    public static long func(int n){
        // 递归调用要有出口  -- 边界条件 能够让递归结束,因为每一次递归调用都会在栈内存中开辟新的空间,重新执行方法,如果递归的层级太深, 很容易造成栈内存溢出
        if(n==1){
            return 1;
        }
        return n*func(n-1);
    }
}
