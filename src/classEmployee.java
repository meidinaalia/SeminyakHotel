/**
 * <h1>ClassEmployee.java</h1>
 * <p>
 * Class ini berisi Database checkemployee dari Seminyak Hotel
 * Class ini representasi dari sebuah Database checkemployee yang terdapat pada Seminyak Hotel
 * @author Meidina
 * @version 1.0
 */
public class classEmployee {
    // variabel yang digunakan dalam class
    private int id;
    private String name;
    private long nic;
    private long phone;
    private String desig;
    private float salary;
    
    public classEmployee(int id, String name, long nic, long phone, String desig, float salary)
    {
        // initialise instance variables
        this.id=id;
        this.name=name;
        this.nic=nic;
        this.phone=phone;
        this.desig=desig;
        this.salary=salary;
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
     
     
     public String getdesig()
     {
         // return dari accessor
        return desig;
    }
     
    public float getsalary()
    {
        // return dari accessor
        return salary;
    }

    public void setName(String name) {
        // initialise instance variables
        this.name = name;
    }

    public void setPhone(long phone) {
        // initialise instance variables
        this.phone = phone;
    }

    public void setNic(long nic) {
        // initialise instance variables
        this.nic = nic;
    }

    public void setDesig(String desig) {
        // initialise instance variables
        this.desig = desig;
    }

    public void setSalary(float salary) {
        // initialise instance variables
        this.salary = salary;
    }

    public void setId(int id) {
        // initialise instance variables
        this.id = id;
    }
}
