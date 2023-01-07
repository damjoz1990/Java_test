package t11_file_cut;

import java.io.*;

public class FileCut {
    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        try (
            FileInputStream inputStream = new FileInputStream(fileName);
            FileOutputStream outputStream = new FileOutputStream(fileName1);
            FileOutputStream outputStream1 = new FileOutputStream(fileName2);
            )
        {
            int byteContent = 0;
            int fileCut = (inputStream.available() +1) /2;
            while(inputStream.available() > 0){
                if (fileCut > inputStream.available()){
                    outputStream.write(inputStream.read());
                }else {
                    outputStream1.write(inputStream.read());
                }
            }
        }catch (Exception e) {
            System.out.println(e);
        }

    }
}
