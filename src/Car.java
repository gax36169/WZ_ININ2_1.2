public class Car {
   private String name;
   private int year;
   private String fuel;
   private String colour;

    Car(){
        this.name = "Fiat";
        this.year = 1999;
        this.fuel = "95";
        this.colour = "Zielony";
    }
    Car(String name, int year, String fuel, String colour){
        this.name = name;
        this.year = year;
        this.fuel = fuel;
        this.colour = colour;
    }
    public String Infocar(){
        return "Nazwa samochodu to: " + this.name +" "
                + "Rok Produkcji to: " + this.year +" "
                + "Rodzaj Paliwa to: " + this.fuel +" "
                + "Kolor samochodu to: " + this.colour +" ";
    }
}
