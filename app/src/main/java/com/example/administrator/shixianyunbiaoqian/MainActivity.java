package com.example.administrator.shixianyunbiaoqian;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ViewGroup.MarginLayoutParams lp;
    private boolean panduan=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TagsLayout imageViewGroup = (TagsLayout) findViewById(R.id.image_layout);
        lp = new ViewGroup.MarginLayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        String[] string={"www","qweqweee","qweqwe","sdsdsd","qwrweerwrwrr"};
        for (int i = 0; i < string.length; i++) {
            final TextView textView = new TextView(this);
            textView.setText(string[i]);
            textView.setTextColor(Color.WHITE);
            textView.setTextSize(15);
            textView.setBackgroundResource(R.drawable.fans_s1);
            imageViewGroup.addView(textView, lp);
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
//                    imageViewGroup.removeView(textView);
                    if(panduan){
                        textView.setBackgroundResource(R.drawable.logout_dialog_s);
                        panduan=false;
                    }else{
                        textView.setBackgroundResource(R.drawable.fans_s1);
                        panduan=true;
                    }

                }
            });
        }
    }
}
