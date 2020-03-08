package SerializationandDeserialization2;

public class EmpMain{
public static void main(String[] args) 
    { 
        Emp object = new Emp("ab", 20, 2, 1000); 
        String filename = "shubham.txt"; 
  
        try { 
  
            FileOutputStream file = new FileOutputStream 
                                           (filename); 
            ObjectOutputStream out = new ObjectOutputStream 
                                           (file); 
  
            out.writeObject(object); 
  
            out.close(); 
            file.close(); 
  
            System.out.println("Object has been serialized\n"
                              + "Data before Deserialization."); 
            printdata(object); 
  
            object.b = 2000; 
        } 
  
        catch (IOException ex) { 
            System.out.println("IOException is caught"); 
        } 
  
        object = null; 
  
        try { 

            FileInputStream file = new FileInputStream(filename); 
            ObjectInputStream in = new ObjectInputStream(file); 
  
            object = (Emp)in.readObject(); 
  
            in.close(); 
            file.close(); 
            System.out.println("Object has been deserialized\n"
                                + "Data after Deserialization."); 
            printdata(object); 

        } 
  
        catch (IOException ex) { 
            System.out.println("IOException is caught"); 
        } 
  
        catch (ClassNotFoundException ex) { 
            System.out.println("ClassNotFoundException" + 
                                " is caught"); 
        } 
    } 
} 
