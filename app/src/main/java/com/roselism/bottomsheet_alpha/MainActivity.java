package com.roselism.bottomsheet_alpha;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.roselism.bottomsheet.BottomSheet;

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

                sheet.sheet(30, "adsfasdf");
//                sheet.sheet("sheet1", "adsf", new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//
//                    }
//                });
//
//                sheet.sheet("a", new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//
//                    }
//                });
//
//                sheet.sheet("sheet2", "adsf", new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//
//                    }
//                });


                sheet.build().show();
            }
        });
    }
}
