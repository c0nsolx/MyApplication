package com.samsung.myapplication;


import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class Profile extends LinearLayout {
    ImageView image;
    TextView text;
    public Profile(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        LayoutInflater inflater = context.getSystemService(LayoutInflater.class);
        View v = inflater.inflate(R.layout.view_profile, this, true );
        image = v.findViewById(R.id.profile_image);
        text = v.findViewById(R.id.profile_text);
    }

    public void setup(int img, String txt){
        image.setImageResource(img);
        text.setText(txt);
    }

}
