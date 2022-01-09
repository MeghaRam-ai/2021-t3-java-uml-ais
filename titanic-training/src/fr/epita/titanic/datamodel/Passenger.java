package fr.epita.titanic.datamodel;

public class Passenger {

    //    PassengerId,Pclass,Name,Sex,Age,SibSp,Parch,Ticket,Fare,Cabin,Embarked
    private Integer PassengerId;
    private Integer Pclass;

    public Integer getSurvived() {
        return Survived;
    }

    public void setSurvived(Integer survived) {
        Survived = survived;
    }

    private Integer Survived;
    private String Name;
    private String Sex;
    private Double Age;
    private Integer SibSp;
    private Integer Parch;
    private String Ticket;
    private Double Fare;
    private String Cabin;
    private String Embarked;

    public Integer getPassengerId() {
        return PassengerId;
    }

    public void setPassengerId(Integer passengerId) {
        PassengerId = passengerId;
    }

    public Integer getPclass() {
        return Pclass;
    }

    public void setPclass(Integer pclass) {
        Pclass = pclass;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public Double getAge() {
        if(Age!=null) {
            return Age;
        }
        else{
            return 0.0;
        }
    }

    public void setAge(Double age) {
        Age = age;
    }

    public Integer getSibSp() {
        return SibSp;
    }

    public void setSibSp(Integer sibSp) {
        SibSp = sibSp;
    }

    public Integer getParch() {
        return Parch;
    }

    public void setParch(Integer parch) {
        Parch = parch;
    }

    public String getTicket() {
        return Ticket;
    }

    public void setTicket(String ticket) {
        Ticket = ticket;
    }

    public Double getFare() {
        if(Fare!=null) {
            return Fare;
        }
        else{
            return 0.0;
        }

    }

    public void setFare(Double fare) {
        Fare = fare;
    }

    public String getCabin() {
        return Cabin;
    }

    public void setCabin(String cabin) {
        Cabin = cabin;
    }

    public String getEmbarked() {
        return Embarked;
    }

    public void setEmbarked(String embarked) {
        Embarked = embarked;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "PassengerId=" + PassengerId +
                ", Pclass=" + Pclass +
                ", Name='" + Name + '\'' +
                ", Sex='" + Sex + '\'' +
                ", Age=" + Age +
                ", SibSp=" + SibSp +
                ", Parch=" + Parch +
                ", Ticket='" + Ticket + '\'' +
                ", Fare=" + Fare +
                ", Cabin='" + Cabin + '\'' +
                ", Embarked='" + Embarked + '\'' +
                '}';
    }
}
