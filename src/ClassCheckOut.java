
public class ClassCheckOut {
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
        return roomcost;
    }
    public float gettaxes()
    {
        return taxes;
    }
    public float gettotal()
    {
        return total;
    }
}

