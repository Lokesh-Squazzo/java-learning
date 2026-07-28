package com.lokesh;

public class Test {
    public static void main(String[] args) {
        try{
            System.out.println("hello");
            System.out.println(10/0);
        }catch (NullPointerException e){
            System.out.println("HI");
        }
        finally {
            int[] arr = new int[2];
            System.out.println(arr[7]);

        }
    }
}
