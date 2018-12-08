package chapter1;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Flips {

    /**
     * 模拟  T次掷硬币
     */

    public static void main(String[] args) {
        int T =Integer.parseInt(args[0]);
        Counter heads=new Counter("heads");
        Counter tails=new Counter("tails");
        for (int t = 0; t < T; t++) {
            if (StdRandom.bernoulli(0.5)){ //返回真的概率为50%
                heads.increment();
            }else{
                tails.increment();
            }
        }
        StdOut.println(heads);
        StdOut.println(tails);
        int d=heads.tally()-tails.tally();
        StdOut.println("delta: "+Math.abs(d));
    }
}
