package gabsu.osu.sj;

import org.json.JSONArray;
import org.json.JSONObject;

public class Species {

    //private members =======================================
    private JSONObject species;
    private String id;
    private String name;
    private String classifications;
    private String eye_colors;
    private String hair_colors;
    private String[] people;
    private String[] films;
    private String url;

    //Constructor ===========================================
    public Species(String id) {
        QueryBuilder query = new QueryBuilder("Species/" + id);
        this.species = query.getSingleQuery();

        //==========================
        this.id = this.species.has("id") ? this.species.getString("id") : null;
        this.name = this.species.has("name") ? this.species.getString("name")
                : null;
        this.classifications = this.species.has("classifications")
                ? this.species.getString("classifications")
                : null;
        this.eye_colors = this.species.has("eye_colors")
                ? this.species.getString("eye_colors")
                : null;
        this.hair_colors = this.species.has("hair_colors")
                ? this.species.getString("hair_colors")
                : null;

        if (this.species.has("people")) {
            JSONArray peopleArray = new JSONArray(this.species);
            this.people = new String[peopleArray.length()];
            for (int i = 0; i < peopleArray.length(); i++) {
                this.people[i] = peopleArray.getString(i);
            }
        } else {
            this.people = null;
        }

        if (this.species.has("films")) {
            JSONArray filmsArray = new JSONArray(this.species);
            this.films = new String[filmsArray.length()];
            for (int i = 0; i < filmsArray.length(); i++) {
                this.films[i] = filmsArray.getString(i);
            }
        } else {
            this.films = null;
        }

        this.url = this.species.has("url") ? this.species.getString("url")
                : null;
    }

    //public methods =========================================

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getClassification() {
        return this.classifications;
    }

    public String getEyeColors() {
        return this.eye_colors;
    }

    public String getHairColors() {
        return this.hair_colors;
    }

    public String[] getPeople() {
        return this.people;
    }

    public String[] getFilms() {
        return this.films;
    }

    public String getUrl() {
        return this.url;
    }

}
