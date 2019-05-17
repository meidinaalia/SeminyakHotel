
/**
 * <h1>ClassCheckIn.java</h1>
 * <p>
 * Class ini berisi Database checkin dari Seminyak Hotel
 * Class ini representasi dari sebuah Database checkin yang terdapat pada Seminyak Hotel
 * @author Erna
 * @version 1.0
 */

public class ClassCheckIn {
    // variabel yang digunakan dalam class
    private int id;
    private String name;
    private String address;
    private long nic;
    private String date;
    private long phone;
    private String country;
    private String city;
    private String roomtype;
    private int roomno;
    private float roomcost;
    private float taxes;
    private float total;
    
    public ClassCheckIn(int id, String name, String address, long nic,String date, long phone, String country, String city, String roomtype, int roomno, float roomcost, float taxes, float total)
    {
        // initialise instance variables
        this.id=id;
        this.name=name;
        this.address=address;
        this.nic=nic;
        this.phone=phone;
        this.date=date;
        this.country=country;
        this.city=city;
        this.roomtype=roomtype;
        this.roomno=roomno;
        this.taxes=taxes;
        this.total=total;
    }

    ClassCheckIn(int aInt, String string, String string0, long aLong, String string1, long aLong0, String string2, String string3, int aInt0, int aInt1, String string4, int aInt2, float aFloat, float aFloat0, float aFloat1) {
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
    public String getaddress()
    {
        // return dari accessor
        return address;
    }
    public long getnic()
    {
        // return dari accessor
        return nic;
    }
    public long getphone()
    {
        // return dari accessor
        return phone;
    }
    public String getdate(){
        return date;
    }
    
    public String getcountry()
    {
        // return dari accessor
        return country;
        
    }
    public String getcity()
    {
        return city;
        
    }
    public String getroomtype()
    {
        return roomtype;
    }
    public int getroomno()
    {
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
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNic(long nic) {
        this.nic = nic;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void setRoomno(int roomno) {
        this.roomno = roomno;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setRoomcost(float roomcost) {
        this.roomcost = roomcost;
    }

    public void setTaxes(float taxes) {
        this.taxes = taxes;
    }
}
