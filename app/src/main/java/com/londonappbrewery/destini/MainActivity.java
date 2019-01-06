package com.londonappbrewery.destini;

import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

    // TODO: Steps 4 & 8 - Declare member variables here:
    private Button mButtonTop ;
    private Button mButtonBottom ;
    private TextView mTextView;
    private int mStoryIndex = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtonTop = (Button)findViewById(R.id.buttonTop);
        mButtonBottom = (Button)findViewById(R.id.buttonBottom);
        mTextView = (TextView)findViewById(R.id.storyTextView);
        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(mStoryIndex == 1 || mStoryIndex == 2) {
                   mTextView.setText(R.string.T3_Story);
                   mButtonTop.setText(R.string.T3_Ans1);
                   mButtonBottom.setText(R.string.T3_Ans2);
                   mStoryIndex = 3;
               }
              else if(mStoryIndex == 3){
                   mTextView.setText(R.string.T6_End);
                   mButtonTop.setVisibility(View.GONE);
                   mButtonBottom.setVisibility(View.GONE);
               }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex == 1) {
                    mTextView.setText(R.string.T2_Story);
                    mButtonTop.setText(R.string.T2_Ans1);
                    mButtonBottom.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                }
               else if(mStoryIndex == 3){
                    mTextView.setText(R.string.T5_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                }
               else{
                    mTextView.setText(R.string.T4_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                }
            }
        });

    }
}
