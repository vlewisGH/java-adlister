public class Config {

    private String Url = "jdbc:mysql://localhost/adlister_db?serverTimezone=UTC&useSSL=false";
    private String Username = "adlister_admin";
    private String Password = "AdminPass1234";

    public String getUrl(){
        return this.Url;
    }
    public String getUsername(){
        return this.Username;
    }
    public String getPassword(){
        return this.Password;
    }
}
