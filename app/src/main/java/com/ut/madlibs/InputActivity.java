package com.ut.madlibs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;
import android.widget.EditText;

import java.lang.reflect.Array;

import static com.ut.madlibs.Story.stories;

public class InputActivity extends AppCompatActivity {

    String editStory;
    String storyName;
    TextView inputType;
    String currHint;
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        // declare vars
        editStory = getIntent().getExtras().getString("storyDesc");
        storyName = getIntent().getExtras().getString("storyName");
        inputType = findViewById(R.id.blankType);
        currHint = editStory.substring(editStory.indexOf('[')+1,editStory.indexOf(']'));
        inputType.setText(currHint);
        input = findViewById(R.id.blank);

    }

    public void onClick(View v) {
        // replace blank with inputted value in story
        if (currHint.equals("Person 1") || currHint.equals("Person 2")) {
            String replaceString = "["+currHint+"]";
            editStory = editStory.replace(replaceString,input.getText().toString());
        }
        else if (currHint.equals("Person 1 Gender (He/She/They)")) {
            String replaceString = "["+currHint+"]";
            editStory = editStory.replace(replaceString,input.getText().toString());
            if (input.getText().toString().equals("He")) {
                editStory = editStory.replace("[Person 1 Gender (possessive)]","His");
            }
            else if (input.getText().toString().equals("She")) {
                editStory = editStory.replace("[Person 1 Gender (possessive)]","Her");
            }
            else if (input.getText().toString().equals("They")) {
                editStory = editStory.replace("[Person 1 Gender (possessive)]","Their");
            }
        }
        else if (currHint.equals("Person 2 Gender (He/She/They)")) {
            String replaceString = "["+currHint+"]";
            editStory = editStory.replace(replaceString,input.getText().toString());
            if (input.getText().toString().equals("He")) {
                editStory = editStory.replace("[Person 2 Gender (possessive)]","His");
            }
            else if (input.getText().toString().equals("She")) {
                editStory = editStory.replace("[Person 2 Gender (possessive)]","Her");
            }
            else if (input.getText().toString().equals("They")) {
                editStory = editStory.replace("[Person 2 Gender (possessive)]","Their");
            }
        }
        else {
            editStory = editStory.substring(0, editStory.indexOf('[')) + input.getText().toString()
                    + editStory.substring(editStory.indexOf(']') + 1);
        }

        if (editStory.indexOf('[')==-1) {

            // go to story
            Intent intent = new Intent ( InputActivity.this, ViewStoryActivity.class);
            intent.putExtra("story",editStory);
            intent.putExtra("storyName",storyName);
            startActivity(intent);
        }
        else {
            // clear inputs
            input.setText("");
            // find and set next blank
            currHint = editStory.substring(editStory.indexOf('[')+1,editStory.indexOf(']'));
            inputType.setText(currHint);
        }
    }

}
