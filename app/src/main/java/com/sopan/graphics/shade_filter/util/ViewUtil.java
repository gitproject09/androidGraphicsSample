package com.sopan.graphics.shade_filter.util;

import android.view.View;

public abstract class ViewUtil {
  public static void setSoftwareLayerType(View view) {
    view.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
  }
}
