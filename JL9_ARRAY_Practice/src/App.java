import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Array Practice");

        try(Scanner sc = new Scanner(System.in)){

            //1
                // float[] arr = {5.5f,10.23f,58.4f,74.54f,3.54f};
                // float sum = 0f;
                // for (int i = 0; i < arr.length; i++) {
                //     sum += arr[i];
                // }
                // System.out.println(sum);
            
            //2
                // int input = sc.nextInt();
                // boolean flag = false;
                // int[] check = {5,10,77,58,90,21};
                // for (int i = 0; i < check.length; i++) {
                //     if(input == check[i]){
                //         System.out.println("Yes integer is present");
                //         flag = true;
                //         break;

                //     }
                // }
                // if (flag == false) {
                //     System.out.println("not present");
                // }
            //3
                // int[] marks = {100 ,100 ,100 ,100 ,100 ,100};
                // int sum = 0;
                // for (int i : marks) {
                //     sum += i;
                // }
                // System.out.println(sum);
            
            //4
                // int[][] arr1 = {{10,20,30},
                //                 {40,50,60}};
                // int[][] arr2 = {{10,20,30},
                //                 {40,50,60}};
                // int[][] mainArr = new int[2][3];
                // for (int i = 0; i < mainArr.length; i++) {
                //     for (int j = 0; j < mainArr[i].length; j++) {
                //         mainArr[i][j] = arr1[i][j] + arr2[i][j];
                //     }
                // }
                // for (int x = 0; x < mainArr.length; x++) {
                //     for (int y = 0; y < mainArr[x].length; y++) {
                //         System.out.print(mainArr[x][y]+" ");
                //     }
                //     System.out.println();
                // }

            //5
                // int[] rev = {1,2,3,4,5,6,7,8,9,10};
                // int j = rev.length -1; int i = 0 ;

                // while(i < j){
                //     int temp = rev[i]; 
                //     rev[i] = rev[j];
                //     rev[j] = temp;
                //     i++;
                //     j--;
                // }
                // for (int x : rev) {
                //     System.out.print(x+" ");
                // }
            
            //6
                // int[] numArr = {-1,-2,-22,0,12,5,34,27,98};
                // int max = Integer.MIN_VALUE;
                // for (int i = 0; i < numArr.length; i++) {
                //     if(max < numArr[i]){
                //         max = numArr[i];
                //     }
                // }
                // System.out.println(max);
        
            //7
                // int[] numArr = {23,4,74,85,30,14,42,10,14};
                // int min = Integer.MAX_VALUE;
                // for (int i = 0; i < numArr.length; i++) {
                //     if(min > numArr[i]){
                //         min = numArr[i];
                //     }
                // }
                // System.out.println(min);
            
            //8
                // int[] sort = {1,2,3,4,5,6,0};
                // boolean flag = false;
                // for (int i = 0; i < sort.length-1; i++) {                   
                //         if(sort[i]>sort[i+1]){
                //             System.out.println("not sorted");
                //             flag = true;
                //             break;
                //         }
                // }
                // if(flag == false){
                //     System.out.println("Array is sorted");
                // }

            //9
                // int[] numArr = {10,30,25,15,5};
                // boolean flag = false;
                // for (int i = 0; i < numArr.length-1; i++) {
                //     for (int j = i+1; j < numArr.length; j++) {
                //         if(numArr[i]>numArr[j]){
                //             flag = true;
                //             int temp = numArr[i];
                //             numArr[i] = numArr[j];
                //             numArr[j] = temp;
                //         }
                //     }
                // }
                // if(flag == false){
                //     System.out.println("array is aleardy sorted");
                // }else{
                //     for (int k : numArr) {
                //         System.out.print(k+" ");
                //     }
                // }
        }
    }
}
