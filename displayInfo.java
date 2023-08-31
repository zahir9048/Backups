import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zahir
 */
public class displayInfo {

    public static void displayDB(Connection conn){
        System.out.println("MySQL Database:");
        
            String query5 = "SELECT * FROM zahirdb.customers;";
                try (Statement st = conn.createStatement()) {
                    ResultSet rs = st.executeQuery(query5);

                    //System.out.println("\nQuery Running:" + query5);
                    //System.out.println("\nQuery Result:");

                    while(rs.next()){
                        int id = rs.getInt("id");
                        String name = rs.getString("name");
                        int age = rs.getInt("age");
                        int o_id = rs.getInt("order_id");

                        System.out.println(id +" "+ name +" "+ age +" "+ o_id);
                    }
                } catch (SQLException ex) {
            Logger.getLogger(displayInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(displayInfo.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("mysql driver not found");
        }
        
       
        Scanner sc = new Scanner(System.in);
        int c;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/zahirdb","root","admin");
            System.out.println("Connection successfull");
            PreparedStatement pst;
            
            displayDB(conn);
            
            System.out.println("\n1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Update");
            //System.out.println("4. VIEW");
            
            System.out.print("Enter case number:");
            c = sc.nextInt();
            switch(c){
                case 1:
                    System.out.println("Case 1: INSERT");
                    //INSERT OPERATION
                    String query = "INSERT INTO customers VALUES(15, 'ahsan', 19, 68);";
                    System.out.println("\nQuery Running: " + query);
                    pst = conn.prepareStatement(query);
                    pst.execute();
                break;
                case 2:
                    System.out.println("case 2: DELETE");
                    //DELETE OPERATION
                    String query2 = "DELETE FROM customers WHERE id=14;";
                    System.out.println("\nQuery Running: " + query2);
                    pst = conn.prepareStatement(query2);
                    pst.execute();
                break;
                case 3:
                    System.out.println("case 3: UPDATE");
                    //UPDATE OPERATION
                    String query3 = "UPDATE customers SET name = 'ramen', age = 65 WHERE id = 2;";
                    System.out.println("\nQuery Running: " + query3);
                    pst = conn.prepareStatement(query3);
                    pst.execute();
                break;
                case 4:
                    System.out.println("case 4: SEARCH");
                    //SEARCH
                    
                break;
            }
            
            System.out.println("\nQuery Result:");
            displayDB(conn);
        } 
        catch (SQLException ex) {
            Logger.getLogger(displayInfo.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Connection failed");
        }
        finally{
            try{
                if(conn!=null){
                    System.out.println("\nClosing connection...");
                    conn.close();
                }
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
}    
}
