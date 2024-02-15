package com.kodilla;

public class Dwo {
    public static void main(String[] args) {
        int[] tab = new int[]{4,6,10,20,40,7};
        int[] arr = new int[tab.length];

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i] + " ");
            System.out.println();
        }

        for(int i = 0; i < tab.length; i++) {
            arr[i] = tab[tab.length - 1 -i];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
            System.out.println();
        }
    }
}
