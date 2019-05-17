/**
 * <h1>login.java</h1>
 * <p>
 * Class ini berisi Database login dari Seminyak Hotel
 * Class ini representasi dari sebuah Database login yang terdapat pada Seminyak Hotel
 * @author Ellen
 * @version 1.0
 */
public class login {
    // variabel yang digunakan dalam class
    int id;
    String user;
    String pass;
    String status;
    
    public login(int id, String user, String pass, String status)
    {
        // initialise instance variables
        this.id=id;
        this.user=user;
        this.pass=pass;
        this.status=status;
    }
    
    public int getid()
    {
        // return dari accessor
        return id;
    }
    public String getuser()
    {
        // return dari accessor
        return user;
    }
    public String getpass()
    {
        // return dari accessor
        return pass;
    }
    public String getstatus()
    {
        // return dari accessor
        return status;
    }
}
