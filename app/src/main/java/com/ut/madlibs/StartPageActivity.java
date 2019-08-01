package com.ut.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StartPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        ArrayAdapter<Story> listAdapter = new ArrayAdapter<> (
                this, android.R.layout.simple_list_item_1, Story.stories);
        ListView listDrinks = (ListView) findViewById(R.id.list_stories);
        listDrinks.setAdapter(listAdapter);

        //Create the listener
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        //Pass the drink the user clicks on to DrinkActivity
                        Story story = Story.stories[position];
                        String storyName = story.getName();
                        String storyDesc = story.getDescription();

                        Intent intent = new Intent (StartPageActivity.this,InputActivity.class);
                        intent.putExtra("storyName", storyName);
                        intent.putExtra("storyDesc", storyDesc);
                        startActivity(intent);


                    }
                };

        //Assigns the listener to the list view
        listDrinks.setOnItemClickListener(itemClickListener);
    }
}
