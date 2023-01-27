package kyle.greene.n01534463;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class Screen2 extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        setContentView(R.layout.activity_screen2);
        textView = findViewById(R.id.textView);
        String value = getIntent().getStringExtra("key");
        textView.setText(value);
    }
    public void onBackPressed() {
        View parentLayout =
                findViewById(android.R.id.content);
        Snackbar.make(parentLayout, R.string.goback,
                        Snackbar.LENGTH_LONG) .setAction(R.string.yes,
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View view) { finish(); } })

                .show();

    }
}