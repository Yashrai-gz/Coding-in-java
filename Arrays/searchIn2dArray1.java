import java.util.*;

/*  array is sorted in row and column wise

    10 20 30
    12 25 37
    17 39 47 

   observe here in this array it is not necessary that  all the row 1 elements are lesser than row2 elements.It is just following the order that elements are sorted along the row as well as column.
   It is diffrent from sorted 2D array
   last column contain the elements which are greatest amoung each row. which means in a given row largest element will be in last column. 

   so approch in this question is there are 2 variables start and end start is for the rows and end is for the columns 
   if(arr[start][end]>target) this means that element is not in last column so we will do end--
   if(arr[start][end]<target) this means that element is not in first row so  we will do start++

* */

public class searchIn2dArray1{
    public static void main(String[] args) {
        int [][] arr= {
            {10, 20, 30},   
            {12,25,37},
            {17,39,47}
          };
      
          System.out.println(Arrays.toString(BinsearchIn2d(arr, 17)));        
    }

    public static int[] BinsearchIn2d(int [][]arr, int target)  //this function will return the index at which element is found and if not found then [-1,-1]
    {
        int start=0;
        int end=arr.length-1;

        while(start<=end )
        {
            if(arr[start][end]>target)
            {
                end--;
            }

            else if(arr[start][end]<target)
            {
                start++;
            }
            else if(arr[start][end]==target){
                return new int []{start,end};
            }
        }

        return new int[]{-1,-1};
    }
   
}


