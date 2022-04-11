package com.sopan.graphics.shade_filter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_about);

    TextView textView = (TextView) findViewById(R.id.text);
    String html = getString(R.string.about_text);
    textView.setText(Html.fromHtml(html));
    textView.setMovementMethod(LinkMovementMethod.getInstance());
  }
}