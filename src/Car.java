public class Car {
    public String color;
    public double engineSize;
    public long horsePower;
    public String make;

    public Car(){
        color = "red";
        engineSize = 6.5;
        horsePower = 200;
        make = "Ferrari";
    }
    public Car(String make, String color, double engineSize, long horsePower){
        this.color = color;
        this.engineSize = engineSize;
        this.horsePower = horsePower;
        this.make = make;
    }
    public void setColor (String color){
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setEngineSize(double engineSize){
        this.engineSize = engineSize;
    }
    public double getEngineSize(){
        return engineSize;
    }
    public void setHorsePower(long horsePower){
        this.horsePower = horsePower;
    }
    public long getHorsePower(){
        return horsePower;
    }
    public void setMake(String make){
        this.make = make;
    }
    public String getMake(){
        return make;
    }
    public String toString(){
        return " Car Records\n"+"Make:"+this.make+"\nColor:"+this.color+"\nEngine Size:"+this.engineSize+"\nHorse power:"+this.horsePower;
    }
}
