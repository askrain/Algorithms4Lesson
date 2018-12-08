package chapter1;

import org.junit.Test;

public class Euclid {

    /**
     * 欧几里得算法 :计算两个非零整数p 和 q的最大公约数
     * @param p
     * @param q
     * @return
     */
    public static int gcd(int p,int q){
        if (q==0){
            return p;
        }
        int r=p%q;
        return gcd(q,r);
    }
    @Test
    public void testResult(){
        int a=4,b=16;
        int result = gcd(a, b);
        System.out.println(result);
    }

    @Test  //验证了初始化数组的时候，里面的元素都有对应数据类型的初始值  对应的String的初始值为null  boolean类型默认为false
    public void testArray(){
        double [] a;
        a=new double[10];
        int size=a.length;
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
        }
    }
    @Test
    public void testArray1(){
        String [] strs=new String[10];
        int size = strs.length;
        for (int i = 0; i < size; i++) {
            System.out.println(strs[i]);
        }
    }

}
