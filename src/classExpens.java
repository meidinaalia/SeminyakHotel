/**
 * <h1>ClassExpens.java</h1>
 * <p>
 * Class ini berisi Database class expens dari Seminyak Hotel
 * Class ini representasi dari sebuah Database class expens yang terdapat pada Seminyak Hotel
 * @author Feno
 * @version 1.0
 */
public class classExpens {
    // variabel yang digunakan dalam class
    int id;
    String name;
    String nature;
    float Expens;
    String date;
    
    
    public classExpens(int id, String name, String nature, float Expens, String date){
        // initialise instance variables
        this.id=id;
        this.name=name;
        this.nature=nature;
        this.Expens=Expens;
        this.date=date;
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
    
    public String getnature()
    {
        // return dari accessor
        return nature;
        
    }
    
    public float getexpens()
    {
        // return dari accessor
        return Expens;
    }
    
    public String getdate()
    {
        // return dari accessor
        return date;
    }

    public void setId(int id) {
        // initialise instance variables
        this.id = id;
    }

    public void setName(String name) {
        // initialise instance variables
        this.name = name;
    }

    public void setDate(String date) {
        // initialise instance variables
        this.date = date;
    }

    public void setExpens(float expens) {
        // initialise instance variables
        Expens = expens;
    }

    public void setNature(String nature) {
        // initialise instance variables
        this.nature = nature;
    }
}
