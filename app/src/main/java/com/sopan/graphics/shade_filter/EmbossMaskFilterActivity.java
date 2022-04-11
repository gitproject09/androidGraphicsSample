package com.sopan.graphics.shade_filter;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.EmbossMaskFilter;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

import com.sopan.graphics.shade_filter.util.ViewUtil;

public class EmbossMaskFilterActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_emboss_mask_filter);

    TextView emboss = (TextView) findViewById(R.id.emboss);
    applyFilter(emboss, new float[] { 0f, 1f, 0.5f }, 0.8f, 3f, 3f);

    // Deboss parameters from http://wiresareobsolete.com/2012/04/textview-inner-shadows/
    TextView deboss = (TextView) findViewById(R.id.deboss);
    applyFilter(deboss, new float[] { 0f, -1f, 0.5f }, 0.8f, 15f, 1f);
  }

  private void applyFilter(
      TextView textView, float[] direction, float ambient, float specular, float blurRadius) {
    if (Build.VERSION.SDK_INT >= 11) {
      ViewUtil.setSoftwareLayerType(textView);
    }
    EmbossMaskFilter filter = new EmbossMaskFilter(direction, ambient, specular, blurRadius);
    textView.getPaint().setMaskFilter(filter);
  }
}