
package com.forckakao;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNForcKakaoLibraryModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNForcKakaoLibraryModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNForcKakaoLibrary";
  }

  @ReactMethod
  public void show(String text) {
    Context context = getReactApplicationContext();
    Toast.makeText(context, text, Toast.LENGTH_LONG).show();
  }
}