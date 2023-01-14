package io.flutter.plugins;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import io.flutter.Log;

import io.flutter.embedding.engine.FlutterEngine;

/**
 * Generated file. Do not edit.
 * This file is generated by the Flutter tool based on the
 * plugins that support the Android platform.
 */
@Keep
public final class GeneratedPluginRegistrant {
  private static final String TAG = "GeneratedPluginRegistrant";
  public static void registerWith(@NonNull FlutterEngine flutterEngine) {
    try {
      flutterEngine.getPlugins().add(new com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin flutter_local_notifications, com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.huawei.hms.flutter.push.PushPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin huawei_push, com.huawei.hms.flutter.push.PushPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new net.kikuchy.plain_notification_token.PlainNotificationTokenPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin plain_notification_token, net.kikuchy.plain_notification_token.PlainNotificationTokenPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.tencent.flutter.tim_ui_kit_push_plugin.TimUiKitPushPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin tencent_chat_push_for_china, com.tencent.flutter.tim_ui_kit_push_plugin.TimUiKitPushPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.qq.qcloud.tencent_im_sdk_plugin.tencent_im_sdk_plugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin tencent_im_sdk_plugin, com.qq.qcloud.tencent_im_sdk_plugin.tencent_im_sdk_plugin", e);
    }
  }
}
