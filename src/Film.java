public class Film extends Autor {
    String name_movie;
    int year_movie;

    public void info() {
        System.out.println("Nazwa Filmu to: " + name_movie +" "
                + "Rok produkcji filmu to: " + year_movie +" "
                + "Autor Filmu to: "+ this.getName_Autor() + " "
                + "Rok Urodzenia Autora to: "+this.getYear_author());


    }


}