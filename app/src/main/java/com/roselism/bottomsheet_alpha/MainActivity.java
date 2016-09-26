package com.roselism.bottomsheet_alpha;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
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

                sheet.sheet(R.menu.main_menu)
                        .listener(new MenuItem.OnMenuItemClickListener() {
                            @Override
                            public boolean onMenuItemClick(MenuItem item) {
                                switch (item.getItemId()) {
                                    case R.id.add_email_account:
                                        return true;

                                    case R.id.add_storage_account:
                                        return true;
                                }

                                return true;
                            }
                        });
                sheet.sheet(111, "adfadfs");
                sheet.sheet(1121, "adfadfs");
                sheet.sheet(1131, "adfadfs");

                sheet.build().show();
            }
        });
    }
}
