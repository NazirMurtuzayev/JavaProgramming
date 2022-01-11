package day_30CustomClass.CustomClassTasks;

public class MovieObject {
    public static void main(String[] args) {

        MovieTask movie=new MovieTask("USA","Journey to SDET: Cydeo Batch 23","Adventure","10/25/2021","Kuzzat Altay");
        movie.addCast("Asiya, Adam, Muhtar");
        String[]casts={"Gorkmaz","Koray","Nattayya","Ernie", "Selma"};
        movie.addCasts(casts);
        System.out.println(movie);

    }

}
/*
3.2create a class called MovieObjects
            1. create an object of the movie:
                    title: Journey to SDET: Cydeo Batch 23
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 10/25/2021
                    director: Kuzzat Altay
                    Casts: Asiya, Adam, Muhtar and 5 more students from your group

        print the full info of the movie
 */