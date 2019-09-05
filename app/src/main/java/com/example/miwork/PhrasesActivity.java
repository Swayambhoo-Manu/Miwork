package com.example.miwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {


    /*
    %%%%%%%%Please refer  https://guides.codepath.com/android/Using-an-ArrayAdapter-with-ListView#using-a-custom-arrayadapter  %%%%%%%%%
    we used Row View Recycling to efficiently use our memory
    Using an ArrayAdapter with ListView
    When your ListView is connected to an adapter, the adapter will instantiate rows until
    the ListView has been fully populated with enough items to fill the full height of the screen.
    At that point, no additional row items are created in memory.
    Instead, as the user scroll through the list, items that leave the screen are kept in memory
    for later use and then every new row that enters the screen reuses an older row kept around in memory.
    In this way, even for a list of 1000 items, only ~7 item view rows are ever instantiated or held in memory.

    ***Using an ArrayAdapter with ListView***
        To use a basic ArrayAdapter, you just need to initialize the adapter and attach the adapter to the ListView.

        1)ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1<<<ye pahle se provided h >>>, items);
        2)ListView listView = (ListView) findViewById(R.id.lvItems);
        3)listView.setAdapter(itemsAdapter);


        @@@@@When we want to display a series of items into a list using a custom representation of the items,
        we need to use our own custom XML layout for each item.
        To do this, we need to create our own custom ArrayAdapter class.
        1)First, we often need to define a model to represent the data within each list item.=Word

        We can create a custom ListView of Word objects by subclassing ArrayAdapter to describe how to translate the object into a view within that class and then using it like any other adapter.
            line 18 WordAdapter.java
        2)we need to create an XML layout that represents the view template for each item=list_view.xml
        3)we need to define the adapter to describe the process of converting the Java object to a View (in the getView method)


     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);//same xml file is being usd for all the activities

//      Create an arraylist of words
        ArrayList<Word> words=new ArrayList<>();
//        words.add(new Word("zero","lutti"));
        words.add(new Word("Where are you going?", "minto wuksus"));
        words.add(new Word("What is your name?", "tinnә oyaase'nә"));
        words.add(new Word("My name is...", "oyaaset..."));
        words.add(new Word("How are you feeling?", "michәksәs?"));
        words.add(new Word("I’m feeling good.", "kuchi achit"));
        words.add(new Word("Are you coming?", "әәnәs'aa?"));
        words.add(new Word("Yes, I’m coming.", "hәә’ әәnәm"));
        words.add(new Word("I’m coming.", "әәnәm"));
        words.add(new Word("Let’s go.", "yoowutis"));
        words.add(new Word("Come here.", "әnni'nem"));

//        faltu
//        LinearLayout rootView=(LinearLayout)findViewById(R.id.rootView);
//        int i=0;
//        while(i<words.size()) {
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(i));
//            rootView.addView(wordView);
//            i++;
//        }


//      1)  initialize the adapter
        WordAdapter wordAdapter=new WordAdapter(this,words);
//      2)  attach the adapter to the ListView
        ListView listView=(ListView)findViewById(R.id.word_listView);
        listView.setAdapter(wordAdapter);
    }
}
