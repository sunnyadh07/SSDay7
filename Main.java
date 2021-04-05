import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cast = new ArrayList<>();
        cast.add("Elena");
        cast.add("Damon");
        cast.add("Stefan");

        TvEpisodes vampireDiaries = new TvEpisodes("Stefans episode", 34, "Sam", cast);

        System.out.println(vampireDiaries);

        }
}

