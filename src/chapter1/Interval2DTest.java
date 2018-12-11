package chapter1;

import edu.princeton.cs.algs4.*;

public class Interval2DTest {


    /**
     * Interval2D的测试用例 画一点的点和一个box 算出点在box中的个数 和概率
     * @param args
     */

    public static void main(String[] args) {
        double xlo=Double.parseDouble(args[0]);
        double xhi=Double.parseDouble(args[1]);
        double ylo=Double.parseDouble(args[2]);
        double yhi=Double.parseDouble(args[3]);
        int T=Integer.parseInt(args[4]);//读取输入的4个参数  前四个为两点坐标  第五个为点的个数

        Interval1D xinterval=new Interval1D(xlo,xhi);
        Interval1D yinterval=new Interval1D(ylo,yhi);
        Interval2D box=new Interval2D(xinterval,yinterval);
        box.draw();

        Counter c=new Counter("hits");
        for (int i = 0; i < T; i++) {
            double x=Math.random();
            double y=Math.random();
            Point2D p=new Point2D(x,y);
            if (box.contains(p)){
                c.increment();
            }else{
                p.draw();
            }
        }
        StdOut.println(c);
        StdOut.println(box.area());
    }
}
