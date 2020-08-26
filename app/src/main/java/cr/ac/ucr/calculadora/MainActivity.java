package cr.ac.ucr.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    String mostrar;
    int valorA;
    int valorB;
    int resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text);
        textView.setText("prueba");
        valorA = 0;
        valorB = 0;
        resultado = 0;
    }

    private void clear(){
        textView.setText("");
        valorA = 0;
        valorB = 0;
        resultado = 0;
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_uno:
                //textView.setText("prueba1");
                mostrar=textView.getText().toString()+"1";
                textView.setText(mostrar);
                break;
            default:
                break;
        }
    }

}