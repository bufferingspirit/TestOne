Test 1:
1. What set of commands are executed to push a repo on Github?
	cd /project
	git init
	git add <files>
	git commit -m "CommitName"
	git remote add origin <RepoURL>
	git remote -v (optional)
	git push origin master

2. Where the strings.xml in the project structure?
	app/res/values/strings.xml

3. What is the difference between SP and DP?
	Dp is a measurement based on the density of pixels versus the display.
	Sp is like Dp except it is also modified based on font size.

4. How can you support multiple languages in your app? Explain step by step process.
	you can add a file to app/res/values which can act as an encoded preferences file for a specific language. when adding strings to your layouts and views you address each string as an variable <android:text="@string/foo">. Then when a user selects a specific preference that file will be used instead. All you need to do is add foo to the preference file for that language.

5. What is the difference between match_parent and wrap_content?
	match_parent will fill to the size of the parent view. Wrap content will fill whatever space it is in regardless.

6. How can you setup a method for a button click without binding the view?
	you can set up an onClickListener for that specific button using the view.

7. How can you define a button click method with binding the button view?
	you go to the buttons listing in it's xml file and add <android:onClick="functionName">

8. How can you change the color of the TextView?
	you add a value for the color you would like to the colors.xml file <color name
="red">#COLOR_HEX_VALUE</color> and then add <android:textcolor="red"> to the textview's listing in the xml

9. Where are all the colors in the android architecture saved?
	app/res/values/colors.xml

*****10. How would you add a different layout for a landscape and a language? Name the qualifiers.

11. How would you make the keyboard hide for EditText when the activity is created?
	you go to the onCreate method and add the line editText.setInputType(InputType.TYPE_NULL);

12. What are ViewGroups and Views?
	the ViewGroups is usually called a parent and contains the other views that exist in the app called it's children. The View group is a special type of View. A View is a container for some type of interface or data.

13. What attribute is necessary in a linear layout if there are more than one child views?
	<android:orientation="YOUR_ORIENTATION">

14. In which case you would use a Linear layout and a Relative layout?
	Linear layouts are simpler and will automatically order the elements you put in them. A relative layout's elements will order themselves based on the positions of eachother. This is useful for creating dynamic interfaces.

15. How would you load an image in a ImageView from xml and programmatically?
	(from the xml)
	1. add an image resource to res/drawable
	2. add the line <android:src="@drawable/imagename"> to the xml entry
	(from the program)
	1.open image file with <File imgFile = new  File("$PATH");>
    	2.decode file into a BitMap <Bitmap myBitmap = BitmapFactory.decodeFile(imgFile.getAbsolutePath());>
	3.initialize imageView <ImageView myImage = (ImageView) findViewById(R.id.MY_IMAGEVIEW_ID);>
	4.set the image view with the bitmap <myImage.setImageBitmap(myBitmap);>

16. List all the states in an activity lifecycle.
	on create
	on start
	on resume
	on stop
	on pause
	on destroy
	on restart

17. What is the lifecycle of activity one and activity two when we go to activity one from two?
	It would depend on the visibility of the activities
	If activity one is still in the background then it would enter the onPause state
	If activity one then moves out of the background and is no longer visible it would enter the onStop state
	Activity two would go through onCreate, onStart, onResume if had not been started prior

18. How to restrict an activity from changing the orientation?
	add <anrdoid:screenOrientation="portrait"> to app/manifests/AndroidManifest.xml

19. Which method is called to persist the data before the activity is destroyed?
	onSaveInstanceState

20. What is the argument of that method?
	Bundle <state>

21. How do we save the data in the method?
	<state.putParcelable("data", data);>

22. How to get that data back? What is the name of the method?
	onRestoreInstanceState

23. What is a bundle? What can a bundle contain?
	A bundle is a map that contains a set of keys mapped to parcelable values

24. What is the difference between onPause and onStop?
	onPause method is called first. Once the task exits the background and is no longer visible the onStop method is called.

25. How to start an activity for getting a result back?
	you can use the onCreate method for this or us onActivityCreated and use the savedInstanceState

26. Which callback is used get the result back in the above case?
	<savedInstanceState.getParcelable("KEY");>

27. What are difference types of Intent? What are the difference between them? When do we use each of them?
	Intents are for:
		activities - interfaces and views
		broadcast recivers - used to signal when there is a change in the hardware
		services - used to run tasks in the background
		content providers - used for interapp communication

28. How to communicate data between activities?
	You can use a shared preferences file.
	SharedPreferences sharedPreferences = getSharedPreferences(MY_PREF_FILE, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("value1", editText1.getText().toString());
        editor.commit();

	and then retrieve it

	SharedPreferences sharedPreferences = getSharedPreferences(MY_PREF_FILE, Context.MODE_PRIVATE);
        tv1.setText(sharedPreferences.getString("value1", "default"));

29. How to add data to an intent?
	intent.putExtra

30. What kind of data can be added to an intent?
	parcelables, serializables , arraylist, strings, char arrays, booleans ...

31. How to get the data sent from activity one in activity two?
	getIntent().getParcelableExtra("KEY");

***32. What is context?


33. Name different kinds of layouts in Android?
	LinearLayout, RelativeLayout, Absolute Layout, Grid Layout, Table Layout

34. How to send an object through an Intent?
	You add it to a parcelable and send it through intent.putExtra()

35. What is Serializable?

36. What is Parcelable?
	A bundle that acts as a set of objects

37. Which is better and why?
38. How can an object class be Serializable or Parcelable? Explain in detail the methods to implement if any?
39. Can we avoid implementing methods using Parcelable?
40. What are launch modes? Explain each one of them in detail.
	singleTop - will remove duplicate activities at the top of the backstack (A,B,C,C)->(A,B,C)
	singleInstance - will remove duplicate activites within the backstack (A,B,C,A) -> (B,C,A)
	singleTask - will remove duplicate activities accross multiple tasks (A,B,C) | (D,E,A) -> (B,C) | (D,E,A)

41. What is back stack?
	A list containg the activites that are paused or stopped

42. How to we create a .apk file?
	you compile it using the gradle scripts. Android has it's own runtime compiler.

43. How to create a signed .apk file
	you sign the apk file by generating a key that gets added to the file, giving it a unique signature.
