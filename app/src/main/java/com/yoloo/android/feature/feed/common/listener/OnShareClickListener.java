package com.yoloo.android.feature.feed.common.listener;

import android.view.View;
import com.yoloo.android.data.model.PostRealm;

public interface OnShareClickListener {
  void onShareClick(View v, PostRealm post);
}
