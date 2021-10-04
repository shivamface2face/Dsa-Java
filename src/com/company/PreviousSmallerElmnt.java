package com.company;

import java.util.Scanner;
import java.util.Stack;

public class PreviousSmallerElmnt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);



         int[] arr={4,10,5,18,3,12,7};



       PrviousSmallerElemnt(arr);
    }

    public static void PrviousSmallerElemnt(int arr[]) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.empty()&& st.peek()>=arr[i]){          // top wla element bda to nhi h na agar h to uda do

                st.pop();
            }
            if (st.empty()){
                System.out.print(-1+" ");
            }else {
                System.out.print(st.peek()+" ");
            }

            st.push(arr[i]);
        }
    }
}
