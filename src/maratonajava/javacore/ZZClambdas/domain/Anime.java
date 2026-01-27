package maratonajava.javacore.ZZClambdas.domain;

public class Anime {
    private String title;
    private int episodios;

    public Anime(String title, int episodios) {
        this.title = title;
        this.episodios = episodios;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", episodios=" + episodios +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public int getEpisodios() {
        return episodios;
    }
}
