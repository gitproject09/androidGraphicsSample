package com.sopan.graphics.shade_filter;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.os.Bundle;
import android.widget.TextView;

public class PatternedTextActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_patterned_text);
    TextView textView = (TextView) findViewById(R.id.text);

    Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.cheetah_tile);
    Shader shader = new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
    textView.getPaint().setShader(shader);
  }
}