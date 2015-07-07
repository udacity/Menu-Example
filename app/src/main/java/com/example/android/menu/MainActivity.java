/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView textViewItem1 = (TextView) findViewById(R.id.menu_item_1);
        String menuItem1 = textViewItem1.getText().toString();
        Log.v("MainActivity", menuItem1);

        // Find second menu item TextView and print the text to the logs
        TextView textViewItem2 = (TextView) findViewById(R.id.menu_item_2);
        String menuItem2 = textViewItem2.getText().toString();
        Log.v("MainActivity", menuItem2);

        // Find third menu item TextView and print the text to the logs
        TextView textViewItem3 = (TextView) findViewById(R.id.menu_item_3);
        String menuItem3 = textViewItem3.getText().toString();
        Log.v("MainActivity", menuItem3);
    }
}
