package chapter1;


import edu.princeton.cs.algs4.StdDraw;

/**
 * 一种能够累加数据的抽象数据类型
 * visual
 * adj.	视觉的，看得见的; 光学的，视力的; 形象化的; 光学的;
 * n.	画面，图象;

 */
public class VisualAccumulator {

    private double total;
    private int N;
    public VisualAccumulator(int trials,double max){//用于调整图像的比例
        StdDraw.setXscale(0,trials);
        StdDraw.setYscale(0,max);
        StdDraw.setPenRadius(.005);
    }
    public void addDataValue(double val){
        N++;
        total+=val;
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.point(N,val);

        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(N,total/N);

    }
    public double mean(){
        return total/N;
    }
    public String toString(){
        return "Mean (" +N +" values): "+String.format("%7.5f",mean());
    }
}
