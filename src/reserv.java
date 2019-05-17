/**
 * <h1>reserv.java</h1>
 * <p>
 * Class ini berisi Database reserv dari Seminyak Hotel
 * Class ini representasi dari sebuah Database reserv yang terdapat pada Seminyak Hotel
 * @author Erna
 * @version 1.0
 */
public class reserv {
    // variabel yang digunakan dalam class
    private int id;
    private String name;
    private long phone;
    private String date;
    private String roomtype;
    private int roomno;
    
    public reserv(int id, String name, long phone, String date, String roomtype, int roomno)
    {
        // initialise instance variables
        this.id=id;
        this.name=name;
        this.phone=phone;
        this.date=date;
        this.roomtype=roomtype;
        this.roomno=roomno;
    }
    
    public int getid()
    {
        // return dari accessor
        return id;
    }
    
    public String getname()
    {
        // return dari accessor
        return name;
    }
    
     public long getphone()
    {
        // return dari accessor
        return phone;
    }
     
     public String getdate()
     {
         // return dari accessor
        return date;
     }
     
     public String getroomtype()

    {
        // return dari accessor
        return roomtype;
    }
    public int getroomno()
    {
        // return dari accessor
        return roomno;
    }
    
}
