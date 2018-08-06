package com.wjiong.testn.test_n;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

/**
 * Created by SA on 2018-08-06.
 */

public class TitleLayoutActivity extends LinearLayout {
    public TitleLayoutActivity(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title,this);
    }
}
