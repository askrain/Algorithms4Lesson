package chapter1;

import org.junit.Test;

public class Exercise {


    @Test
    public void intOverFlow(){
        System.out.println(Integer.MAX_VALUE);//2147483647 表示int能表示的最大的数（包含负数） 即-2147483648——2147483647
        System.out.println(Math.pow(2,32));// 4.294967296E9 int型能够表示的值的个数  从-2^31  到2^31-1
        System.out.println(Math.abs(-2147483648));//-2147483648   整数溢出的典型例子

        System.out.println(Double.POSITIVE_INFINITY);//Infinity  POSITIVE_INFINITY = 1.0 / 0.0
        System.out.println(Double.NEGATIVE_INFINITY);//-Infinity NEGATIVE_INFINITY = -1.0 / 0.0

//        System.out.println(1/0);//抛出运行时异常 java.lang.ArithmeticException: / by zero
        System.out.println(1.0/0.0);//很显然 这个就是Double.Infinity

//        负数的除法和余数的结果是什么？ 负数的除法就是向0取整  余数的正负取决于被除数的正负 -14%3=-2  14%-3=2


    }


}
