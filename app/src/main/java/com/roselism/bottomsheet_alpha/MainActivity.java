package com.roselism.bottomsheet_alpha;

import com.roselism.bottomsheet.BottomSheet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheet.Builder sheet = new BottomSheet.Builder(MainActivity.this,
                        R.style.BottomSheet_Dialog);

                sheet.sheet("Dropbox", "wz@youchai.me", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });

                sheet.sheet("Google Drive", "hero21c@outlook.com", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });

                sheet.sheet("Add Acccount", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });

                sheet.build().show();
            }
        });
    }

}
