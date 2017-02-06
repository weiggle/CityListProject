package com.weiggle.github.citylistproject.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by weiggle on 2017/2/4.
 */

public class TabsLinearLayout extends LinearLayout {

    private Context mContext;


    public TabsLinearLayout(Context context) {
        this(context,null);
    }

    public TabsLinearLayout(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public TabsLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
