import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class PassengerReaderCSV {
    public static void main(String[] args) {
//        PassengerId,Pclass,Name,Sex,Age,SibSp,Parch,Ticket,Fare,Cabin,Embarked

        String line="892,3,\"Kelly, Mr. James\",male,34.5,0,0,330911,7.8292,,Q";
        line=line.replaceAll(",",";");
        line=line.replaceAll("; ",", ");
        String[] split=line.split(",");
        List<Passenger> passengers=new ArrayList<>();
        Passenger passenger=new Passenger();
        passenger.setPassengerId(Integer.parseInt(split[0]));

    }

//    public List<Passenger> read(File file){
//        List<String> lines = Files.readAllLines(file.toPath());
//        List<Passenger> passengers=new ArrayList<>();
//
//        lines.remove(0);
//        for(String line : lines){
//            // 2- lineParts the lines on the separator (";") using the String.lineParts() method
//            String[] lineParts = line.split(",");
//            Passenger passenger=new Passenger();
//            passenger.
//            if (lineParts.length > 1){
//                map.put(lineParts[0], lineParts[1]);
//            }
//        }
//    }
}
