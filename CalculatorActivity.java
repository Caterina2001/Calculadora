package com.example.calculadora_caterina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CalculatorActivity extends AppCompatActivity {

    String ViejoNum="";
    String Ope ="+";
    boolean NuevaOp=true;
    EditText eText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        eText=findViewById(R.id.editText);
    }

    public void EventoNumero(View view) {
        if(NuevaOp)
            eText.setText("");
        NuevaOp=false;
        String numero=eText.getText().toString();
        switch (view.getId()){
            case R.id.btn1:
                numero+="1";
                break;
            case R.id.btn2:
                numero+="2";
                break;
            case R.id.btn3:
                numero+="3";
                break;
            case R.id.btn4:
                numero+="4";
                break;
            case R.id.btn5:
                numero+="5";
                break;
            case R.id.btn6:
                numero+="6";
                break;
            case R.id.btn7:
                numero+="7";
                break;
            case R.id.btn8:
                numero+="8";
                break;
            case R.id.btn9:
                numero+="9";
                break;
            case R.id.btn0:
                numero+="0";
                break;
            case R.id.btnPunto:
                numero+=".";
                break;
        }
        eText.setText(numero);

    }

    public void EventoOperacion(View view) {
        NuevaOp=true;
        ViejoNum=eText.getText().toString();
        switch (view.getId()){
            case R.id.btnSuma:Ope="+"; break;
            case R.id.btnMeno:Ope="–"; break;
            case R.id.btnMult:Ope="x"; break;
            case R.id.btnDiv:Ope="÷"; break;
        }



    }

    public void EventoTotal(View view) {
        String NuevoNum=eText.getText().toString();
        double resultado=0.0;
        switch (Ope){
            case "+":
                resultado=Double.parseDouble(ViejoNum)+Double.parseDouble(NuevoNum);
                break;
            case "–":
                resultado=Double.parseDouble(ViejoNum)-Double.parseDouble(NuevoNum);
                break;
            case "x":
                resultado=Double.parseDouble(ViejoNum)*Double.parseDouble(NuevoNum);
                break;
            case "÷":
                resultado=Double.parseDouble(ViejoNum)/Double.parseDouble(NuevoNum);
                break;
        }
        eText.setText(resultado+"");
    }

    public void EvrntoAC(View view) {
        eText.setText("0");
        NuevaOp=true;
    }

    public void EventoDolar(View view) {
        double resDolar=Double.parseDouble(eText.getText().toString())*57.85;
        eText.setText("RD$"+resDolar+"");
        NuevaOp=true;
    }

    public void EventoEuro(View view) {
        double resEuro=Double.parseDouble(eText.getText().toString())*65.49;
        eText.setText("RD$"+resEuro+"");
        NuevaOp=true;
    }

    public void EventoYen(View view) {
        double resYen=Double.parseDouble(eText.getText().toString())*0.51;
        eText.setText("RD$"+resYen+"");
        NuevaOp=true;
    }

    public void EventoEsterl(View view) {
        double resEsterlina=Double.parseDouble(eText.getText().toString())*78.00;
        eText.setText("RD$"+resEsterlina+"");
        NuevaOp=true;
    }
}