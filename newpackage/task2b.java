package newpackage;

import java.util.Scanner;

/**
 *
 * @author Zahir
 */
public class task2b {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements: ");
        int len = sc.nextInt();
        
        int[] x = new int[len];
        int[] y = new int[len];
        
        for(int i=0; i<len; i++){
            int a = i;
            System.out.println("Point " + (++a)+"...");
            System.out.print("Enter x axis: ");
            x[i] = sc.nextInt();
            System.out.print("Enter y axis: ");
            y[i] = sc.nextInt();
            System.out.println(" ");
        }
        
        
        //display points (x and y axis)
        System.out.println("All Points: ");
        for(int i=0; i<len; i++){
            System.out.println( "("+x[i]+","+y[i]+")");
        }
        
        //for x-axis
        for(int i=0;i<len;i++){
            for(int j=len-1;j>i;j--){
                //System.out.println("iterating over x[i] & x[j]:"+x[i]+" "+x[j]);
                if(x[i]==x[j]){
                    int a = i;
                    int b = j;
                    System.out.println("Point "+(++a)+" and Point "+(++b)+" are in same line along x axis");
                }
            }
        }
        
        //for y-axis
        for(int i=0;i<len;i++){
            for(int j=len-1;j>i;j--){
                //System.out.println("iterating over y[i] & y[j]:"+y[i]+" "+y[j]);
                if(y[i]==y[j]){
                    int a = i;
                    int b = j;
                    System.out.println("Point "+(++a)+" and Point "+(++b)+" are in same line along y axis");
                }
            }
        }
   
    }
}
