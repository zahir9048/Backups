package newpackage;
/**
 *
 * @author Zahir
 */
public class task1 {
    public static void main(String[] args) {
      
        String arr[] = {"shampoo","words","clhcking","box"};
        
        System.out.println("Original Array: ");
        for (int i=0; i<arr.length; i++) {
            System.out.println(i+" "+arr[i]);
        }
        
        for(int i=0; i<arr.length; i++){
            
            char j = (arr[i].charAt(2));
            if((j!=('a'))&&(j!=('e'))&&(j!=('i'))&&(j!=('o'))&&(j!=('u'))&&(j!=('z'))){
                char n= (char)(j+1);           
                
                if((n!=('a'))&&(n!=('e'))&&(n!=('i'))&&(n!=('o'))&&(n!=('u'))){
                    arr[i]=arr[i].substring(0, 2)+n+arr[i].substring(3);
                }    
                else{
                    arr[i]=arr[i].substring(0, 2)+(char)(n+1)+arr[i].substring(3);
                }
            }
        }
        
        System.out.println("\nModified Array: ");
        for (int i=0; i<arr.length; i++) {
            System.out.println(i+" "+arr[i]);
        }
    }
}
