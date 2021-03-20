package com.cjj;

import android.content.Context;

import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class MaterialFooterView extends FrameLayout implements MaterialRefreshistener {
    private MaterialRefreshistener listener;

    public MaterialFooterView(Context context) {
        this(context, null);
    }

    public MaterialFooterView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MaterialFooterView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
    }


    protected void init(AttributeSet attrs, int defStyle) {
        if (isInEditMode()) return;
        setClipToPadding(false);
        setWillNotDraw(false);

        setBackgroundColor(Color.RED);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
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


