package com.abh.viewmorelib;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

import abh.viewmorelibrary.R;


public class ViewMoreHolder {

    Typeface typeface ;
    boolean isUnderline;
    int number_of_lines=3;
    boolean expand_for_end_only=false;
    public static void load(TextView textView, String text, Typeface typeface,boolean isUnderline,int number_of_lines,boolean expand_click_for_end_text_only)
    {
        new ViewMoreHolder(textView,text,typeface,isUnderline,number_of_lines,expand_click_for_end_text_only);
    }
   /*

    */
    public ViewMoreHolder(TextView textView, String text, Typeface typeface, boolean isUnderline, int number_of_lines,boolean expand_for_end_only) {
        try {
            this.isUnderline=isUnderline;
            this.number_of_lines=number_of_lines;
            this.typeface=typeface!=null?typeface:Typeface.DEFAULT_BOLD;
            this.expand_for_end_only=expand_for_end_only;
            if(text==null)
                text="";
            textView.setText(text);
            if(number_of_lines>=1) {
                String finalText = text;
                textView.post(new Runnable() {
                    @Override
                    public void run() {
                        if(textView.getLineCount()>number_of_lines)
                        {
                            textView.setTag(false);
                            setViewMoreView(textView, finalText);
                        }
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setViewMoreView(TextView tv_description, String description) {


        try {
            Context context =tv_description.getContext();

            String displyText= description;
            String spanableText = "..."+context.getResources().getString(R.string.view_more);

            boolean is_view_less = (boolean) tv_description.getTag();

            if( is_view_less)
            {
                spanableText = "..."+context.getResources().getString(R.string.view_less);
                displyText = description+spanableText;
            }
            else
            {
                int lineEndIndex = tv_description.getLayout().getLineEnd(number_of_lines-1);
                displyText = displyText.subSequence(0, lineEndIndex - spanableText.length() + 1) + " " + spanableText;
            }


            tv_description.setMovementMethod(LinkMovementMethod.getInstance());
            SpannableStringBuilder ssb = new SpannableStringBuilder(displyText);


            if (displyText.contains(spanableText)) {



                ssb.setSpan(new CustomSpannable(isUnderline,typeface) {

                    @Override
                    public void onClick(View widget) {
                        try {
                            if(expand_for_end_only)
                            {
                                /* For iOS machan click*/
                                tv_description.setTag(!is_view_less);
                                setViewMoreView(tv_description, description);
                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }
                }, displyText.indexOf(spanableText), displyText.indexOf(spanableText) + spanableText.length(), 0);

            }

            tv_description.setText(ssb);
            if(!expand_for_end_only)
            {
                tv_description.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        tv_description.setTag(!is_view_less);
                        setViewMoreView(tv_description, description);
                    }
                });
            }


        } catch (Resources.NotFoundException e) {
            e.printStackTrace();
        }
    }
}