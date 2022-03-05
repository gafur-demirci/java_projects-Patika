package JDBC;

import java.sql.*;

public class DBConn {

    private static final String DB_URL = "jdbc:postgresql://localhost/dvdrental";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "psql";

    public static void main(String[] args) {
        // Veri çekme işlemleri
        String sql = "SELECT * FROM actor";
        try {
            Connection connect = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            Statement st = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet data = st.executeQuery(sql);
            /*
            while(data.next()){
                System.out.println("Id : " + data.getInt("actor_id"));
                System.out.println("First Name : " + data.getString("first_name"));
                System.out.println("Last Name : " + data.getString("last_name"));
                System.out.println("*******************");
            }
            */
            /*
            //Veri listeleme işlemi
            data.next();
            data.next();
            data.first();  // bunu gerçekleştirmek için createStatement a eklemeler yapıldı.
            System.out.println(data.getString("first_name"));
            data.last();
            System.out.println(data.getString("last_name"));
            */
            /*
            //Veri ekleme işlemleri
            String insertSql = "INSERT INTO actor (first_name,last_name,last_update) VALUES ('Ali','Yukarı','2002-02-12')";
            System.out.println(st.executeUpdate(insertSql));
            //preparestatement ile veri ekleme işlemi
            String prSqlInsert = "INSERT INTO actor (first_name,last_name,last_update) VALUES (?,?,?)";
            PreparedStatement prSt = connect.prepareStatement(prSqlInsert);
            prSt.setString(1,"Aliş");
            prSt.setString(2,"Aşağı");
            prSt.setDate(3, Date.valueOf("2000-04-16"));
            prSt.executeUpdate();
            prSt.close();
            */
            /*
            //Veri güncelleme işlemi
            String stSqlUpdate = "UPDATE actor SET first_name='Gafur' WHERE actor_id=211";
            String prSqlUpdate = "UPDATE actor SET first_name=? WHERE actor_id=?";

            //Statement stm = connect.createStatement();
            //stm.executeUpdate(stSqlUpdate);
            PreparedStatement prS = connect.prepareStatement(prSqlUpdate);
            prS.setString(1,"Gaf");
            prS.setInt(2,211);
            prS.executeUpdate();
            */
            //Veri silme işlemi
            String stSqlDelete = "DELETE FROM actor WHERE actor_id = 214";
            String prSqlDelete = "DELETE FROM actor WHERE actor_id=?";
            Statement stmD = connect.createStatement();
            stmD.executeUpdate(stSqlDelete);

            PreparedStatement prSD = connect.prepareStatement(prSqlDelete);
            prSD.setInt(1,215);
            prSD.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }



    }
}
