package chapter1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Out;

/**
 * 将多个输入文件并归到同一个输出文件
 */

public class Cat {
    public static void main(String[] args) {
        Out out=new Out(args[args.length-1]);//此处将最后的参数设置为输出流
        for (int i = 0; i < args.length - 1; i++) {
            In in=new In(args[i]);//将第i个输入的文件复制到输出流 （排除了最后一个文件）
            String s=in.readAll();
            out.println(s);
            in.close();
        }
        out.close();
    }
}
