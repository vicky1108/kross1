
package lab1kpp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import javax.management.Query;
import java.util.Scanner;

public class Lab1kpp {



  public static void main( String args[] )
  {


                    
                    
                    
                    
    Connection c = null;
    Statement stmt = null;
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:C:\\Un\\dovidnyk.sqlite");
      c.setAutoCommit(false);
      System.out.println("Opened database successfully");
      stmt = c.createStatement();
      ResultSet rs = stmt.executeQuery( "SELECT * FROM Ganre;" );
      System.out.println("this is table ganre");
      System.err.println("");
      while ( rs.next() ) {
         int id = rs.getInt("ID");
         String  name = rs.getString("NAME");
         String  more = rs.getString("MORE");

         System.out.println( "ID = " + id );
         System.out.println( "NAME = " + name );
         System.out.println( "MORE = " + more );
         System.out.println("******************************");
      }
      rs.close();
          System.err.println("");
           ResultSet rs1 = stmt.executeQuery( "SELECT * FROM Opisanie;" );
                     System.out.println("this is table Opisanie");
          System.err.println("");
      while ( rs1.next() ) {
         int id = rs1.getInt("ID");
         String  name = rs1.getString("NAME");
         String  author = rs1.getString("AUTHOR");
         String  ganre = rs1.getString("GANRE");

         System.out.println( "ID = " + id );
         System.out.println( "NAME = " + name );
         System.out.println( "AUTHOR = " + author );
         System.out.println( "GANRE = " + ganre );
         System.out.println("******************************");
      }
      rs1.close();
      
      stmt.close();
      c.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
    
    
    
    
    Connection conn = null;
      try{
          conn = DriverManager.getConnection("jdbc:sqlite:C:\\Un\\dovidnyk.sqlite");
           Statement st = conn.createStatement();
           ResultSet rs = st.executeQuery("select * from Opisanie");
                 while (rs.next()){
                  System.out.println("Name book ="+rs.getString("Name"));
                 }
                  System.out.println("******************************");
                   
                  //******************************//////////////////////////////////////////
                    Statement st1 = conn.createStatement();
                  ResultSet rs1 = st1.executeQuery("select * from Ganre");
                  while (rs1.next()){
                  System.out.println("Name ganre ="+rs1.getString("Name"));
                  }
                   System.out.println("******************************");
                 //******************************///////////////////////////////
  
                }catch (SQLException e){
          System.err.println(e);
      }
      
      Scanner in = new Scanner(System.in);
        System.out.print("Enter colonuum in ganre, please: ");
        
        String names = in.nextLine();
         
        
        Connection co = null;
      try{
          co = DriverManager.getConnection("jdbc:sqlite:C:\\Un\\dovidnyk.sqlite");
       
         
           Statement st = co.createStatement();
           
                  ResultSet rs1 = st.executeQuery("select * from Ganre");
                  while (rs1.next()){
                  System.out.println("=>>> ="+rs1.getString(names));
                  }
                   System.out.println("******************************");
                   
             
   
                }catch (SQLException e){
          System.err.println(e);
      }
                    
                    

         
                    
             //add       
            
      
//           
//                    
//    try {
//         
//   
//      Class.forName("org.sqlite.JDBC");
//      c = DriverManager.getConnection("jdbc:sqlite:C:\\Un\\dovidnyk.sqlite");
//      c.setAutoCommit(false);
//    
//
//      stmt = c.createStatement();
//      String sql = "INSERT INTO GANRE (ID,NAME,MORE) " +
//                   "VALUES (12, 'dssa',  'This is new kdjklsdjflfasdasdasdjsdklfjsdkljfsdlkfjsdklfjsdlkfjkls' );"; 
//      stmt.executeUpdate(sql);
//           stmt.close();
//      c.commit();
//      c.close();
//    } catch ( Exception e ) {
//      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
//      System.exit(0);
//    }
//    System.out.println("successfully adding");
//  
//           System.out.println(" *****************************"); 
    
    
//    
//    //del
//    
//               
//    
//                    
//                        try {
//      Class.forName("org.sqlite.JDBC");
//      c = DriverManager.getConnection("jdbc:sqlite:C:\\Un\\dovidnyk.sqlite");
//      c.setAutoCommit(false);
//     
//
//      stmt = c.createStatement();
//      String sql = "DELETE from Ganre where ID=6;";
//      stmt.executeUpdate(sql);
//      c.commit();
//
//      ResultSet rs = stmt.executeQuery( "SELECT * FROM Ganre;" );
//      while ( rs.next() ) {
//         int id = rs.getInt("ID");
//         String  name = rs.getString("Name");
//         String  more = rs.getString("More");
//         
//         System.out.println( "ID = " + id );
//         System.out.println( "NAME = " + name );
//         System.out.println( "MORE = " + more );
//         System.out.println();
//      }
//      rs.close();
//      stmt.close();
//      c.close();
//    } catch ( Exception e ) {
//      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
//      System.exit(0);
//    }
//    System.out.println(" successfully deleting");
//      
//     System.out.println(" *****************************");           
//                    
//                    
//   //up                 
//     
//                
//    try {
//        
//    
//      Class.forName("org.sqlite.JDBC");
//      c = DriverManager.getConnection("jdbc:sqlite:C:\\\\Un\\\\dovidnyk.sqlite");
//      c.setAutoCommit(false);
//     
//
//      stmt = c.createStatement();
//      String sql = "UPDATE Ganre set More = More where ID=9;";
//      stmt.executeUpdate(sql);
//      c.commit();
//
//      ResultSet rs = stmt.executeQuery( "SELECT * FROM Ganre;" );
//      while ( rs.next() ) {
//        int id = rs.getInt("ID");
//         String  name = rs.getString("Name");
//         String  more = rs.getString("More");
//         
//         System.out.println( "ID = " + id );
//         System.out.println( "NAME = " + name );
//         System.out.println( "MORE = " + more );
//         System.out.println();
//      }
//      rs.close();
//      stmt.close();
//      c.close();
//    } catch ( Exception e ) {
//      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
//      System.exit(0);
//    }
//      
//      
//      
//      
//    System.out.println("successfully updating" );
//        System.out.println(" *****************************");              
//       
//    
      
   
      
}
  }

   