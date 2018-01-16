package ca.ankur.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BMIActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
    }

    public void buttonClicked(View v)
    {
        View weightView = findViewById(R.id.weightBox);
        EditText weightEdit = (EditText) weightView;
        String weight = weightEdit.getText().toString();
        String height = ((EditText) findViewById(R.id.heightBox)).getText().toString();

        BMIModel model = new BMIModel(weight, height);
        String answer = "Your weight in pounds is " + model.getWeightInPounds() + " and your BMI is " + model.getBMI();

        ((TextView) findViewById(R.id.answer)).setText(answer);

    }
}