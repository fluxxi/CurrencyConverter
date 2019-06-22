package de.flxi.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void convertCurrency (View view) {

        Log.i("info", "Button wurde gedrückt");

        EditText editText = findViewById(R.id.editText);

        String amountInDollars = editText.getText().toString();

        double amountInDollarsDouble = Double.parseDouble(amountInDollars);

        double amountInEuroDouble = amountInDollarsDouble * 0.88;

        String amountInEuroString = String.format("%.2f", amountInEuroDouble);


        Toast.makeText(this, "$" + amountInDollars + " sind in €" + amountInEuroString, Toast.LENGTH_SHORT).show();



    }
}
