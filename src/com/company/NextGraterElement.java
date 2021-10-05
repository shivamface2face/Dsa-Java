package com.company;

import java.util.Stack;

public class NextGraterElement {
    public static void main(String[] args) {
        int[] arr={4,10,5,18,3,12,7};
        NextGrater(arr);
    }

   public static void NextGrater(int[] arr) {

        int newArr[]=new int[arr.length];

       Stack<Integer> st = new Stack<>();

       st.push(arr[arr.length-1]);
       newArr[arr.length-1]=-1;

       for (int i = arr.length-2; i >=0 ; i--) {
           while (st.size()>0&& arr[i]>st.peek()){
               st.pop();
           }
           if (st.size()==0){
               System.out.print(-1+" ");
           }else {
               System.out.print(st.peek()+" ");
           }
        st.push(arr[i]);
       }
//       return newArr;
    }
}
