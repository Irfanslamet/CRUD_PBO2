
package crud_pbo2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Koneksi {
        public static Connection connect() {
        Connection conn = null;
        try {
             //String path = "C:\Users\DELL\Documents\MAHASISWA.accdb";
               //String url = "jdbc:ucanaccess://" + path;
            // C:\Users\DELL\Documents/MAHASISWA
           String url = "jdbc:ucanaccess://C:/Users/DELL/Documents/MAHASISWA.accdb";
            conn = DriverManager.getConnection(url);
            System.out.println("Koneksi ke database berhasil!");
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
        return conn;
    }

}
