import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TitanicLauncher {

    public static void main(String[] args) throws IOException {
        File file = new File("./titanic_data/test.csv");
        System.out.println(file);
        PassengerReaderCSV reader=new PassengerReaderCSV();
//        reader.read(file);

        // 1- display all the lines in the file


    }
}
