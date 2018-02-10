package com.timkhakimov.extendedviews;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/**
 * Created by Timur Khakimov on 10.02.2018.
 */

public class SquareLayout extends FrameLayout {

    public SquareLayout(Context context) {
        super(context);
    }

    public SquareLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        final int height = getMeasuredHeight();
        final int width = getMeasuredWidth();
        int size = Math.min(width, height);
        setMeasuredDimension(size, size);
        if(getChildCount()>0) {
            getChildAt(0).setLayoutParams(new FrameLayout.LayoutParams(size, size));
        }
    }
}
