package com.cjj;

import android.content.Context;

import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class MaterialHeaderView extends FrameLayout implements MaterialRefreshistener {

    private final static String Tag = MaterialHeaderView.class.getSimpleName();
    private static float density;

    public MaterialHeaderView(Context context) {
        this(context, null);
    }

    public MaterialHeaderView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MaterialHeaderView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
    }


    protected void init(AttributeSet attrs, int defStyle) {
        if (isInEditMode()) return;
        setClipToPadding(false);
        setWillNotDraw(false);

        setBackgroundColor(Color.GREEN);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        density = getContext().getResources().getDisplayMetrics().density;
    }

    @Override
    public void onComlete(MaterialRefreshLayout materialRefreshLayout) {
    }

    @Override
    public void onBegin(MaterialRefreshLayout materialRefreshLayout) {
    }

    @Override
    public void onPull(MaterialRefreshLayout materialRefreshLayout, float fraction) {
    }

    @Override
    public void onRelease(MaterialRefreshLayout materialRefreshLayout, float fraction) {

    }

    @Override
    public void onRefreshing(MaterialRefreshLayout materialRefreshLayout) {
    }

}
