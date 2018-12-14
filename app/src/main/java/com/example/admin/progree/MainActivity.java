package com.example.admin.progree;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.github.silvestrpredko.dotprogressbar.DotProgressBar;
import com.github.silvestrpredko.dotprogressbar.DotProgressBarBuilder;

public class MainActivity extends AppCompatActivity {

    DotProgressBar dot_progress_bar;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.textview);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dot_progress_bar.setVisibility(View.INVISIBLE);
            }
        });
        dot_progress_bar=findViewById(R.id.dot_progress_bar);
      /*  dot_progress_bar.setStartColor();
        dot_progress_bar.setEndColor(endColor);
        dot_progress_bar.setDotAmount(amount);
        dot_progress_bar.setAnimationTime(time);
*/
// or you can use builder

        new DotProgressBarBuilder(this)
                .setDotAmount(5)
                .setStartColor(Color.BLACK)
                .setAnimationDirection(DotProgressBar.LEFT_DIRECTION)
                .build();

    }
}
