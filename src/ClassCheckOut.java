
/**
 * <h1>ClassCheckOut.java</h1>
 * <p>
 * Class ini berisi Database checkout dari Seminyak Hotel
 * Class ini representasi dari sebuah Database checkout yang terdapat pada Seminyak Hotel
 * @author Meidina
 * @version 1.0
 */


public class ClassCheckOut {
    // variabel yang digunakan dalam class
    private int id;
    private String name;
    private String address;
    private long nic;
    private String date;
    private String odate;
    private long phone;
    private String country;
    private String city;
    private String roomtype;
    private int roomno;
    private float roomcost;
    private float taxes;
    private float total;

    
    public ClassCheckOut(int id, String name, String address, long nic, String date,String odate, long phone, String country, String city, String roomtype, int roomno, float roomcost, float taxes, float total)
    {
        // initialise instance variables
        this.id=id;
        this.name=name;
        this.address=address;
        this.nic=nic;
        this.phone=phone;
        this.date=date;
        this.odate=odate;
        this.country=country;
        this.city=city;
        this.roomtype=roomtype;
        this.roomno=roomno;
        this.taxes=taxes;
        this.total=total;
    }

    ClassCheckOut(int aInt, String string, long aLong, String string0, String string1, long aLong0, String string2, String string3, String string4, int aInt0, float aFloat, float aFloat0, float aFloat1) {
       
    }

    public int getid()
    {
        return id;
    }
    public String getname()
    {
        return name;
    }
    public String getaddress()
    {
        return address;
    }
    public long getnic()
    {
        return nic;
    }
    public long getphone()
    {
        return phone;
    }
    public String getdate(){
        return date;
    }
    public String getodate()
    {
        return odate;
    }
    public String getcountry()
    {
        // return dari accessor
        return country;
        
    }
    public String getcity()
    {
        // return dari accessor
        return city;
        
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
    public float getroomcost()
    {
        // return dari accessor
        return roomcost;
    }
    public float gettaxes()
    {
        // return dari accessor
        return taxes;
    }
    public float gettotal()
    {
        // return dari accessor
        return total;
    }

    public void setId(int id) {
        // initialise instance variables
        this.id = id;
    }

    public void setName(String name) {
        // initialise instance variables
        this.name = name;
    }

    public void setNic(long nic) {
        // initialise instance variables
        this.nic = nic;
    }

    public void setDate(String date) {
        // initialise instance variables
        this.date = date;
    }

    public void setAddress(String address) {
        // initialise instance variables
        this.address = address;
    }

    public void setPhone(long phone) {
        // initialise instance variables
        this.phone = phone;
    }

    public void setRoomno(int roomno) {
        // initialise instance variables
        this.roomno = roomno;
    }

    public void setTotal(float total) {
        // initialise instance variables
        this.total = total;
    }

    public void setCity(String city) {
        // initialise instance variables
        this.city = city;
    }

    public void setRoomtype(String roomtype) {
        // initialise instance variables
        this.roomtype = roomtype;
    }

    public void setCountry(String country) {
        // initialise instance variables
        this.country = country;
    }

    public void setRoomcost(float roomcost) {
        // initialise instance variables
        this.roomcost = roomcost;
    }

    public void setTaxes(float taxes) {
        // initialise instance variables
        this.taxes = taxes;
    }

    public void setOdate(String odate) {
        // initialise instance variables
        this.odate = odate;
    }
}


