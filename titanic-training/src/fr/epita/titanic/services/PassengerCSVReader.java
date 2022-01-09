package fr.epita.titanic.services;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import fr.epita.titanic.datamodel.Passenger;

public class PassengerCSVReader {

     public List<Passenger> read(File file){
          List<Passenger> passengers = new ArrayList<>();
          try {
               List<String> lines = Files.readAllLines(file.toPath());
               lines.remove(0);
               for (String line: lines){
                    line = line.replaceAll(",",";");
                    line =   line.replaceAll("; ", ", ");


                    String[] split = line.split(";");

                    Passenger instance = new Passenger();
                    if(split[0].length()!=0){
                         instance.setPassengerId(Integer.parseInt(split[0]));
                    }
                    if(split[1].length()!=0){
                         instance.setPclass(Integer.parseInt(split[1]));
                    }
                    if(split[4].length()!=0){
                         instance.setAge(Double.parseDouble(split[4]));
                    }
                    if(split[5].length()!=0){
                         instance.setSibSp(Integer.parseInt(split[5]));
                    }
                    if(split[6].length()!=0){
                         instance.setParch(Integer.parseInt(split[6]));
                    }
                    if(split[8].length()!=0){
                         instance.setFare(Double.parseDouble(split[8]));
                    }

                    instance.setName(split[2]);
                    instance.setSex(split[3]);
                    instance.setTicket(split[7]);
                    instance.setCabin(split[9]);
                    instance.setEmbarked(split[10]);
                    //to be completed

                    passengers.add(instance);
               }
          } catch (IOException e) {
               e.printStackTrace();
          }


          return passengers;
     }

     public List<Passenger> readTrain(File file){
//          PassengerId,Survived,Pclass,Name,Sex,Age,SibSp,Parch,Ticket,Fare,Cabin,Embarked
          List<Passenger> passengers = new ArrayList<>();
          try {
               List<String> lines = Files.readAllLines(file.toPath());
               lines.remove(0);
               for (String line: lines){
                    line = line.replaceAll(",",";");
                    line =   line.replaceAll("; ", ", ");
                    String[] split = line.split(";");

                    Passenger instance = new Passenger();
                    if(split[0].length()!=0){
                         instance.setPassengerId(Integer.parseInt(split[0]));
                    }
                    if(split[1].length()!=0){
                         instance.setSurvived(Integer.parseInt(split[1]));
                    }
                    if(split[2].length()!=0){
                         instance.setPclass(Integer.parseInt(split[2]));
                    }

                    instance.setName(split[3]);
                    instance.setSex(split[4]);

                    if(split[5].length()!=0){
                         instance.setAge(Double.parseDouble(split[5]));
                    }
                    if(split[6].length()!=0){
                         instance.setSibSp(Integer.parseInt(split[6]));
                    }
                    if(split[7].length()!=0){
                         instance.setParch(Integer.parseInt(split[7]));
                    }
                    instance.setTicket(split[8]);
                    if(split[9].length()!=0){
                         instance.setFare(Double.parseDouble(split[9]));
                    }
                    instance.setCabin(split[10]);

                    if(split.length>11) {
                         instance.setEmbarked(split[11]);
                    }
                    //to be completed

                    passengers.add(instance);
               }
          } catch (IOException e) {
               e.printStackTrace();
          }


          return passengers;
     }
}
