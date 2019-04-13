package gabsu.osu.sj;

import org.json.JSONObject;

public class People {

    //private members =====================================
    private JSONObject people;
    private String id;
    private String name;
    private String gender;
    private String age;
    private String eye_color;
    private String hair_color;
    private String films;
    private String species;
    private String url;

    //public constructor ==================================
    public void People(String id) {
        QueryBuilder query = new QueryBuilder("People/" + id);
        this.people = query.getSingleQuery();

        //===================

        this.id = this.people.has("id") ? this.people.getString("id") : null;
        this.name = this.people.has("name") ? this.people.getString("name")
                : null;
        this.gender = this.people.has("gender")
                ? this.people.getString("gender")
                : null;
        this.age = this.people.has("age") ? this.people.getString("age") : null;
        this.eye_color = this.people.has("eye_color")
                ? this.people.getString("eye_color")
                : null;
        this.hair_color = this.people.has("hair_color")
                ? this.people.getString("hair_color")
                : null;
        this.films = this.people.has("films") ? this.people.getString("films")
                : null;
        this.species = this.people.has("species")
                ? this.people.getString("species")
                : null;
        this.url = this.people.has("url") ? this.people.getString("url") : null;
    }

    //public methods ==========================================

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getGender() {
        return this.gender;
    }

    public String getAge() {
        return this.age;
    }

    public String getEyeColor() {
        return this.eye_color;
    }

    public String getHairColor() {
        return this.hair_color;
    }

    public String getFilms() {
        return this.films;
    }

    public String getSpecies() {
        return this.species;
    }

    public String getUrl() {
        return this.url;
    }

}
