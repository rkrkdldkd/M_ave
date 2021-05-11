package com.example.mave;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class List_item extends AppCompatActivity {
    FrameLayout container;
    TextView title,content;
    ImageView familyphoto;
    Context mcontext;
    Bitmap bm;
    private static final int REQUEST_CODE = 0;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        container = (FrameLayout)findViewById(R.id.content_layout);

        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.list_item, container, true);

        mcontext = this;

        title = (TextView)findViewById(R.id.txt_title);
        content = (TextView)findViewById(R.id.txt_content);
        familyphoto = (ImageView) findViewById(R.id.familypicture);

        title.setText(""+PreferenceManager.getString(mcontext,"title"));
        content.setText(""+PreferenceManager.getString(mcontext,"content"));
    }
}
