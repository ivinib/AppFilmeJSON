package com.example.appfilmejson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainActivity extends AppCompatActivity {

    private TextView txtJSON;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtJSON = findViewById(R.id.txtJSON);
    }

    public void baixarJSON(View view){
        GsonBuilder builder = new GsonBuilder();
        final Gson gson = builder.create();

        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "https://my-json-server.typicode.com/ivinib/JSONFilmeAPP/filme";

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Filme filme = gson.fromJson(response, Filme.class);
                        txtJSON.setText(filme.toString());
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        txtJSON.setText("Falha ao obter o JSON");
                    }
                });
            queue.add(stringRequest);
    }
}
