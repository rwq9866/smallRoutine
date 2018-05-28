package sr;

import java.util.Scanner;

public class YangHuiTriangle {
	public static void main(String[] args) {
		System.out.println("请输入你想要的杨辉三角的层数:");
        yHSJ(new Scanner(System.in).nextInt());  
    }  
    public static void yHSJ(int num){  
        // 使用数组arr来存放每行每列的杨辉三角数  
        int[][] arr = new int[num][2 * num - 1];  
        for(int i = 0;i < num;i++){  
            // 在每行前填充(num - i - 1)个空格  
            for(int z = 0;z < num - i - 1;z++){  
                System.out.print(" ");  
            }  
            for(int j = 0;j < 2 * i + 1;j++){  
                // 在每行的两个数值之间添加一个空格  
                if(j % 2 == 1){  
                    System.out.print(" ");  
                    //每行的第一个和最后一个数值为1  
                }else if(j == 0 || j == 2 * i){  
                    arr[i][num - i - 1] = 1;  
                    arr[i][num + i - 1] = 1;  
                    System.out.print(arr[i][num - i - 1]);  
                    // 剩余每个数值为上一行前后数值只和  
                }else{  
                    arr[i][num - i + j - 1] = arr[i - 1][num - i + j - 2] + arr[i - 1][num - i + j];  
                    System.out.print(arr[i][num - i + j - 1]);  
                }  
            }  
            // 换行  
            System.out.println();  
        }  
    }  
}
