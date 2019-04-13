package gabsu.osu.sj;

import org.json.JSONArray;
import org.json.JSONObject;

public class Locations {

    //private members =====================
    JSONObject locations;
    private String id;
    private String name;
    private String climate;
    private String terrain;
    private String surface_water;
    private String[] residents;
    private String films;
    private String url;

    //Constructor =================================

    public void Location(String id) {
        QueryBuilder query = new QueryBuilder("Locations/" + id);
        this.locations = query.getSingleQuery();

        //===============

        this.id = this.locations.has("id") ? this.locations.getString("id")
                : null;
        this.name = this.locations.has("name")
                ? this.locations.getString("name")
                : null;
        this.climate = this.locations.has("climate")
                ? this.locations.getString("climate")
                : null;
        this.terrain = this.locations.has("terrain")
                ? this.locations.getString("terrain")
                : null;
        this.surface_water = this.locations.has("surface_water")
                ? this.locations.getString("surface_water")
                : null;

        if (this.locations.has("residents")) {
            JSONArray residentsArray = this.locations.getJSONArray("resident");
            this.residents = new String[residentsArray.length()];
            for (int i = 0; i < residentsArray.length(); i++) {
                this.residents[i] = residentsArray.getString(i);
            }
        } else {
            this.residents = null;
        }

        this.films = this.locations.has("films")
                ? this.locations.getString("films")
                : null;
        this.url = this.locations.has("url") ? this.locations.getString("url")
                : null;
    }

    //public methods =================================

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getClimate() {
        return this.climate;
    }

    public String getTerrain() {
        return this.terrain;
    }

    public String getSurfaceWater() {
        return this.surface_water;
    }

    public String[] getResidents() {
        return this.residents;
    }

    public String getFilms() {
        return this.films;
    }

    public String getUrl() {
        return this.url;
    }

}
