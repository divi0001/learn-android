package de.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO: do x
        //this will pop up in TODO, to remind of tasks
        //go to Build -> Make Project might fix warnings
        //if android studio bugs out: Go to File -> invalidate caches/Restart... hi


        //Button btn = findViewById(R.id.button);


    }

    public void onBtnClick(View view) {
        EditText editFName = findViewById(R.id.inputFirstName);
        EditText editLName = findViewById(R.id.inputLastName);
        EditText editEmail = findViewById(R.id.inputEmail);

        String fname = editFName.getText().toString();
        String lname = editLName.getText().toString();
        String email = editEmail.getText().toString();

        TextView txtFName = findViewById(R.id.viewFName);
        TextView txtLName = findViewById(R.id.viewLName);
        TextView txtEmail = findViewById(R.id.viewEmail);

        txtFName.setText("First Name: "+fname);
        txtLName.setText("Last Name: "+lname);
        txtEmail.setText("E-mail: "+email);
    }
}
