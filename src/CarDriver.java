public class CarDriver {
    public static void main(String [] args){
        //How to create an object pt1
        Car his = new Car();
        his.setMake("Honda");
        his.setColor("black");
        his.setHorsePower(650);
        his.setEngineSize(3.5);

        //Object creation pt2
        Car hers = new Car("Volks","Pink",2.5, 300);

        System.out.print(" his"+his.toString());


    }
}
