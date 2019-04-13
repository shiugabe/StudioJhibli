package gabsu.osu.util;

import org.json.JSONArray;
import org.json.JSONObject;

import gabsu.osu.sj.QueryBuilder;

public class FindFilmID {

    public String FindID(String filmTitle) {
        String id = null;
        QueryBuilder query = new QueryBuilder("films");
        JSONArray filmsArray = query.getQuery();
        for (int i = 0; i < filmsArray.length(); i++) {
            JSONObject film = filmsArray.getJSONObject(i);
            if (film.has("title") && film.has("id")) {
                if (film.getString("title").equals(filmTitle)) {
                    id = film.getString("id");
                }
            }
        }
        return id;
    }

}
