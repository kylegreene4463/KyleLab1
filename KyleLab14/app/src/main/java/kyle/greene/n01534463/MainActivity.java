package kyle.greene.n01534463;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button submit;

    CoordinatorLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.name_label, Toast.LENGTH_SHORT).show();


                String name = getString(R.string.name_label);
                Intent intent = new Intent(MainActivity.this, Screen2.class);
                intent.putExtra("key", name);
                startActivity(intent);

        }

        });

    }
    public void onBackPressed() {
        View parentLayout =
                findViewById(android.R.id.content);
        Snackbar.make(parentLayout, R.string.thisismain,
                        Snackbar.LENGTH_LONG) .setAction(R.string.close,
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View view) { finish(); } })

                .show();




    }

}
