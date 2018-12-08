package chapter1;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Rolls {

    /**
     * 模拟掷骰子
     * @param args
     */

    public static void main(String[] args) {
        int T=Integer.parseInt(args[0]);//表示投掷骰子的次数
        int SIDES=6;//表示骰子的6个面
        Counter [] rolls=new Counter[SIDES+1];//创建了容量为7 的Counter数组
        for (int i = 1; i <= SIDES; i++) { //下标为0的位置没有赋值
            rolls[i]=new Counter(i+"'s");//创建了6个Counter对象在rolls数组中 代表6个面
        }
        for (int t = 0; t < T; t++) {
            int result= StdRandom.uniform(1,SIDES+1);//返回1到7之间的实数 [1,7)  代表掷骰子的结果
            rolls[result].increment();
        }
        for (int i = 1; i <= SIDES; i++) {
            StdOut.println(rolls[i]);
        }

    }
}
