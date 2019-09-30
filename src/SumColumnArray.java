import java.util.Scanner;

public class SumColumnArray {
    public static void randomArr(int[][] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 90 + 10);
            }
        }
    }
    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    System.out.print(" ");
                    continue;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input Current:= ");
        int maxCurrent=sc.nextInt();
        System.out.println("input Column:= ");
        int maxColumn=sc.nextInt();
        System.out.println("input sum  Column? := ");
        int column=sc.nextInt();
        int[][]arr=new int[maxCurrent][maxColumn];
        randomArr(arr);
        System.out.println("Print Arr Random:");
        print(arr);
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
                sum+=arr[i][column];
        }
        System.out.println("Sum Column"+column+"="+sum);
    }
}
