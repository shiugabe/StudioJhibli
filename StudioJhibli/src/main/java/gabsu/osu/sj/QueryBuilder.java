package gabsu.osu.sj;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class QueryBuilder {

    OkHttpClient client = new OkHttpClient();
    final private String website = "https://ghibliapi.herokuapp.com/";
    private JSONArray query;
    private JSONObject singleQuery;

    //=================================================================

    private String run(String url) {
        String responseTxt = null;
        Request request = new Request.Builder().url(url).build();

        try (Response response = this.client.newCall(request).execute()) {
            responseTxt = response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return responseTxt;
    }

    //=================================================================

    public QueryBuilder(String redirect) {
        String response = this.run(this.website + redirect);
        if (response.charAt(0) == '{') {
            this.singleQuery = new org.json.JSONObject(response);
        } else {
            this.query = new org.json.JSONArray(response);
        }
    }

    //=================================================================

    public JSONArray getQuery() {
        return this.query;
    }

    public JSONObject getSingleQuery() {
        return this.singleQuery;
    }

}
