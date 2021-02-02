import java.sql.*;

import com.mysql.cj.jdbc.Driver;

import java.util.List;



public class mySQLAdsDao implements Ads{
    private List<Ad> ads;
    private Connection connection;

    public mySQLAdsDao(){
        try{
            Config config = new Config();
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        }   catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Ad> all() throws SQLException {
        String user_id =
        String selectQuery = "SELECT title, description FROM ads WHERE user_id = ";

        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(selectQuery);

        while (rs.next()) {
            System.out.println("Here's an album:");
            System.out.println("  id: " + rs.getLong("id"));
            System.out.println("  artist: " + rs.getString("artist"));
            System.out.println("  name: " + rs.getString("name"));
        }

    }

    @Override
    public Long insert(Ad ad) {
        return null;


    }
}