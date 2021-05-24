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
* [Graph-View]
* [Gravity-View]
* [Html-Text]
* [ImageViewer]
* [Instructions-Dialog]
* [KenBurns-View]
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

**[⬆ Back to Index](#index)**

## Dynamic-Tab-Layout

<a href="https://github.com/maityamit/Android-Projects/tree/main/DynamicTabLayout">💻Code</a>

Dynamic-Tab-Layout

**[⬆ Back to Index](#index)**

## EmojiRain

<a href="https://github.com/maityamit/Android-Projects/tree/main/EmojiRain">💻Code</a>

EmojiRain

**[⬆ Back to Index](#index)**

## Explosion-Activity

<a href="https://github.com/maityamit/Android-Projects/tree/main/ExplosionActivity">💻Code</a>

Explosion-Activity

**[⬆ Back to Index](#index)**

## Fingerprint-Authentication

<a href="https://github.com/maityamit/Android-Projects/tree/main/FingerprintAuthentication">💻Code</a>

Fingerprint-Authentication

**[⬆ Back to Index](#index)**

## FlexboxLayout

<a href="https://github.com/maityamit/Android-Projects/tree/main/FlexboxLayout">💻Code</a>

FlexboxLayout

**[⬆ Back to Index](#index)**

## Folding-Cell

<a href="https://github.com/maityamit/Android-Projects/tree/main/FoldingCell">💻Code</a>

EmojiRain

**[⬆ Back to Index](#index)**








