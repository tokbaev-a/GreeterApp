package knigh4ttk.application.greeterapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {
            name = savedInstanceState.getString("name");
            display(name);
        }
    }

    public void submitOrder(View v) {
        EditText nameField = findViewById(R.id.name_field);
        if (nameField.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, "Empty field!", Toast.LENGTH_SHORT).show();
        }else{
        name = nameField.getText().toString();
        display(name);
        }
    }
    private void display(String name) {
        TextView quantityTextView = findViewById(R.id.greeting);
        quantityTextView.setText("Hello, "+ name + "!");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("name", name);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }
}