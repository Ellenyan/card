package com.god.card.poker;

public class Appear {

    public static void main(String[] args) {

        int[] a = new int[3];
        int[] b = new int[3];
        for (int i=0; i < a.length; i++) {
            a[i] = (int)(Math.random() * 10);
            b[i] = (int)(Math.random() * 10);
        }
        System.out.print("a = ");
        print(a);
        System.out.println('\r');
        System.out.print("b = ");
        print(b);
        System.out.println('\r');

        vS(a, b);
    }

    public static void print(int[] a) {

        for (int i=0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static int opinion(int[] arr) {

        if (arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2]) {
            if (arr[0] == arr[2]) {
                int temp = arr[1];
                arr[1] = arr[2];
                arr[2] = temp;
            } else if (arr[1] == arr[2]) {
                int temp = arr[0];
                arr[0] = arr[2];
                arr[2] = temp;
            }
//            System.out.println("对子");
            return 3;
        } else {
            bubbleSort(arr);
            if (arr[0] == arr[1] && arr[1] == arr[2]) {
//                System.out.println("豹子");
                return 1;
            } else if (arr[0] + 1 == arr[2] - 1) {
//                System.out.println("连子");
                return 2;
            } else {
//                System.out.println("单牌");
                return 4;
            }
        }
    }

    public static void vsDuiZi(int[] a, int[] b) {

        if (a[0] == b[0]) {
            isFirstBig(a[2], b[2]);
//            if (a[2] > b[2]) {
//                System.out.println("a胜利");
//            } else {
//                System.out.println("b胜利");
//            }
        } else if (a[0] > b[0]) {
            System.out.println("a胜利");
        } else {
            System.out.println("b胜利");
        }

//        if (a[0] == a[1] && b[0] == b[1]) {
//            if (a[0] == b[0]) {
//                if (a[2] == b[2]) {
//                    System.out.println("平局");
//                } else if (a[2] > b[2]) {
//                    System.out.println("a胜利");
//                } else {
//                    System.out.println("b胜利");
//                }
//            } else {
//                vsBaoZi(a, b);
//            }
//        } else if (a[1] == a[2] && b[1] == b[2]) {
//            if (a[1] == b[1]) {
//                vsBaoZi(a, b);
//            } else if (a[1] == b[1]) {
//                System.out.println("平局");
//            } else if (a[1] > b[1]) {
//                System.out.println("a胜利");
//            } else {
//                System.out.println("b胜利");
//            }
//        } else {
//            if (a[0] == b[2]) {
//                System.out.println("平局");
//            } else if (a[0] > b[2]) {
//                System.out.println("a胜利");
//            } else {
//                System.out.println("b胜利");
//            }
//        }
    }

    public static void vsOpinion(int[] a, int[] b) {

        System.out.println(isFirstBig(a[0], b[0]));
//        if (a[0] == b[0]) {
//            System.out.println("平局");
//        } else if (a[0] > b[0]) {
//            System.out.println("a胜利");
//        } else {
//            System.out.println("b胜利");
//        }
    }

    public static void vsLianZi(int[] a, int[] b) {
        vsOpinion(a, b);
    }

    public static void vsDanPai(int[] a, int[] b) {
        vsOpinion(a, b);
    }

    public static int[] bubbleSort(int[] arr) {

        int temp;
        for (int i=0; i < arr.length; i++) {
            for (int j=i+1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static String isFirstBig(int a, int b) {

        if (a!=1 && b!=1) {
            if (a > b) {
                return "a 胜利";
            } else if (a < b) {
                return "b 胜利";
            } else {
                return "平局";
            }
        } else if (a==1 && b!=1) {
            return "a 胜利";
        } else if (a!=1 && b==1) {
            return "b 胜利";
        } else {
            return "平局";
        }
    }

    public static void vS(int[] a, int[] b) {

        int i = opinion(a);
        int j = opinion(b);

        if (i < j) {
            System.out.println("a胜利");
        } else if (i > j) {
            System.out.println("b胜利");
        } else {
            if (i==3 && j==3) {
                vsDuiZi(a, b);
            } else {
                vsOpinion(a, b);
            }
        }
    }
}





















