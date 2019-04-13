package gabsu.osu.sj;

import org.json.JSONObject;

import gabsu.osu.util.FindFilmID;

public class Films {

    //private members ==================================================
    private JSONObject film;
    private String id;
    private String title;
    private String description;
    private String director;
    private String producer;
    private int release_date;
    private int rt_score;

    //Constructor ======================================================

    public Films(String name) {
        QueryBuilder query = new QueryBuilder(
                "films/" + new FindFilmID().FindID(name));
        this.film = query.getSingleQuery();

        // ====================================

        this.id = this.film.has("id") ? this.film.getString("id") : null;
        this.title = this.film.has("title") ? this.film.getString("title")
                : null;
        this.description = this.film.has("description")
                ? this.film.getString("description")
                : null;
        this.director = this.film.has("director")
                ? this.film.getString("director")
                : null;
        this.producer = this.film.has("producer")
                ? this.film.getString("producer")
                : null;
        this.release_date = this.film.has("release_date")
                ? this.film.getInt("release_date")
                : null;
        this.rt_score = this.film.has("rt_score") ? this.film.getInt("rt_score")
                : null;
    }

    //public methods ====================================================

    public String getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDirector() {
        return this.director;
    }

    public String getProducer() {
        return this.producer;
    }

    public int getReleaseDate() {
        return this.release_date;
    }

    public int getRtScore() {
        return this.rt_score;
    }

}
