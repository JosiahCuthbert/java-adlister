import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;
import java.sql.Statement;
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
    public List<Ad> all() {
        return null;
    }

    @Override
    public Long insert(Ad ad) {
        return null;


    }
}