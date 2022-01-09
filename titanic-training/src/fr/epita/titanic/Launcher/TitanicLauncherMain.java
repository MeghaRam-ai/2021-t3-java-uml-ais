package fr.epita.titanic.Launcher;

import fr.epita.titanic.datamodel.Passenger;
import fr.epita.titanic.services.PassengerCSVReader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class TitanicLauncherMain {

    public static void main(String[] args) throws IOException {
        List<Passenger> passengers = new ArrayList<>();
        List<Passenger> passengers_train = new ArrayList<>();


        File file = new File("./titanic_data/test.csv");
        System.out.println(file);
        PassengerCSVReader reader=new PassengerCSVReader();
        passengers=reader.read(file);
        showStatistics(passengers);


        File file1 = new File("./titanic_data/train.csv");
        System.out.println(file1);
        passengers_train=reader.readTrain(file1);
        showStatistics(passengers_train);

    }

    public static void showStatistics(List<Passenger> passengers){
        Double age=0.0;
        Double average_age=0.0;
        int no_men=0, no_women=0;
        Double average_ticket_fair=0.0;
        Double ticket_fair=0.0;
        int count_fair=0;

        for(int p=0;p<passengers.size();p++){
            //calculating average age
            age=age+passengers.get(p).getAge();

            //number of women and men
            if(passengers.get(p).getSex().equals("female")){
                no_women++;
            }else{
                no_men++;
            }

            if(passengers.get(p).getFare()!=0.0){
                ticket_fair=average_ticket_fair+passengers.get(p).getFare();
                count_fair++;
            }


        }

        Double mean=age/passengers.size();
        Double standardDeviation_Age=0.0;
        for(int p=0;p<passengers.size();p++){
            standardDeviation_Age += Math.pow(passengers.get(p).getAge() - mean, 2);
        }
        standardDeviation_Age= Math.sqrt(standardDeviation_Age/passengers.size());

        System.out.println("Average age="+mean+"  Standard deviation= "+standardDeviation_Age);
        System.out.println("Number of Women="+no_women);
        System.out.println("Number of Men="+no_men);
        System.out.println("average ticket fair="+ticket_fair/count_fair);

    }
}
