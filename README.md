# Android Projects 📱 built using Java ♨️ 

## About
In this Project you will find various type of Android Studio Projects and Components by Using Java ♨️

# Index

* [Animated-Gif](#animated-gif)
* [Animation](#animation)
* [Auto-Detect-Text](#auto-detect-text)
* [Blink-Text-Animation](#blink-text-animation)
* [Bottom-Nav](#bottom-nav)
* [Brain-Trainer](#brain-trainer)
* [Brightness-Management](#brightness-management)
* [Capture-Screenshot](#capture-screenshot)
* [Circular-Dialog](#circular-dialog)
* [Colorful-Shadow](#colorful-shadow)
* [Contextual-Menu](#contextual-menu)
* [Copy-Paste](#copy-paste)
* [Crop-Imagefrom-Gallery](#crop-imagefrom-gallery)
* [Date-Picker](#date-picker)
* [Download-Manager](#download-manager)
* [DrawableView](#drawableview)
* [Dynamic-Tab-Layout](#dynamic-tab-layout)
* [EmojiRain](#emojirain)
* [Explosion-Activity](#explosion-activity)
* [Fingerprint-Authentication](#fingerprint-authentication)
* [FlexboxLayout](#flexboxlayout)
* [Folding-Cell](#folding-cell)
* [Graph-View](#graph-view)
* [Gravity-View](#gravity-view)
* [Html-Text](#html-text)
* [ImageViewer](#image-viewer)
* [Instructions-Dialog](#instructions-dialog)
* [KenBurns-View](#kenburns-view)
* [Liquid-Button]
* [ListView]
* [Long-Shadow]
* [Navtop]
* [Notes-App]
* [Notification-Count]
* [Paint]
* [Pattern-LockView]
* [Phone-Authentication]
* [Photo-Filter]
* [Pulse-Animation]
* [Scroll-ImageView]
* [Select-Image]
* [Select-Text]
* [Send-Image]
* [SnowfallUi]
* [Spark-Library]
* [Strike-ThroughText]
* [StyleButton]
* [Substring-Clickable]
* [Super-BottomBar]
* [TNImage-Library]
* [Tap-TargetView]
* [Timers-Demo]
* [Typing-Animation]
* [Upload-DataIntoFirebase]
* [Upload-Pdf]
* [Url-TextOnly]
* [Vector-AssetColor]
* [ViewGif]
* [Wave-LoadingView]
* [WhatsNew-Library]
* [Zoom-ScrollView]
* [Zoom-TextView]




<br>
<br>


## Animated-Gif 

<a href="https://github.com/maityamit/Android-Projects/tree/main/AnimatedGif">💻Code</a>

### Using Glide Library
Glide Library Dependency:<br>
```
implementation 'com.github.bumptech.glide:glide:4.9.0'
```
<br>
Code : <br>

`Glide.with(this).load(R.drawable.adroid).into(imageView);`


### Using WebView

```
webView=findViewById(R.id.webvidew);
webView.getSettings().setJavaScriptEnabled(true);
webView.setWebViewClient(new WebViewClient());
webView.loadUrl("Add the link of gif here");
```

### 📸 Screenshots

<img src="https://github.com/maityamit/Android-Projects/blob/main/AnimatedGif/one.jpg"
width="100" height="200"> 

**[⬆ Back to Index](#index)**



## Animation

<a href="https://github.com/maityamit/Android-Projects/tree/main/Animation">💻Code</a>

Animation Show

```
ImageView bart=(ImageView)findViewById(R.id.fades);
//ImageView bart1=(ImageView)findViewById(R.id.fades2);
bart.animate().translationXBy(1000f).translationYBy(1000f).rotationBy(360).setDuration(2000);
//bart1.animate().alpha(1f).setDuration(2000);
```

**[⬆ Back to Index](#index)**


## Auto-Detect-Text

<a href="https://github.com/maityamit/Android-Projects/tree/main/AutoDetectText">💻Code</a>

Auto-Detect-Text

```
email.setText("maityamit378@gmail.com");
mobile.setText("9856596706");
google.setText("www.google.com");
Linkify.addLinks(email, Linkify.ALL);
Linkify.addLinks(mobile, Linkify.ALL);
Linkify.addLinks(google, Linkify.ALL);
```

<br>

<img src="https://github.com/maityamit/Android-Projects/blob/main/AutoDetectText/20210524_100557.gif"
width="100" height="200"> 

**[⬆ Back to Index](#index)**  


## Blink-Text-Animation

<a href="https://github.com/maityamit/Android-Projects/tree/main/BlinkTextAnimation">💻Code</a>

Blink-Text-Animation

```

 ObjectAnimator animator=ObjectAnimator.ofInt(blinkt,"backgroundColor", Color.BLUE,Color.RED,Color.GREEN);
                animator.setDuration(500);
                animator.setEvaluator(new ArgbEvaluator());
                animator.setRepeatCount(Animation.REVERSE);
                animator.setRepeatCount(Animation.INFINITE);
                animator.start();
```

<br>

<img src="https://github.com/maityamit/Android-Projects/blob/main/BlinkTextAnimation/20210524_101039.gif"
width="100" height="200"> 


**[⬆ Back to Index](#index)**


## Bottom-Nav

<a href="https://github.com/maityamit/Android-Projects/tree/main/BottomNav">💻Code</a>

Bottom-Nav

### Dependency

```
implementation 'com.ismaeldivita.chipnavigation:chip-navigation-bar:1.3.4'
```

### XML

```
<com.ismaeldivita.chipnavigation.ChipNavigationBar
        android:id="@+id/bottom_nav_bar"
        android:layout_width="match_parent"
        android:layout_height="60dp"
        android:layout_alignParentBottom="true"
        android:layout_gravity="bottom"
        android:fadingEdge="horizontal"
        android:background="#fff"
        app:cnb_menuResource="@menu/nav_menu" />
```

### Menu

```
 <item
        android:id="@+id/nav_near"
        android:icon="@drawable/ic_home_black_24dp"
        android:title="Home"
        app:cnb_iconColor="#2196F3"
        />

    <item
        android:id="@+id/nav_new_chat"
        android:icon="@drawable/ic_message_black_24dp"
        android:title="Message"
        app:cnb_iconColor="#F44336"/>

    <item
        android:id="@+id/nav_profile"
        android:icon="@drawable/ic_notifications_black_24dp"
        android:title="Notify"
        app:cnb_iconColor="#4CAF50"/>

    <item
        android:id="@+id/nav_settings"
        android:icon="@drawable/ic_person_black_24dp"
        android:title="Profile"
        app:cnb_iconColor="#FF9800"/>
        
```

**[⬆ Back to Index](#index)**



## Brain-Trainer

<a href="https://github.com/maityamit/Android-Projects/tree/main/BrainTrainer">💻Code</a>

Brain Training Application (Calculation Expert)

### 📸 Screenshots


<img src="https://github.com/maityamit/Android-Projects/blob/main/BrainTrainer/one.jpg"
width="100" height="200">   <img src="https://github.com/maityamit/Android-Projects/blob/main/BrainTrainer/two.jpg"
width="100" height="200">    <img src="https://github.com/maityamit/Android-Projects/blob/main/BrainTrainer/three.jpg"
width="100" height="200"> 

**[⬆ Back to Index](#index)**



## Brightness-Management

<a href="https://github.com/maityamit/Android-Projects/tree/main/BrightnessManagement">💻Code</a>

Brightness-Management


```
 int cbrightness= Settings.System.getInt(getContentResolver(),Settings.System.SCREEN_BRIGHTNESS,0);
        textView.setText(cbrightness+"/255");
        seekBar.setProgress(cbrightness);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @RequiresApi(api= Build.VERSION_CODES.M)
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Context context=getApplicationContext();
                boolean write=Settings.System.canWrite(context);
                if(write){
                    int sbright=progress*255/255;
                    textView.setText(sbright+"/255");
                    Settings.System.putInt(context.getContentResolver(),Settings.System.SCREEN_BRIGHTNESS_MODE,
                            Settings.System.SCREEN_BRIGHTNESS_MODE_MANUAL
                    );
                    Settings.System.putInt(context.getContentResolver(),Settings.System.SCREEN_BRIGHTNESS,sbright);
                }else{
                    Intent intent=new Intent(Settings.ACTION_MANAGE_WRITE_SETTINGS);
                    startActivity(intent);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        
```


**[⬆ Back to Index](#index)**


## Capture-Screenshot

<a href="https://github.com/maityamit/Android-Projects/tree/main/CaptureScreenshot">💻Code</a>

Capture-Screenshot


### JAVA

```
  Button click;
    private static final int REQUEST_EXTERNAL_STORAGe=1;
    private static String[] permissionstorage={Manifest.permission.WRITE_EXTERNAL_STORAGE,Manifest.permission.READ_EXTERNAL_STORAGE};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        click = findViewById(R.id.clickme);
        verifystoragepermissions(this);
        //adding beep sound
        final MediaPlayer mediaPlayer=MediaPlayer.create(this, R.raw.beep);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"You just Captured a Screenshot," +
                        " Open Gallery/ File Storage to view your captured Screenshot",Toast.LENGTH_SHORT).show();
                screenshot(getWindow().getDecorView().getRootView(),"result");

                mediaPlayer.start();
            }
        });
    }
    protected static File screenshot(View view,String filename) {
        Date date = new Date();
        //Here we are initialising the format of our image name
        CharSequence format = android.text.format.DateFormat.format("yyyy-MM-dd_hh:mm:ss", date);
        try {
            //Initialising the directory of storage
            String dirpath = Environment.getExternalStorageDirectory()+"";
            File file = new File(dirpath);
            if(!file.exists()){
                boolean mkdir=file.mkdir();
            }
            //File name
            String path=dirpath + "/" +  filename + "-" + format + ".jpeg";
            view.setDrawingCacheEnabled(true);
            Bitmap bitmap=Bitmap.createBitmap(view.getDrawingCache());
            view.setDrawingCacheEnabled(false);
            File imageurl=new File(path);
            FileOutputStream outputStream=new FileOutputStream(imageurl);
            bitmap.compress(Bitmap.CompressFormat.JPEG,50,outputStream);
            outputStream.flush();
            outputStream.close();
            return imageurl;

        }catch (FileNotFoundException io){
            io.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
    //verifying if storage permission is given or not
    public static void verifystoragepermissions(Activity activity){
        int permissions= ActivityCompat.checkSelfPermission(activity,Manifest.permission.WRITE_EXTERNAL_STORAGE);
        //If storage permission is not given then request for External Storage Permission
        if(permissions!= PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(activity,permissionstorage,REQUEST_EXTERNAL_STORAGe);
        }
    }
    
```







**[⬆ Back to Index](#index)**


## Circular-Dialog

<a href="https://github.com/maityamit/Android-Projects/tree/main/CircularDialog">💻Code</a>

Circular-Dialog


### Dependency

```
implementation 'com.github.hassanusman:CircularDialogs:1.2'
```


### JAVA

```
 new CDialog(MainActivity.this).createAlert("Geeks For Geeks",
                        CDConstants.SUCCESS,   // Type of dialog
                        CDConstants.LARGE)    //  size of dialog
                        .setAnimation(CDConstants.SCALE_FROM_BOTTOM_TO_TOP)     //  Animation for enter/exit
                        .setDuration(2000)   // in milliseconds
                        .setTextSize(CDConstants.LARGE_TEXT_SIZE)  // CDConstants.LARGE_TEXT_SIZE, CDConstants.NORMAL_TEXT_SIZE
                        .show();
```

<br>


<img src="https://github.com/maityamit/Android-Projects/blob/main/CircularDialog/Screenshot_20210524-103429_GIT%20DUMMY.jpg"
width="100" height="200"> 



**[⬆ Back to Index](#index)**

## Colorful-Shadow

<a href="https://github.com/maityamit/Android-Projects/tree/main/ColourfulShadow">💻Code</a>

Colorful-Shadow


### Dependency

```
implementation 'com.yinglan.shadowimageview:shadowimageview:1.0.4'
```


### XML

```
<com.yinglan.shadowimageview.ShadowImageView
        android:id="@+id/shadow"
        android:layout_width="300dp"
        android:layout_height="300dp"
        app:shadowRound="20dp"
        app:shadowSrc="@mipmap/ic_launcher_round"
        app:shadowColor="@color/colorAccent"/>
        
```

### JAVA

```
shadow=findViewById(R.id.shadow);
        shadow.setImageResource(R.mipmap.ic_launcher);
```

<img src="https://github.com/maityamit/Android-Projects/blob/main/ColourfulShadow/Screenshot_20210524-103847_GIT%20DUMMY.jpg"
width="100" height="200"> 

<br>


**[⬆ Back to Index](#index)**

## Contextual-Menu

<a href="https://github.com/maityamit/Android-Projects/tree/main/ContextualMenu">💻Code</a>

Contextual-Menu



### Java

```
public class MainActivity extends AppCompatActivity {
    private ActionMode mActionMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.text_view);
        textView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (mActionMode != null) {
                    return false;
                }

                mActionMode = startSupportActionMode(mActionModeCallback);
                return true;
            }
        });
    }

    private ActionMode.Callback mActionModeCallback = new ActionMode.Callback() {
        @Override
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            mode.getMenuInflater().inflate(R.menu.e_menu, menu);
            mode.setTitle("Choose your option");
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            switch (item.getItemId()) {
                case R.id.option_1:
                    Toast.makeText(MainActivity.this, "Option 1 selected", Toast.LENGTH_SHORT).show();
                    mode.finish();
                    return true;
                case R.id.option_2:
                    Toast.makeText(MainActivity.this, "Option 2 selected", Toast.LENGTH_SHORT).show();
                    mode.finish();
                    return true;
                default:
                    return false;
            }
        }

        @Override
        public void onDestroyActionMode(ActionMode mode) {
            mActionMode = null;
        }
    };
    
```


**[⬆ Back to Index](#index)**


## Copy-Paste

<a href="https://github.com/maityamit/Android-Projects/tree/main/CopyText">💻Code</a>

Copy-Paste



### Java

```
ClipboardManager manager=(ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData data=ClipData.newPlainText("Text",story);
                manager.setPrimaryClip(data);
                Toast.makeText(MainActivity.this,"Copied to Clipboard",Toast.LENGTH_LONG).show();
                
```


**[⬆ Back to Index](#index)**

## Crop-Imagefrom-Gallery

<a href="https://github.com/maityamit/Android-Projects/tree/main/CropImagefromGallery">💻Code</a>

Crop-Imagefrom-Gallery

### Dependency
```
 api 'com.theartofdev.edmodo:android-image-cropper:2.8.+'
    implementation 'com.squareup.picasso:picasso:2.5.2'
```

### Mainfest

```
<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE"/>
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
```

### Java

```
@Override
public void onActivityResult(int requestCode, int resultCode, Intent data) {
  if (requestCode == CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE) {
    CropImage.ActivityResult result = CropImage.getActivityResult(data);
    if (resultCode == RESULT_OK) {
      Uri resultUri = result.getUri();
    } else if (resultCode == CropImage.CROP_IMAGE_ACTIVITY_RESULT_ERROR_CODE) {
      Exception error = result.getError();
    }
  }
}
```




<br>

<img src="https://github.com/maityamit/Android-Projects/blob/main/CropImagefromGallery/demo.gif"
width="200" height="180"> 





**[⬆ Back to Index](#index)**




## Date-Picker

<a href="https://github.com/maityamit/Android-Projects/tree/main/DatePicker">💻Code</a>

Date-Picker


### Java

```
 final Calendar calendar=Calendar.getInstance();
        editText=findViewById(R.id.editext);
        final int day=calendar.get(Calendar.DAY_OF_MONTH);
        final int year=calendar.get(Calendar.YEAR);
        final int month=calendar.get(Calendar.MONTH);
        datePicker=new DatePickerDialog(MainActivity.this);
        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datePicker=new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(android.widget.DatePicker view, int year, int month, int dayOfMonth) {
                        editText.setText(dayOfMonth+"/"+(month+1)+"/"+year);
                    }
                },year,month,day);
                datePicker.getDatePicker().setMinDate(calendar.getTimeInMillis());
                datePicker.show();
            }

        });
        datePicker.getDatePicker().setMinDate(calendar.getTimeInMillis());
        
```
<br>


<img src="https://github.com/maityamit/Android-Projects/blob/main/DatePicker/Pasted-into-React-Material-UI-Datepicker-and-Timepicker-Tutorial.png"
width="130" height="200"> 



**[⬆ Back to Index](#index)**

## Download-Manager

<a href="https://github.com/maityamit/Android-Projects/tree/main/DownloadManager">💻Code</a>

Download-Manager

### Java

```
 manager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf");
                DownloadManager.Request request=new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE);
                long reference=manager.enqueue(request);
```

**[⬆ Back to Index](#index)**

## DrawableView

<a href="https://github.com/maityamit/Android-Projects/tree/main/DrawableView">💻Code</a>

DrawableView


### Java

```
 private void initiaselayout() {
        drawableView=findViewById(R.id.paintView);
        increase=findViewById(R.id.increase);
        decrease=findViewById(R.id.decrease);
        color=findViewById(R.id.color);
        undo=findViewById(R.id.undo);
        config=new DrawableViewConfig();
        config.setStrokeColor(getResources().getColor(android.R.color.black));
        config.setShowCanvasBounds(true); // If the view is bigger than canvas, with this the user will see the bounds (Recommended)
        config.setStrokeWidth(20.0f);
        config.setMinZoom(1.0f);
        config.setMaxZoom(3.0f);
        config.setCanvasHeight(1080);
        config.setCanvasWidth(1920);
        drawableView.setConfig(config);
        increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                config.setStrokeWidth(config.getStrokeWidth()+10);
            }
        });
        decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                config.setStrokeWidth(config.getStrokeWidth()-10);
            }
        });
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random=new Random();
                config.setStrokeColor(Color.rgb(255,
                        random.nextInt(256),random.nextInt(256)));
            }
        });
        undo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawableView.undo();
            }
        });
    }
    
```

**[⬆ Back to Index](#index)**

## Dynamic-Tab-Layout

<a href="https://github.com/maityamit/Android-Projects/tree/main/DynamicTabLayout">💻Code</a>

Dynamic-Tab-Layout



### Java 

```
 private void setDynamicFragmentToTabLayout() {
        //here we have given 10 as the tab number
        //you can give any number ehre
        for (int i = 0; i < 10; i++) {
            //set the tab name as "Page: " + i
            mTabLayout.addTab(mTabLayout.newTab().setText("Page: " + i));
        }
        DynamicFragmentAdapter mDynamicFragmentAdapter = new DynamicFragmentAdapter(getSupportFragmentManager(), mTabLayout.getTabCount());
        //set the adapter
        viewPager.setAdapter(mDynamicFragmentAdapter);
        //set the current item as 0 (when app opens for first time)
        viewPager.setCurrentItem(0);
    }
```

<br>

<img src="https://github.com/maityamit/Android-Projects/blob/main/DynamicTabLayout/frg1.png"
width="100" height="200"> 


**[⬆ Back to Index](#index)**

## EmojiRain

<a href="https://github.com/maityamit/Android-Projects/tree/main/EmojiRain">💻Code</a>

EmojiRain


### Dependency

```
 implementation 'com.luolc:emoji-rain:0.1.1'
```

### Java

```
Button start=findViewById(R.id.starta);
EmojiRainLayout mContainer=findViewById(R.id.emojirain);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // add emoji sources
                mContainer.addEmoji(R.drawable.emoji_1_3);
                mContainer.addEmoji(R.drawable.emoji_2_3);
                mContainer.addEmoji(R.drawable.emoji_3_3);
                mContainer.addEmoji(R.drawable.emoji_4_3);
                mContainer.addEmoji(R.drawable.emoji_5_3);

                // set emojis per flow, default 6
                mContainer.setPer(10);

                // set total duration in milliseconds, default 8000
                mContainer.setDuration(7200);

                // set average drop duration in milliseconds, default 2400
                mContainer.setDropDuration(2400);

                // set drop frequency in milliseconds, default 500
                mContainer.setDropFrequency(500);
                mContainer.startDropping();
            }
        });
```


**[⬆ Back to Index](#index)**

## Explosion-Activity

<a href="https://github.com/maityamit/Android-Projects/tree/main/ExplosionActivity">💻Code</a>

Explosion-Activity


### Dependency

```
implementation 'tyrantgit:explosionfield:1.0.1'
```

### Java

```
final ImageView explode=findViewById(R.id.explode);
        final ExplosionField explosionField=ExplosionField.attach2Window(this);
        explode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(explod){
                    //as we click on the image it will explode
                    explosionField.explode(explode);
                    explod=false;
                }
            }
        });
        
```


**[⬆ Back to Index](#index)**

## Fingerprint-Authentication

<a href="https://github.com/maityamit/Android-Projects/tree/main/FingerprintAuthentication">💻Code</a>

Fingerprint-Authentication


### Dependency
```
implementation 'androidx.biometric:biometric:1.0.1'
```

### Java

```
        // creating a variable for our BiometricManager
        //and lets check if our user can use biometric sensor or not
        BiometricManager biometricManager= androidx.biometric.BiometricManager.from(this);
        switch (biometricManager.canAuthenticate()){
            //this means we can use biometric sensor
            case BiometricManager.BIOMETRIC_SUCCESS:
                msgtex.setText("You can use the fingerprint sensor to login");
                msgtex.setTextColor(Color.parseColor("#fafafa"));
                break;
             //this means that the device doesnt have fingerprint sensor
            case BiometricManager.BIOMETRIC_ERROR_NO_HARDWARE:
                msgtex.setText("This device doesnot have a fingerprint sensor");
                loginbutton.setVisibility(View.GONE);
                break;

             //this means that biometric sensor is not available
            case BiometricManager.BIOMETRIC_ERROR_HW_UNAVAILABLE:
                msgtex.setText("The biometric sensor is currently unavailable");
                loginbutton.setVisibility(View.GONE);
                break;
            //this means that the device doesnt contain your fingerprint
            case BiometricManager.BIOMETRIC_ERROR_NONE_ENROLLED:
                msgtex.setText("Your device doesn't have fingerprint saved,please check your security settings");
                loginbutton.setVisibility(View.GONE);
                break;
        }
        // creating a variable for our Executor
        Executor executor= ContextCompat.getMainExecutor(this);
        //this will give us result of AUTHENTICATION
        final BiometricPrompt biometricPrompt=new BiometricPrompt(MainActivity.this, executor, new BiometricPrompt.AuthenticationCallback() {
            @Override
            public void onAuthenticationError(int errorCode, @NonNull CharSequence errString) {
                super.onAuthenticationError(errorCode, errString);
            }
            //THIS METHOD IS CALLED WHEN AYTHENTICATION IS SUCCESS
            @Override
            public void onAuthenticationSucceeded(@NonNull BiometricPrompt.AuthenticationResult result) {
                super.onAuthenticationSucceeded(result);
                Toast.makeText(getApplicationContext(),"Login Success",Toast.LENGTH_SHORT).show();
                loginbutton.setText("Login Successful");
            }

            @Override
            public void onAuthenticationFailed() {
                super.onAuthenticationFailed();
            }
        });
        // creating a variable for our promptInfo
        //BIOMETRIC DIALOG
        final BiometricPrompt.PromptInfo promptInfo=new BiometricPrompt.PromptInfo.Builder().setTitle("GFG")
                .setDescription("Use your fingerprint to login ").setNegativeButtonText("Cancel").build();
                
```


<img src="https://github.com/maityamit/Android-Projects/blob/main/FingerprintAuthentication/biometric-dialog-auth.svg"
width="100" height="200"> 


**[⬆ Back to Index](#index)**

## FlexboxLayout

<a href="https://github.com/maityamit/Android-Projects/tree/main/FlexboxLayout">💻Code</a>

FlexboxLayout


### Dependency
```
implementation 'com.google.android:flexbox:2.0.1'
```

### XML


```
    <com.google.android.flexbox.FlexboxLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:flexWrap="wrap"
         >

        <ImageView
            android:layout_width="200dp"
            android:layout_height="wrap_content"
            android:src="@drawable/fourth"
            android:scaleType="fitCenter"
            app:layout_flexGrow="1"
            />


        <ImageView
            android:layout_width="200dp"
            android:layout_height="wrap_content"
            android:src="@drawable/third"
            android:scaleType="fitCenter"
            app:layout_flexGrow="1"
            />


        <ImageView
            android:layout_width="200dp"
            android:layout_height="wrap_content"
            android:src="@drawable/second"
            android:scaleType="fitCenter"
            app:layout_flexGrow="1"
            />

        <ImageView
            android:layout_width="200dp"
            android:layout_height="wrap_content"
            android:src="@drawable/download"
            android:scaleType="fitCenter"
            app:layout_flexGrow="1"
            />

        <ImageView
            android:layout_width="200dp"
            android:layout_height="wrap_content"
            android:src="@drawable/first"
            android:scaleType="fitCenter"
            app:layout_flexGrow="1"
            />
        <ImageView
            android:layout_width="200dp"
            android:layout_height="wrap_content"
            android:src="@drawable/fourth"
            android:scaleType="fitCenter"
            app:layout_flexGrow="1"
            />


        <ImageView
            android:layout_width="200dp"
            android:layout_height="wrap_content"
            android:src="@drawable/third"
            android:scaleType="fitCenter"
            app:layout_flexGrow="1"
            />


        <ImageView
            android:layout_width="200dp"
            android:layout_height="wrap_content"
            android:src="@drawable/second"
            android:scaleType="fitCenter"
            app:layout_flexGrow="1"
            />

        <ImageView
            android:layout_width="200dp"
            android:layout_height="wrap_content"
            android:src="@drawable/download"
            android:scaleType="fitCenter"
            app:layout_flexGrow="1"
            />

        <ImageView
            android:layout_width="200dp"
            android:layout_height="wrap_content"
            android:src="@drawable/first"
            android:scaleType="fitCenter"
            app:layout_flexGrow="1"
            />

    </com.google.android.flexbox.FlexboxLayout>
    
```

<br>



**[⬆ Back to Index](#index)**

## Folding-Cell

<a href="https://github.com/maityamit/Android-Projects/tree/main/FoldingCell">💻Code</a>

Folding-Cell


### Dependency

```
implementation 'com.ramotion.foldingcell:folding-cell:1.2.3'
```

### Java

```
  final com.ramotion.foldingcell.FoldingCell fc =  findViewById(R.id.folding_cell);
        // attach click listener to folding cell
        fc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fc.toggle(false);
            }
        });
        
```



**[⬆ Back to Index](#index)**


## Graph-View

<a href="https://github.com/maityamit/Android-Projects/tree/main/GraphView">💻Code</a>

Graph-View


### Dependency

```
implementation 'com.jjoe64:graphview:4.2.2'
```

### Java

```
  GraphView graphView=findViewById(R.id.graphview);
        PointsGraphSeries<DataPoint> series=new PointsGraphSeries<>(getDataPoint());

        graphView.addSeries(series);
        series.setShape(PointsGraphSeries.Shape.TRIANGLE);
        series.setSize(50);
        series.setColor(Color.RED);
        series.setCustomShape(new PointsGraphSeries.CustomShape() {
            @Override
            public void draw(Canvas canvas, Paint paint, float x, float y, DataPointInterface dataPoint) {
                paint.setStrokeWidth(5);
                canvas.drawLine(x-20,    y,        x,y-20,paint);
                canvas.drawLine(       x,y-20,x+20,    y,paint);
                canvas.drawLine(x+20,    y,          x,y+20,paint);
                canvas.drawLine(x-20,    y,          x,y+20,paint);
            }
        });
        series.setTitle("Title");

        graphView.getLegendRenderer().setVisible(true);
        graphView.getLegendRenderer().setFixedPosition(4,5);
//        graphView.getLegendRenderer().setAlign(LegendRenderer.LegendAlign.TOP);
        graphView.getLegendRenderer().setTextColor(Color.BLUE);
        graphView.getLegendRenderer().setTextSize(40);


        graphView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,LabelView.class));

            }
        });
        graphView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                startActivity(new Intent(MainActivity.this,ZoomGraph.class));
                return false;

            }
        });
    }

    private DataPoint[] getDataPoint() {
        DataPoint[] dp=new DataPoint[]{
                new DataPoint(0,1),
                new DataPoint(2,1),
                new DataPoint(3,5),
                new DataPoint(6,2),
                new DataPoint(7,8),
        };
        return dp;
```



**[⬆ Back to Index](#index)**



## Gravity-View

<a href="https://github.com/maityamit/Android-Projects/tree/main/GravityView">💻Code</a>

Gravity-View

### Dependency

```
implementation 'implementation 'co.gofynd.library:gravity-view:1.0''
```

### Java

```
   gravityView=GravityView.getInstance(this);
        if(!gravityView.deviceSupported()){
            // show the error / imageView
            Toast.makeText(MainActivity.this,"Not Supported",Toast.LENGTH_LONG).show();
        }
        else
        {
            gravityView.setImage(imageView,R.drawable.gravity).center();
        }
        
```



**[⬆ Back to Index](#index)**



## Html-Text

<a href="https://github.com/maityamit/Android-Projects/tree/main/HtmlText">💻Code</a>

Html-Text


### Dependency

```
implementation 'com.ramotion.foldingcell:folding-cell:1.2.3'
```

### Java

```
    Spanned spanned= HtmlFormatter.formatHtml(new HtmlFormatterBuilder()
                .setHtml("<p><big><bold>GeeksForGeeks</bold></big><p>"));
        gtext.setText(spanned);
        text2.setHtml("<font color='blue'><a href='https://www.google.com'</a>Go to this link</font>");
        text2.setOnClickATagListener(new OnClickATagListener() {
            @Override
            public boolean onClick(View widget, String spannedText, @Nullable String href) {
                Toast.makeText(getApplicationContext(),href,Toast.LENGTH_LONG).show();
                return false;
            }
        });
        text1.setHtml("Load Image From Asset<br><img src='image.png'/>",new HtmlAssetsImageGetter(text1));
        
```



**[⬆ Back to Index](#index)**


## ImageViewer

<a href="https://github.com/maityamit/Android-Projects/tree/main/ImageViewer">💻Code</a>

ImageViewer



### Java

```
   private static final int SELECT_PICTURE = 1;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(
                        Intent.ACTION_PICK,
                        android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);

                startActivityForResult(i, SELECT_PICTURE);
            }
        });
        imageView = (ImageView) findViewById(R.id.imageView);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == SELECT_PICTURE && resultCode == RESULT_OK && null != data) {
            Uri selectedImage = data.getData();
            try {
                Bitmap bmp = getBitmapFromUri(selectedImage);
                imageView.setImageBitmap(bmp);
            } catch (IOException e) {
                e.printStackTrace();
                Snackbar.make(imageView, "Error getting image", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        }
    }

    private Bitmap getBitmapFromUri(Uri uri) throws IOException {
        ParcelFileDescriptor parcelFileDescriptor =
                getContentResolver().openFileDescriptor(uri, "r");
        FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
        Bitmap image = BitmapFactory.decodeFileDescriptor(fileDescriptor);
        parcelFileDescriptor.close();
        return image;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }
        
```



**[⬆ Back to Index](#index)**



## Instructions-Dialog

<a href="https://github.com/maityamit/Android-Projects/tree/main/InstructionsDialog">💻Code</a>

Instructions-Dialog


### Dependency

```
 implementation 'com.github.Q42:AndroidScrollingImageView:1.3.4'
```

### Java

```
   private void displaydialogbox() {
        //initialise dialog
        final Dialog dialog=new Dialog(this);
        //set view
        dialog.setContentView(R.layout.dialogbox);
        //set layout
        dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,WindowManager.LayoutParams.MATCH_PARENT);
        //set background
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(
                Color.TRANSPARENT
        ));
        //show dialog
        dialog.show();
        View view=dialog.findViewById(R.id.view1);
        final View view1=dialog.findViewById(R.id.view2);
        final View view2=dialog.findViewById(R.id.view3);
        final TextView textView=dialog.findViewById(R.id.textview);

        textView.setText("This is button");
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setVisibility(View.INVISIBLE);
                view1.setVisibility(View.VISIBLE);
                //set text
                textView.setText("This is Textview");
            }
        });
        view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view1.setVisibility(View.INVISIBLE);
                view2.setVisibility(View.VISIBLE);
                //set text
                textView.setText("This is ImageView");
            }
        });
        view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
    }
        
```



**[⬆ Back to Index](#index)**




## KenBurns-View

<a href="https://github.com/maityamit/Android-Projects/tree/main/KenBurnsView">💻Code</a>

KenBurns-View


### Dependency

```
 implementation 'com.flaviofaria:kenburnsview:1.0.7'
```

### Java

```
 final KenBurnsView kbv = (KenBurnsView) findViewById(R.id.gravity);
        AccelerateDecelerateInterpolator adi=new AccelerateDecelerateInterpolator();
        RandomTransitionGenerator randomTransitionGenerator=new RandomTransitionGenerator(1000,adi);
        kbv.setTransitionGenerator(randomTransitionGenerator);
        kbv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(moving){
                    kbv.pause();
                    moving=false;
                }else {
                    kbv.resume();
                    moving=true;
                }
            }
        });

        kbv.setTransitionListener(new KenBurnsView.TransitionListener() {
            @Override
            public void onTransitionStart(Transition transition) {
                Toast.makeText(MainActivity.this,"Started",Toast.LENGTH_LONG).show();
            }
            @Override
            public void onTransitionEnd(Transition transition) {
                Toast.makeText(MainActivity.this,"Finish",Toast.LENGTH_LONG).show();
            }
        });

```

<img src="https://github.com/maityamit/Android-Projects/blob/main/KenBurnsView/anim.gif"
width="100" height="200"> 



**[⬆ Back to Index](#index)**



