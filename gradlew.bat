<?xml version="1.0" encoding="utf-8"?>
<!--
  ~ Copyright (C) 2017 The Android Open Source Project
  ~
  ~ Licensed under the Apache License, Version 2.0 (the "License");
  ~ you may not use this file except in compliance with the License.
  ~ You may obtain a copy of the License at
  ~
  ~      http://www.apache.org/licenses/LICENSE-2.0
  ~
  ~ Unless required by applicable law or agreed to in writing, software
  ~ distributed under the License is distributed on an "AS IS" BASIS,
  ~ WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  ~ See the License for the specific language governing permissions and
  ~ limitations under the License.
  -->

<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/status_bar_latest_event_content"
    android:layout_width="match_parent"
    android:layout_height="64dp"
    android:orientation="horizontal"
    >
    <include layout="@layout/notification_template_icon_group"
        android:layout_width="@dimen/notification_large_icon_width"
        android:layout_height="@dimen/notification_large_icon_height"
    />
    <LinearLayout
        android:id="@+id/notification_main_column_container"
        android:layout_width="0dp"
        android:layout_weight="1"
        android:layout_height="wrap_content"
        android:paddingTop="@dimen/notification_main_column_padding_top"
        android:minHeight="@dimen/notification_large_icon_height"
        android:orientation="horizontal"
        android:layout_toLeftOf="@id/cancel_action"
        android:layout_toStartOf="@id/cancel_action">
        <FrameLayout
            android:id="@+id/notification_main_column"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:layout_marginLeft="@dimen/notification_content_margin_start"
            android:layout_marginStart="@dimen/notification_content_margin_start"
            android:layout_marginRight="8dp"
            android:layout_marginEnd="8dp"
            android:layout_marginBottom="8dp"/>
        <FrameLayout
            android:id="@+id/right_side"
            android:layout_width="wrap_content"
            android:layout_height