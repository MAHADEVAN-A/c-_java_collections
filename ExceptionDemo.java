import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ExceptionDemo {
  
    static void arithmeticException(int a,int b)
    {
      System.out.println("Result = "+(a/b));
    }
    
    static void nullPointerException(String str)
    {
      System.out.println("Length = "+str.length());
    }
    
    static void fileNotFoundException()
    {
      try{
        File file = new File("E://file.txt");
        FileReader fr = new FileReader(file);
      }catch(Exception e){
        System.out.println(e.getMessage());
      }
    }
    
    static void numberFormatException(String str)
    {
      int num = Integer.parseInt(str);
      System.out.println("Integer = "+(num-5));
    }
    
    static char indexOutOfBounds(int pos)
    {
      String str = "mahadevan";
      return str.charAt(pos);
    }
    
    static void userDefined(int num)throws GreaterThanTenException
    {
      if(num>10)
      {
        throw new GreaterThanTenException("Greater than 10 exception");
      }
    }
  
    public static void main(String[] args) {
      
      ExceptionDemo.nullPointerException("maha"); 
      // try{
      ExceptionDemo.fileNotFoundException();
      // }catch(Exception e){
      //   System.out.println(e.getMessage());
      // }
      ExceptionDemo.arithmeticException(1,5);
      ExceptionDemo.numberFormatException("24");
      char ch = ExceptionDemo.indexOutOfBounds(5);
      System.out.println("Char ch = "+ch);
      
     try{
      ExceptionDemo.userDefined(22);
     }catch(Exception e){
       System.out.println(e.getMessage());
     }
      
    }
}

public class GreaterThanTenException extends Exception
{
  GreaterThanTenException(){}
  GreaterThanTenException(String msg){
    super(msg);
  }
}
