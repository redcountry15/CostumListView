package com.example.costumlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<hero> heroList;

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializing objects
        heroList = new ArrayList<>();
        listView = (ListView) findViewById(R.id.listView);

        heroList.add(new hero(R.drawable.spiderman, "Spiderman",
                "Avengers"));
        heroList.add(new hero(R.drawable.joker, "joker",
                "injustice"));
        heroList.add(new hero(R.drawable.ironman, "Iron Man",
                "Avengers"));
        heroList.add(new hero(R.drawable.doctorstrange, "Doctor Strange",
                "Avengers"));
        heroList.add(new hero(R.drawable.captainamerica, "Captain America",
                "Avengers"));
        heroList.add(new hero(R.drawable.batman, "Batman",
                "Justice League"));

        //creating the adapter
        myListAdapter adapter = new myListAdapter(this,R.layout.my_costum_lists, heroList);
        listView.setAdapter(adapter);


    }
}
