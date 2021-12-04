# ViewMore

ViewMore library allows you to collapse and expand Textview w.r.t to number of lines passed. It also allows you to decide whether the click listen only the end texts or the entire textview. You can enhance the fetures by yourself and always feel free to shoot your concerns.

Please see the sample app for the usage

You can copy or call the **ViewMore** in to your project and use as shown below
##
 The lib Method contains parms -- 
public static void load(TextView textView, String text, Typeface typeface,boolean isUnderline,int number_of_lines,boolean expand_click_for_end_text_only)
    { ##



 
     //        ViewMoreHolder.load(textView_description,text, Typeface of end Text,UnderLine,number_of_lines,click_for_end_text_only);
      //  ViewMoreHolder.load(tv_description,description, Typeface.DEFAULT,true,3,false);
 
 #
TextView tv_description = findViewById(R.id.tv_description);
 ViewMoreHolder.load(tv_description,description, null,false,3,true);
       
 #   



