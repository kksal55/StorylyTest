package com.kksal55.hamileliktakibi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.appsamurai.storyly.Story;
import com.appsamurai.storyly.StoryGroup;
import com.appsamurai.storyly.StorylyInit;
import com.appsamurai.storyly.StorylyListener;
import com.appsamurai.storyly.StorylyView;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StorylyView storylyView = findViewById(R.id.storyly_view);
        storylyView.setStorylyInit(new StorylyInit("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhY2NfaWQiOjIwLCJhcHBfaWQiOjg5NywiaW5zX2lkIjo5MDh9.eq8JfhYmKJy-31RusOWWG5GoQhXDODXp5eRaqGa3b6g"));
//        storylyView.setStorylyId("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhY2NfaWQiOjIwLCJhcHBfaWQiOjg5NywiaW5zX2lkIjo5MDh9.eq8JfhYmKJy-31RusOWWG5GoQhXDODXp5eRaqGa3b6g");
        storylyView.setStorylyListener(new StorylyListener() {
            @Override
            public void storylyLoaded(@NonNull StorylyView storylyView,
                                      @NonNull List<StoryGroup> storyGroupList) {
                Log.d("[Storyly]", "storylyLoaded");
            }

            @Override
            public void storylyLoadFailed(@NonNull StorylyView storylyView,
                                          @NonNull String errorMessage) {
                Log.d("[Storyly]", "storylyLoadFailed");
            }

            // return true if app wants to handle redirection, otherwise return false
            @Override
            public boolean storylyActionClicked(@NonNull StorylyView storylyView, @NonNull Story story) {
                Log.d("[Storyly]", "storylyActionClicked");
                return true;
            }

            @Override
            public void storylyStoryShown(@NonNull StorylyView storylyView) {
                Log.d("[Storyly]", "storylyStoryShown");
            }

            @Override
            public void storylyStoryDismissed(@NonNull StorylyView storylyView) {
                Log.d("[Storyly]", "storylyStoryDismissed");
            }
        });
    }
}