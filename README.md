



# ViewMore

**ViewMore** library allows you to collapse and expand Textview w.r.t to number of lines passed. It also allows you to decide whether the click listen only the end texts or the entire textview.It is smoothy in recycleview and other adapters . You can enhance the fetures by yourself and always feel free to shoot your concerns.

Please see the sample app for the usage


![image](https://user-images.githubusercontent.com/10271708/144758450-9c54083f-da96-4cb1-b3f0-8c7ccaddcfb8.png)
![image](https://user-images.githubusercontent.com/10271708/144758472-b504b0a8-c8c1-4b21-a84f-ede5510bc729.png)

You can copy or call the **ViewMore** in to your project and use as shown below



**How to**
To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

**gradle**

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	          implementation 'com.github.arshadbinhamza:ViewMore:1.0.9'
	}
**Maven**


	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
Step 2. Add the dependency

	<dependency>
	    <groupId>com.github.arshadbinhamza</groupId>
	    <artifactId>ViewMore</artifactId>
	    <version>Tag</version>
	</dependency>


##
The lib Method contains parms --
public static void load(TextView textView, String text, Typeface typeface,boolean isUnderline,int number_of_lines,boolean expand_click_for_end_text_only)
{ 
<br>
}


<br>

     //        ViewMoreHolder.load(textView_description,text, Typeface of end Text,UnderLine,number_of_lines,click_for_end_text_only);
      //  ViewMoreHolder.load(tv_description,description, Typeface.DEFAULT,true,3,false);

#
TextView tv_description = findViewById(R.id.tv_description);<br>
ViewMoreHolder.load(tv_description,description, null,false,3,true);

#   


