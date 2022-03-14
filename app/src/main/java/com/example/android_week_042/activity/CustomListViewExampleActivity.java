package com.example.android_week_042.activity;
//import android.support.v4.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.android_week_042.R;
import com.example.android_week_042.adapter.LanguageAdapter;
import com.example.android_week_042.model.Language;

import java.util.ArrayList;
import java.util.List;

public class CustomListViewExampleActivity extends AppCompatActivity {
    private List<Language> listLanguage;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_list_view_activity);

        listView = (ListView) findViewById(R.id.idListView);
        listLanguage = new ArrayList<>();
        listLanguage.add(new Language(1, "Lập Trình Java", "Sơn 1"));
        listLanguage.add(new Language(2, "Lập Trình Android", "Sơn 2"));
        listLanguage.add(new Language(3, "Lập Trình JavaFX", "Sơn 3"));
        listLanguage.add(new Language(4, "Lập Trình Web", "Sơn 4"));
        listLanguage.add(new Language(5, "Lập Trình Ruby", "Sơn 5"));
        listLanguage.add(new Language(6, "Lập Trình C++", "Sơn 6"));
        listLanguage.add(new Language(7, "Lập Trình PHP", "Sơn 7"));
        listLanguage.add(new Language(8, "Lập Trình WordPress", "Sơn 8"));
        LanguageAdapter adapter = new LanguageAdapter(this, R.layout.item_custom_list_view, listLanguage);
        listView.setAdapter(adapter);



        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.custom_action_bar_layout);
        View view =getSupportActionBar().getCustomView();

        ImageButton imageButton= (ImageButton)view.findViewById(R.id.action_bar_back);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ImageButton imageButton2= (ImageButton)view.findViewById(R.id.action_bar_forward);

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Forward Button is clicked",Toast.LENGTH_LONG).show();
            }
        });
    }


}