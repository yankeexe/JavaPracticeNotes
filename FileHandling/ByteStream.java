import java.io.*;

public class ByteStream
{
    public static void main(String[] args) throws IOException{
        FileInputStream in  = null;
        FileOutputStream out = null;

        try{
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");
            int c;
            /**the byte is returned as an int in the range of 0 to 255.
             * If no value is available and end of the stream has been reached
             * then it returns -1.
             */
            while ((c = in.read()) != -1)
            {
                out.write(c);
            }
        }
        finally{
            if(in != null){
                in.close();
            }
            if(out != null){
                out.close();
            }
        }
    }
}