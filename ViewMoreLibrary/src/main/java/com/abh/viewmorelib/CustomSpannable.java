package com.abh.viewmorelib;

import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

public class CustomSpannable extends ClickableSpan {

    private boolean isUnderline = false;
    Typeface tfBold;

    /**
     * Constructor
     */
    public CustomSpannable(boolean isUnderline, Typeface tfBold) {
        this.isUnderline = isUnderline;
        this.tfBold = tfBold;
    }

    @Override
    public void updateDrawState(TextPaint ds) {
        ds.setUnderlineText(isUnderline);
        if(tfBold!=null)
            ds.setTypeface(tfBold);

        ds.setColor(Color.parseColor("#343434"));

    }

    @Override
    public void onClick(View widget) {

    }
}