package less5;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        BufferedReader br=null;



        try {
            File file=new File("test.csv");

            if (!file.exists())
                file.createNewFile();


            PrintWriter pw=new PrintWriter(file);
            pw.println("Value 1;Value 2;Value 3");
            pw.println("100;200;123");
            pw.println("300;400;500");
            pw.close();


            br=new BufferedReader(new FileReader("test.csv"));
            String line;
            ArrayList<String> arr=new ArrayList<>();
            while ((line=br.readLine()) !=null) {
                arr.add(line);
            }

            AppData appData=new AppData(arr);



        } catch (IOException e){
            System.out.println("error"+e);
        } finally { try {
            br.close(); } catch (IOException e){
            System.out.println("error"+e);
        }

        }

    }
}