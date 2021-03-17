import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //String[] prettyLiarsCast = {"Ronald", "Sophie", "Delilah"};
        TvEpisodes show = new TvEpisodes("Pretty liars", 23, "James Bond", "Sammy", "Diana");

        System.out.println(Arrays.toString(show.getCast()));

        ArrayList<String> newcast = new ArrayList<>();
        newcast.add("Elena");
        newcast.add("Damon");
        newcast.add("Stefan");

        for (String cast : newcast) {
            System.out.println(cast);

        }
    }
}

