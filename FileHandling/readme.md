# File Handling :books:
 **There are two type of class hierarchies for file handling**
* [Byte Stream Classes:](#byte-stream-class)
    They are used to perform Input and Output of 8-bit bytes. There are many abstract classes available for handling byte stream. Most widely used are `FileInputStream` and `File Output Stream` 
* [Character Stream Classes:](#character-stream-class) 
    They are used to perform Input and Output for 16-bit Unicode. There are different classes to handle Character Stream Classes as well. Most widely used are `File Reader` and `File Writer`

## Byte Stream Class 
**Example**
```java
import java.io.*;
public class CopyFile {

   public static void main(String args[]) throws IOException {  
      FileInputStream in = null;
      FileOutputStream out = null;

      try {
         in = new FileInputStream("input.txt");
         out = new FileOutputStream("output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}
```
## Character Stream Class 
**Example**
```java
import java.io.*;
public class CopyFile {

   public static void main(String args[]) throws IOException {
      FileReader in = null;
      FileWriter out = null;

      try {
         in = new FileReader("input.txt");
         out = new FileWriter("output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}
```