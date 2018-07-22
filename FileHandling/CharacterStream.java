import java.io.*;

public class CharacterStream{
    public static void main(String[] args) throws IOException{
        FileWriter writer = new FileWriter("character_stream.txt");
        writer.write("Written from File Writer");
        writer.close();

        FileReader fr = new FileReader("character_stream.txt");

        /**Create a new array 'a' with dataType char and space 50 */
        char[] a = new char[50];
        fr.read(a);

        /**Every element of the array a is represented by the variable 'c' */
        for(char c : a)
        System.out.println(c);
        fr.close();
    }
}