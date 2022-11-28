package com.example.linearlayoutexample;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonPlus;
    Button buttonMinus;
    Button buttonMulti;
    Button buttonDiv;
    Button buttonCE;
    Button buttonC;
    Button buttonBS;
    Button buttonEqual;
    Button buttonDot;
    Button buttonSign;
    TextView result = findViewById(R.id.result);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonPlus = (Button) findViewById(R.id.buttonPlus);
        buttonMinus = (Button) findViewById(R.id.buttonMinus);
        buttonMulti = (Button) findViewById(R.id.buttonMulti);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);
        buttonCE = (Button) findViewById(R.id.buttonCE);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonBS = (Button) findViewById(R.id.buttonBS);
        buttonSign = (Button) findViewById(R.id.buttonPlusSign);
        buttonDot = (Button) findViewById(R.id.buttonDot);

        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        buttonMulti.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
        buttonEqual.setOnClickListener(this);
        buttonC.setOnClickListener(this);
        buttonCE.setOnClickListener(this);
        buttonBS.setOnClickListener(this);
        buttonSign.setOnClickListener(this);
        buttonDot.setOnClickListener(this);

    }
    public void onClick (View view) {
        String op = result.getText().toString();
        float op1 = 0;
        float op2 =0;
        float rs;
        String oparator = null;
        if (op.equals(null) == true){
            result.setText("0");
        }

        if(view.getId() == button1.getId()){
            result.setText(op + "1");
        }

        if(view.getId() == button2.getId()){
            result.setText(op + "2");
        }

        if(view.getId() == button3.getId()){
            result.setText(op + "3");
        }

        if(view.getId() == button4.getId()){
            result.setText(op + "4");
        }

        if(view.getId() == button5.getId()){
            result.setText(op + "5");
        }

        if(view.getId() == button6.getId()){
            result.setText(op + "6");
        }

        if(view.getId() == button7.getId()){
            result.setText(op + "7");
        }

        if(view.getId() == button8.getId()){
            result.setText(op + "8");
        }

        if(view.getId() == button9.getId()){
            result.setText(op + "9");
        }

        if(view.getId() == button0.getId()){
            result.setText(op + "0");
        }

        if(view.getId() == buttonC.getId()){
            result.setText("0");
        }

        if(view.getId() == buttonBS.getId()){
            op = op.substring(0, op.length() - 1);
            result.setText(op);
        }

        if(view.getId() == buttonCE.getId()){
            result.setText("");
            oparator = null;
            op1 = 0;
            op2 = 0;
        }

        if(view.getId() == buttonPlus.getId()){
            oparator = "+";
            op1 = Float.parseFloat(op);
            result.setText("0");
        }

        if(view.getId() == buttonMulti.getId()){
            oparator = "*";
            op1 = Float.parseFloat(op);
            result.setText("0");
        }

        if(view.getId() == buttonDiv.getId()){
            oparator = "/";
            op1 = Float.parseFloat(op);
            result.setText("0");
        }

        if(view.getId() == buttonMinus.getId()){
            oparator = "-";
            op1 = Float.parseFloat(op);
            result.setText("0");
        }

        if(view.getId() == buttonEqual.getId()){
            op2 = Float.parseFloat(op);
            if(oparator.equals("+") == true) {
                rs = op1 + op2;
                op = Float.toString(rs);
                result.setText(op);
            }
            else if(oparator.equals("-") == true) {
                rs = op1 - op2;
                op = Float.toString(rs);
                result.setText(op);
            }
            if(oparator.equals("*") == true) {
                rs = op1 * op2;
                op = Float.toString(rs);
                result.setText(op);
            }
            if(oparator.equals("+=/") == true) {
                rs = op1 / op2;
                op = Float.toString(rs);
                result.setText(op);
            }
        }

        if(view.getId() == buttonDot.getId()){
            result.setText(op + ".");
        }

        if(view.getId() == buttonSign.getId()){
            op1 = Float.parseFloat(op);
            op1 = op1 * -1;
            op = Float.toString(op1);
            result.setText(op);

        }

    }
}