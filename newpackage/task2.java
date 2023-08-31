package newpackage;

/**
 *
 * @author Zahir
 */
public class task2 {
    public static void main(String[] args) {
        
        String arr[] = {"2,2","3,2","2,8","3,4"};
        int len = arr.length;
        
        int[] x = new int[len];
        int[] y = new int[len];        

        for(int i=0; i<arr.length; i++){
            int xC = Character.getNumericValue(arr[i].charAt(0));
            int yC = Character.getNumericValue(arr[i].charAt(2));
            
            x[i]=xC;
            y[i]=yC;     
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
