package cr.ac.ucr.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    double valorA, valorB, resultado;
    String operacion, mostrar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text);
        valorA = 0;
        valorB = 0;
        resultado = 0;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_uno:
                mostrar = textView.getText().toString() + "1";
                textView.setText(mostrar);
                break;
            case R.id.btn_dos:
                mostrar = textView.getText().toString() + "2";
                textView.setText(mostrar);
                break;
            case R.id.btn_tres:
                mostrar = textView.getText().toString() + "3";
                textView.setText(mostrar);
                break;
            case R.id.btn_cuatro:
                mostrar = textView.getText().toString() + "4";
                textView.setText(mostrar);
                break;
            case R.id.btn_cinco:
                mostrar = textView.getText().toString() + "5";
                textView.setText(mostrar);
                break;
            case R.id.btn_seis:
                mostrar = textView.getText().toString() + "6";
                textView.setText(mostrar);
                break;
            case R.id.btn_siete:
                mostrar = textView.getText().toString() + "7";
                textView.setText(mostrar);
                break;
            case R.id.btn_ocho:
                mostrar = textView.getText().toString() + "8";
                textView.setText(mostrar);
                break;
            case R.id.btn_nueve:
                mostrar = textView.getText().toString() + "9";
                textView.setText(mostrar);
                break;
            case R.id.btn_cero:
                mostrar = textView.getText().toString() + "0";
                textView.setText(mostrar);
                break;
            case R.id.btn_reset:
                reset();
                break;
            case R.id.btn_sumar:
                operacion="suma";
                if(valorA ==0)
                {
                    valorA = Double.parseDouble(textView.getText().toString());
                    textView.setText("");
                }
                else{
                    if (resultado == 0) {
                        valorB = Double.parseDouble(textView.getText().toString());
                        resultado = valorA + valorB;
                    }
                    else {
                        resultado = resultado + Double.parseDouble(textView.getText().toString());
                    }
                    mostrar = "" + resultado;
                    textView.setText(mostrar);
                }
                break;
            case R.id.btn_restar:
                operacion="resta";
                if(valorA == 0){
                    valorA =  Double.parseDouble(textView.getText().toString());
                    textView.setText("");
                }else {
                    if(resultado == 0){
                        valorB =  Double.parseDouble(textView.getText().toString());
                        resultado = valorA - valorB;
                    }else{
                        resultado = resultado -  Double.parseDouble(textView.getText().toString());
                    }
                    mostrar=""+resultado;
                    textView.setText(mostrar);
                }
                break;

            case R.id.btn_dividir:
                operacion="division";
                if(valorA == 0){
                    valorA =Double.parseDouble(textView.getText().toString());
                    textView.setText("");
                }else {
                    if(resultado == 0){
                        valorB = Double.parseDouble(textView.getText().toString());
                        resultado = valorA / valorB;
                    }else{
                        resultado = resultado / Double.parseDouble(textView.getText().toString());
                    }
                    mostrar=""+resultado;
                    textView.setText(mostrar);
                }
                break;
            case R.id.btn_multiplicar:
                operacion="multiplicacion";
                if(valorA == 0){
                    valorA = Double.parseDouble(textView.getText().toString());
                    textView.setText("");
                }else {
                    if(resultado == 0){
                        valorB = Double.parseDouble(textView.getText().toString());
                        resultado = valorA * valorB;
                    }else{
                        resultado = resultado * Double.parseDouble(textView.getText().toString());
                    }
                    mostrar=""+resultado;
                    textView.setText(mostrar);
                }
                break;

            case R.id.btn_igual:
                switch(operacion){
                    case "suma":
                        valorB =  Double.parseDouble(textView.getText().toString());
                        resultado=valorA+valorB;
                        mostrar=""+resultado;
                        textView.setText(mostrar);
                        clear();

                        break;
                    case "resta":
                        valorB =  Double.parseDouble(textView.getText().toString());
                        resultado=valorA-valorB;
                        mostrar=""+resultado;
                        textView.setText(mostrar);
                        clear();
                        break;
                    case "division":
                        valorB =  Double.parseDouble(textView.getText().toString());
                        resultado=valorA/valorB;
                        mostrar=""+resultado;
                        textView.setText(mostrar);
                        clear();
                        break;
                    case "multiplicacion":
                        valorB =  Double.parseDouble(textView.getText().toString());
                        resultado=valorA*valorB;
                        mostrar=""+resultado;
                        textView.setText(mostrar);
                        clear();
                        break;
                }
                break;
            default:
                break;
        }
    }

    public void reset(){
        valorA = 0;
        valorB = 0;
        resultado = 0;
        operacion = "";
        textView.setText("");
    }

    private void clear() {
        valorA=0;
        resultado=0;
        valorB=0;
        operacion = "reset";
    }

}