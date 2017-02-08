


/**
 * Created by kq6441 on 2017/1/10.
 */
public class QuickSort{
    public static void main(String[] args){
        int[] a = new int[10];
        for(int i=0;i<10;i++){
            a[i] = (int)(10*Math.random());
        }
        for(int i:a){
            System.out.print(i);
        }
        System.out.println();
        int left = 0;
        int right = 9;

        qsort(a,left,right);
        for(int i:a){
            System.out.print(i);
        }
        System.out.println();

    }

    private static void qsort(int[] a,int left,int right){
        if(left<right){
            int index = quicksort(a,left,right);
            qsort(a,left,index-1);
            qsort(a,index+1,right);
        }
    }

    private static int quicksort(int[] a,int left,int right){
        int index = left;
        for(int i=left;i<right;i++){
            if(a[i]<a[right]){
                int temp = a[i];
                a[i] = a[index];
                a[index] = temp;
                index++;
            }
        }
        int temp = a[right];
        a[right] = a[index];
        a[index] = temp;
        return index;
    }

}








