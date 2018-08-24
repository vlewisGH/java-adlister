import com.mysql.cj.jdbc.Driver;

import java.io.Writer;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{

    private Connection connection;

    public MySQLAdsDao(Config creds) {

        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    creds.getUrl(),
                    creds.getUsername(),
                    creds.getPassword()
            );
        }catch(SQLException e){
            e.printStackTrace();

        }
    }

    @Override
    public List<Ad> all() {
        try {
            Statement stat = connection.createStatement();
            String allQuery = "SELECT * FROM ads";
            ResultSet rs = stat.executeQuery(allQuery);
            return adList(rs);
        }catch(SQLException e){
            e.getStackTrace();
            throw new RuntimeException("problem with all()");
        }catch(NullPointerException e){
            throw new RuntimeException("error at all()");
        }
    }

    @Override
    public Long insert(Ad ad) {
        try{
            Statement stat = connection.createStatement();
            String query = String.format("INSERT INTO ads (user_id,title,description) VALUES(%d,'%s','%s)",
                    ad.getUserId(),
                    ad.getTitle(),
                    ad.getDescription()
            );
            stat.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet generatedKeys = stat.getGeneratedKeys();
            generatedKeys.next();
            return generatedKeys.getLong(1);
        }catch(SQLException e){
            throw new RuntimeException("error at insert()");
        }
    }

    private List<Ad> adList(ResultSet rset) throws SQLException{
        List<Ad> makelist = new ArrayList<>();
            while(rset.next()){

                makelist.add(new Ad(
                        rset.getLong("id"),
                        rset.getLong("user_id"),
                        rset.getString("title"),
                        rset.getString("Description")
                ));
            }

        return makelist;

    }

}
