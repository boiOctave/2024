package feb20.CHECKEDEXCEPTION;

import java.io.BufferedReader;
import java.io.FileReader;


public class IOException {
    public static void main(String[] args) throws java.io.IOException, MyException  {
        FileReader file = new FileReader("C:\\test\\a.txt");
        BufferedReader fileinput = new BufferedReader(file);

        for (int i = 0; i < 3; i++) {
            System.out.println(fileinput.readLine());

            fileinput.close(); 
        }


        throw new MyException();
    }
}
