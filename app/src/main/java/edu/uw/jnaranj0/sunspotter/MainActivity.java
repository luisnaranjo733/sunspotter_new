package edu.uw.jnaranj0.sunspotter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Sunspotter";
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editText);
    }
    public void onBtnClicked(View view) {
        if (view.getId() == R.id.button) {
            Editable zipCode = editText.getText();
            Log.v(TAG, "Button clicked! " +  zipCode);
            LinearLayout parent = (LinearLayout) findViewById(R.id.parentLayout);
            View child = getLayoutInflater().inflate(R.layout.activity_main_middle, parent, true);
        }
    }
}
