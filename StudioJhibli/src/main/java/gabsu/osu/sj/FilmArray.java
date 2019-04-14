package gabsu.osu.sj;

import org.json.JSONArray;

public class FilmArray {

    //private members =========================

    Film[] filmArray;

    //constructor =================================

    FilmArray() {
        QueryBuilder query = new QueryBuilder("films");
        JSONArray films = query.getQuery();
        this.filmArray = new Film[films.length()];
        for (int i = 0; i < films.length(); i++) {
            this.filmArray[i] = new Film(
                    films.getJSONObject(i).getString("title"));
        }
    }

    //public methods ======================

    public Film[] getFilmArray() {
        return this.filmArray;
    }

}
