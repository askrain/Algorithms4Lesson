package chapter1.test;

import chapter1.VisualAccumulator;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class TestVisualAccumulator {
    public static void main(String[] args) {
        int T=Integer.parseInt(args[0]);
        VisualAccumulator a=new VisualAccumulator(T,1);//设置要画的点数 和最大值
        for (int i = 0; i < T; i++) {
            a.addDataValue(StdRandom.random());
        }
        StdOut.println(a);
    }
}
