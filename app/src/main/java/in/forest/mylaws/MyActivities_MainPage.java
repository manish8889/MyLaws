package in.forest.mylaws;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MyActivities_MainPage extends AppCompatActivity {

    EditText editText_name,editText_email;
    Button button_add,button_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activities_main_page);
        editText_name = findViewById(R.id.edittext_name);
        editText_email = findViewById(R.id.edittext_email);
        button_add = findViewById(R.id.button_add);
        button_view = findViewById(R.id.button_view);


        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringName = editText_name.getText().toString();
                String stringEmail = editText_email.getText().toString();

                if (stringName.length() <=0 || stringEmail.length() <=0){
                    Toast.makeText(MyActivities_MainPage.this, "Enter your details", Toast.LENGTH_SHORT).show();
                }else {
                    DatabaseHelperClass databaseHelperClass = new DatabaseHelperClass(MyActivities_MainPage.this);
                    EmployeeModelClass employeeModelClass = new EmployeeModelClass(stringName,stringEmail);
                    databaseHelperClass.addEmployee(employeeModelClass);
                    Toast.makeText(MyActivities_MainPage.this, "Details added", Toast.LENGTH_SHORT).show();
                    finish();
                    startActivity(getIntent());
                }
            }
        });


        button_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyActivities_MainPage.this,ViewEmployeeActivity.class);
                startActivity(intent);
            }
        });


    }
}
