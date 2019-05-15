package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;
        int[] arr3;
        Scanner scanner = new Scanner(System.in);
        arr1 = new int[4];
        arr2 = new int[3];
        arr3 =new int[arr1.length+arr2.length];
        int i = 0;
        while (i < arr1.length) {
            System.out.println("Nhap gia tri " + (i + 1) + "cua mang 1");
            arr1[i]=scanner.nextInt();
            i++;
        }
        int j = 0;
        while (j < arr2.length) {
            System.out.println("Nhap gia tri " + (j + 1) + "cua mang 2");
            arr2[j]=scanner.nextInt();
            j++;
        }
        System.out.println("Danh sach mang arr1");
        for (int k=0 ;k<arr1.length;k++){
            System.out.print(arr1[k]+"\t");
        }
        System.out.println("\n"+"Danh sach mang arr2");
        for (int t=0 ;t<arr2.length;t++){
            System.out.print(arr2[t]+"\t");
        }
        //gan arr1 vao arr3
        for (int x=0;x< arr1.length;x++){
            arr3[x]=arr1[x];
        }
        //gan arr2 vao arr3
        int f=0;
        for (int c=arr1.length;c<arr3.length;c++){
            arr3[c]=arr2[f];
            f++;
        }
        //duyet mang 3
        System.out.println("\n");
        for (int b=0;b<arr3.length;b++){
            System.out.print(arr3[b]+"\t");
        }
    }
}
