package in.forest.mylaws;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private Button goButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        goButton = findViewById(R.id.go_button);
        goButton.setEnabled(false); // Initially disable the button

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.spinner_items,
                android.R.layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Enable the button only when BNS, BNSS, or BSA is selected
                String selectedItem = spinner.getSelectedItem().toString();
                goButton.setEnabled(selectedItem.equals("BNS") || selectedItem.equals("BNSS") || selectedItem.equals("BSA") || selectedItem.equals("My Assistant"));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        });

        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selectedItem = spinner.getSelectedItem().toString();
                switch (selectedItem) {
                    case "BNS":
                        startActivity(new Intent(MainActivity.this, BNSActivity.class));
                        break;
                    case "BNSS":
                        startActivity(new Intent(MainActivity.this, BNSSActivity.class));
                        break;
                    case "BSA":
                        startActivity(new Intent(MainActivity.this, BSAActivity.class));
                        break;
                    case "My Assistant":
                        startActivity(new Intent(MainActivity.this, MyAssistant.class));

                        //My App
                        break;
                }
            }
        });
    }
}

