import java.sql.*;

public class p11 {
    public static void main(String args[]){
        Connection con = null;
        Statement st = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/temp","root","");
            st=con.createStatement();
            ResultSet rs = st.executeQuery("select * from emp");
            while(rs.next()){
                System.out.println(rs.getString(1)+" "+rs.getString(2));
            }
            st.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}