import java.util.ArrayList;

public class TvEpisodes {
    private String episodeTitle;
    private int episodeLength;
    private String director;
    private ArrayList<String> cast;

    public TvEpisodes(String episodeTitle, int episodeLength, String director, ArrayList<String> cast) {
        this.episodeTitle = episodeTitle;
        this.episodeLength = episodeLength;
        this.director = director;
        this.cast = cast;
    }

    public String getEpisodeTitle() {
        return episodeTitle;
    }

    public void setEpisodeTitle(String episodeTitle) {
        this.episodeTitle = episodeTitle;
    }

    public int getEpisodeLength() {
        return episodeLength;
    }

    public void setEpisodeLength(int episodeLength) {
        this.episodeLength = episodeLength;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public ArrayList<String> getCast() {
        return cast;
    }

    public void setCast(ArrayList<String> cast) {
        this.cast = cast;
    }

    @Override
    public String toString() {
        return "TvEpisodes{" +
                "episodeTitle='" + episodeTitle + '\'' +
                ", episodeLength=" + episodeLength +
                ", director='" + director + '\'' +
                ", cast=" + cast +
                '}';
    }
}

