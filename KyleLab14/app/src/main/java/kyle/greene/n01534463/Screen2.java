package kyle.greene.n01534463;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class Screen2 extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        textView = findViewById(R.id.textView);
        String value = getIntent().getStringExtra("key");
        textView.setText(value);
    }
}