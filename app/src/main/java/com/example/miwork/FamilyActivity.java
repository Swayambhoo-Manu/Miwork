package com.example.miwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {


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
        ArrayList<Word> words=new ArrayList<Word>();
//        words.add(new Word("zero","lutti"));
        words.add(new Word("one","lutti"));
        words.add(new Word("two","otiiko"));
        words.add(new Word("three","tolookosu"));
        words.add(new Word("four","oyyisa"));
        words.add(new Word("five","massokka"));
        words.add(new Word("six","temmokka"));
        words.add(new Word("seven","kenekaku"));
        words.add(new Word("eight","kawinta"));
        words.add(new Word("nine","wo’e"));
        words.add(new Word("ten","na’aacha"));

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
