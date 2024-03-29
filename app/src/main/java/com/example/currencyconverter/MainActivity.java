package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view) {

        Log.i("info", "Button Pressed");

        EditText editText = (EditText) findViewById(R.id.editText);

        String amountInEuros = editText.getText().toString();

        Double amountInEurosdouble = Double.parseDouble(amountInEuros);

        Double amountInDollarsDouble = amountInEurosdouble * 1.3;

        String amountInDollarsString = String.format("%.2f", amountInDollarsDouble);

        Toast.makeText(this, "Converted " + amountInEuros + " Euros to $" + amountInDollarsString, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
