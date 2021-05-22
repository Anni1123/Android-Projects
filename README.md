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


## Animated-Gif 

### Using Glide Library
Glide Library Dependency:<br>
```
implementation 'com.github.bumptech.glide:glide:4.9.0'
```
<br>
Code : <br>
```
Glide.with(this).load(R.drawable.adroid).into(imageView);
```


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





