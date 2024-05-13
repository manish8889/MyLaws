package in.forest.mylaws;


import static android.widget.AdapterView.OnItemClickListener;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MyAssistant extends AppCompatActivity {
    ListView listView;
    String cyberList[] = {"BNS",
            "Bharatiya Nyaya Sanhita",
            "Bharatiya Sakshya Adhiniyam",
            "My Documents",
            "My Activities"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_assistant);
        listView = (ListView) findViewById(R.id.cyber);

//        listView = (ListView) findViewById(R.id.cyber);
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, cyberList);
        listView.setAdapter(arrayAdapter);

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            if (cyberList[i].trim().equals("BNS"))
            {
                Toast.makeText(getApplicationContext(), "You have selected " + cyberList[i], Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(MyAssistant.this, MyActivities_MainPage.class);
//                startActivity(intent);
            } else if (cyberList[i].trim().equals("Bharatiya Nyaya Sanhita"))
            {
                Toast.makeText(getApplicationContext(), "You have selected " + cyberList[i], Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(MainActivity.this, NewIPC_Main.class);
//                startActivity(intent);
            } else if (cyberList[i].trim().equals("Bharatiya Sakshya Adhiniyam"))
            {
                Toast.makeText(getApplicationContext(), "You have selected " + cyberList[i], Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(MainActivity.this, EvidenceAct_Main.class);
//                startActivity(intent);
            } else if (cyberList[i].trim().equals("My Documents"))
            {
                Toast.makeText(getApplicationContext(), "You have selected " + cyberList[i], Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MyAssistant.this, DocumentsMain.class);
                startActivity(intent);
            } else if (cyberList[i].trim().equals("My Activities"))
            {
                Toast.makeText(getApplicationContext(), "You have selected " + cyberList[i], Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MyAssistant.this, MyActivities_MainPage.class);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "You have selected " + cyberList[i], Toast.LENGTH_SHORT).show();

            }

        }
    });
}
}