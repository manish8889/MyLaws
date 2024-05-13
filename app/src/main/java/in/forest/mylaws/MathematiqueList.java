package in.forest.mylaws;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;


public class MathematiqueList extends AppCompatActivity {

    Toolbar toolbar;
    CardView epr1, epr2, epr3, epr4;
    String[] epreuves = {"Mathématique", "MATHS_ZINSALO", "Programme de Math_Collège", "Fonction Hyperpolique"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathematique_list);
        epr1 = (CardView) findViewById(R.id.epreuve1);
        epr2 = (CardView) findViewById(R.id.epreuve2);
        epr3 = (CardView) findViewById(R.id.epreuve3);
        epr4 = (CardView) findViewById(R.id.epreuve4);

        toolbar = findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        epr1 = findViewById(R.id.epreuve1);
        epr2 = findViewById(R.id.epreuve2);
        epr3 = findViewById(R.id.epreuve3);
        epr4 = findViewById(R.id.epreuve4);
        epr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent start = new Intent(getApplicationContext(), PDFOpener.class);
                start.putExtra("pdf", epreuves[0]);
                startActivity(start);
            }
        });
        epr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent start = new Intent(getApplicationContext(), PDFOpener.class);
                start.putExtra("pdf", epreuves[1]);
                startActivity(start);
            }
        });
        epr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent start = new Intent(getApplicationContext(), PDFOpener.class);
                start.putExtra("pdf", epreuves[2]);
                startActivity(start);
            }
        });
        epr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent start = new Intent(getApplicationContext(), PDFOpener.class);
                start.putExtra("pdf", epreuves[3]);
                startActivity(start);
            }
        });
    }
}

