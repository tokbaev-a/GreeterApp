package knigh4ttk.application.greeterapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View v) {
        EditText nameField = (EditText)findViewById(R.id.name_field);
        String name = nameField.getText().toString();
        display(name);
    }
    private void display(String name) {
        TextView quantityTextView = (TextView) findViewById(R.id.greeting);
        quantityTextView.setText("Hello, "+ name);
    }
}