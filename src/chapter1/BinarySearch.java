package chapter1;

import basic.In;
import basic.StdIn;
import basic.StdOut;

import java.util.Arrays;

public class BinarySearch {

    /**
     * 二分查找法
     * @param key
     * @param a
     * @return
     */
    public static int rank (int key,int[] a){
        int lo=0;
        int hi=a.length-1;
        while (lo<=hi){
            int mid=lo+(hi-lo)/2;
            if (key<a[mid]){
                hi=mid-1;
            }else if (key>a[mid]){
                lo=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }


    /**
     * 将输入中所有不在命令行指定的白名单中的数字打印出来
     * @param args
     */
    public static void main(String[] args) {
       int[] whitelist=In.readInts(args[0]);
       Arrays.sort(whitelist);
       while (!StdIn.isEmpty()){
           int key=StdIn.readInt();
           if (rank(key,whitelist)==-1){
               StdOut.println(key);
           }
       }
    }
}
