package br.com.digitalhouse.digital.exercicio01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //declaração de atributos
    EditText editTextNome;
    EditText editTextEmail;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNome = findViewById(R.id.editTextNome);
        editTextEmail = findViewById(R.id.editTextEmail);
        btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //converte o editavel para string
                String nome = editTextNome.getText().toString();
                String email = editTextEmail.getText().toString();

                if(nome.equals("")){
                    //toast (create a new toast)
                    Toast.makeText(MainActivity.this, "Preencha o campo nome",
                            Toast.LENGTH_SHORT).show();

                    return;
                }

                if(email.equals("")){
                    //toast (create a new toast)
                    Toast.makeText(MainActivity.this, "Preencha o campo email",
                            Toast.LENGTH_SHORT).show();

                    return;
                }

                if(!(nome.equals("")) && !(email.equals(""))){
                    //toast (create a new toast)
                    Toast.makeText(MainActivity.this, "OK",
                            Toast.LENGTH_SHORT).show();

                    return;
                }

            }
        });
    }
}
