package gabsu.osu.sj;

import org.json.JSONObject;

public class Vehicles {

    //private members =========================================
    private JSONObject vehicles;
    private String id;
    private String name;
    private String description;
    private String vehicle_class;
    private String length;
    private String pilot;
    private String films;
    private String url;

    //Constructor =================================================

    public Vehicles(String id) {
        QueryBuilder query = new QueryBuilder("Vehicles/" + id);
        this.vehicles = query.getSingleQuery();

        //================================
        this.id = this.vehicles.has("id") ? this.vehicles.getString("id")
                : null;
        this.name = this.vehicles.has("name") ? this.vehicles.getString("name")
                : null;
        this.description = this.vehicles.has("description")
                ? this.vehicles.getString("description")
                : null;
        this.vehicle_class = this.vehicles.has("vehicle_class")
                ? this.vehicles.getString("vehicle_class")
                : null;
        this.length = this.vehicles.has("length")
                ? this.vehicles.getString("length")
                : null;
        this.pilot = this.vehicles.has("pilot")
                ? this.vehicles.getString("pilot")
                : null;
        this.films = this.vehicles.has("films")
                ? this.vehicles.getString("films")
                : null;
        this.url = this.vehicles.has("url") ? this.vehicles.getString("url")
                : null;
    }

    //public methods ===========================================

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String getVehicleClass() {
        return this.vehicle_class;
    }

    public String getLength() {
        return this.length;
    }

    public String getPilot() {
        return this.pilot;
    }

    public String getFilms() {
        return this.films;
    }

    public String getUrl() {
        return this.url;
    }

}
