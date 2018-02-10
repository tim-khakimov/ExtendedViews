package com.timkhakimov.extendedviews;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Timur Khakimov on 10.02.2018.
 */

public class WithZoomViewPager extends ViewPager {

    public WithZoomViewPager(Context context) {
        super(context);
    }

    public WithZoomViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected boolean canScroll(View v, boolean checkV, int dx, int x, int y) {
        if (v instanceof TouchImageView) {
            return ((TouchImageView) v).canScrollHorizontallyFroyo(-dx);
        } else {
            return super.canScroll(v, checkV, dx, x, y);
        }
    }
}
