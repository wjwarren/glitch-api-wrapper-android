glitch-api-wrapper-android
==========================

A [Glitch API](http://developer.glitch.com/api/) wrapper for Android.

###Requirements
* [Glitch Android SDK](https://github.com/tinyspeck/glitch-android-sdk)
* [Google GSON](http://code.google.com/p/google-gson/) (A library to convert JSON to Java and Java to JSON.)

###Overview
This project will deserialize Glitch API responses into typed JAVA object. Potentially saving you a lot of headache when dealing with JSON strings.

####What does it do?
* Deserialize Glitch API response into 'GlitchResponse' objects.
* Provide a set of 'GlitchRequest' classes that:
 * Store string literals for the various API requests.
 * Store string literals for the various API request parameters.
 * Expose 'GlitchRequest' creation methods that will simplify creating a particular 'GlitchRequest'.

####What doesn't it do?
* Automatically parse any response into its 'GlitchResponse' counterpart.

####Example
Doing a request:
```java
GlitchRequest request = Players.createFullInfoRequest(glitchApi, playerTsid, viewerTsid);
request.execute(this);
```

In the response handler:
```java
Gson gson = new Gson();
FullInfoResponse info = gson.fromJson(request.response.toString(), FullInfoResponse.class)
```

###TODO
Fork the Glitch Android SDK repo and modify GlitchAsyncTask.doInBackground() to return a String. This way I can use the request.response property without converting it to a String again, like:
```java
FullInfoResponse info = gson.fromJson(request.response, FullInfoResponse.class)
```
It would also  save a little bit on performance as we're not going from String to JSONObject to String again.