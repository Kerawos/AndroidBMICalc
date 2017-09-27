package mareksowa.pl.androidbmicalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivityBMI extends AppCompatActivity implements View.OnClickListener {

    private Button btnCalc;
    private EditText ptHeigth;
    private EditText ptWeight;
    private EditText ptResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_bmi);

        btnCalc = (Button) findViewById(R.id.bCalc);
        btnCalc.setOnClickListener(this);
        ptHeigth = (EditText) findViewById(R.id.ptHeigth);
        ptWeight = (EditText) findViewById(R.id.ptWeight);
        ptResult = (EditText) findViewById(R.id.ptResult);
    }

    @Override
    public void onClick(View v) {
        double dWeigth = Double.parseDouble(ptWeight.getText().toString().trim());
        double dHeight = Double.parseDouble(ptHeigth.getText().toString().trim());
        ptResult.setText(String.valueOf((int)Math.round(dWeigth/(dHeight/100)/(dHeight/100))));
    }
}
