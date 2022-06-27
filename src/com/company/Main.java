package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s= new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("Enter values for sorted array");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        int[] temp=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                temp[j]=arr[i];
                j++;
            }
        }
        temp[j]=arr[arr.length-1];
        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
            System.out.println(arr[i]);
        }
    }
}
