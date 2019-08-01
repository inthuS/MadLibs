package com.ut.madlibs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ViewStoryActivity extends AppCompatActivity {

    TextView storyText;
    TextView storyName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_story);

        storyText = findViewById(R.id.Story);
        storyText.setText(getIntent().getExtras().getString("story"));
        storyName = findViewById(R.id.storyTitle);
        storyName.setText(getIntent().getExtras().getString("storyName"));
    }
}
