
package LMS;

public abstract class Person 
{   
    protected int id;           
    protected String password;  
    protected String name;      
    protected String address;   
    protected int phoneNo;      
    
    static int currentIdNumber = 0;    

    public Person(int idNum, String name, String address, int phoneNum)   
    {
        currentIdNumber++;
        
        if(idNum==-1)
        {
            id = currentIdNumber;
        }
        else
            id = idNum;
        
        password = Integer.toString(id);
        this.name = name;
        this.address = address;
        phoneNo = phoneNum;
    }        
    
    
    public void printInfo()
    {
        System.out.println("-----------------------------------------");
        System.out.println("\nThe details are: \n");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone No: " + phoneNo + "\n");
    }
    
    
    public void setAddress(String a)
    {
        address = a;
    }
    
    public void setPhone(int p)
    {
        phoneNo = p;
    }
    
    public void setName(String n)
    {
        name = n;
    }
   
   
    public String getName()
    {
        return name;
    }
    
    public String getPassword()
    {
        return password;
    }
    
     public String getAddress()
    {
        return address;
    }
     
     public int getPhoneNumber()
    {
        return phoneNo;
    }
    public int getID()
    {
        return id;
    }
   
    
     public static void setIDCount(int n)
    {
        currentIdNumber=n;
    }
   
} // Person Class Closed
