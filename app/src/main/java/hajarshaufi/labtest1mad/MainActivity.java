package hajarshaufi.labtest1mad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int quantityDonuts, quantityBomboloni;
    double totalBomboloni, totalDonuts, totalItem, totalToPay;
    EditText edtDonuts, edtBomboloni;
    Button btnCalculate;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtBomboloni = findViewById(R.id.edtBomboloni);
        edtDonuts = findViewById(R.id.edtDonuts);
        btnCalculate = findViewById(R.id.btnCalculate);
        txtResult  = findViewById(R.id.txtResult);
    }

    public void fnCalculate (View view){

        quantityBomboloni = Integer.parseInt(edtBomboloni.getText().toString());
        quantityDonuts = Integer.parseInt(edtDonuts.getText().toString());

        totalBomboloni = quantityBomboloni*(2.5);
        totalDonuts = quantityDonuts*(3.5);

        totalToPay = totalBomboloni+totalDonuts;
        totalItem = quantityBomboloni+quantityDonuts;

        txtResult.setText("Total Item : RM" +totalItem+ "\nTotal To Pay : RM" +totalToPay);

    }
}