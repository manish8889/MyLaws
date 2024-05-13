package in.forest.mylaws;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class DocumentsMain extends AppCompatActivity {
    CardView math;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_documents_main);

        math = (CardView) findViewById(R.id.mathematique);
//        setContentView(R.layout.activity_main);
        math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DocumentsMain.this, MathematiqueList.class);
                startActivity(intent);
                //Toast.makeText(MainActivity.this, "Mathématique cliqué", Toast.LENGTH_SHORT).show();
            }
        });
    }
}