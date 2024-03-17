public class Main {
    public static void main(String[] args){
        Film movie = new Film();
        movie.name_movie = "Avatar";
        movie.year_movie = 2137;
        movie.setName_Autor("andrzej");
        movie.setYear_author(2000);
        movie.info();






        Car car = new Car();

        Car car2 = new Car(
                "BMW",
                2011,
                "Disel",
                "Niebieski");
        Car car3 = car2;


        System.out.println(car.Infocar());
        System.out.println(car2.Infocar());
        System.out.println(car3.Infocar());

    }
}