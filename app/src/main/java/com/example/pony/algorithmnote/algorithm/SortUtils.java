package com.example.pony.algorithmnote.algorithm;

public class SortUtils {
    //选择排序的算法
    public static  int[] selectionSort(int[] arrays){
        for(int i=0;i<arrays.length;i++){
            //从第0个值开始和后面的值进行比较。如果第0个值大于后面的值，则进行位置交换。以此类推。
            for(int j = i;j<arrays.length;j++){
                if(arrays[i]>arrays[j]){
                    swap(arrays,i,j);
                }
            }
        }
        return arrays;
    }

    //冒泡排序   相邻两个之间比较，不停传递，就可以让最大的值，传递到最后侧边。多次循环后，最后一次循环没有发生位置交换，就说明已经是有序的了。
    public static int[] bubbleSort(int[] arrays){
        boolean hasRolled;
        for(int i=0;i<arrays.length;i++){
            hasRolled = false;//在开始循环之前 重置hasRolled
            for(int j=0;j<arrays.length-i-1;j++){
                if(arrays[j]<arrays[j+1]){
                    hasRolled = true;//如果就了一次排序，就改为true，表示还要再走一次循环 否则已经没有可以交换的位置了  排序完毕
                    swap(arrays,j,j+1);
                }
            }
            if(!hasRolled){
                return arrays;
            }
        }

        return null;
    }



    //不需要变量快速交换2个值的方法
    private static void swap(int[] arrays, int i, int j) {
        arrays[i] = arrays[i]+arrays[j];
        arrays[j] = arrays[i]-arrays[j];
        arrays[i] = arrays[i]-arrays[j];
    }
}
