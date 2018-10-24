package dcc196.ufjf.br.semanacomputacao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Cadastro_Participantes extends AppCompatActivity {


    private EditText nome;
    private EditText email;
    private  EditText cpf;
    private Button cadastrarp;
    private Button cancelarp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_participantes);

        nome = (EditText)findViewById(R.id.edtNome);
        email = (EditText)findViewById(R.id.edtEmail);
        cpf = (EditText)findViewById(R.id.edtCpf);
        cadastrarp = findViewById(R.id.btnCadastrar);
        cancelarp = (Button) findViewById(R.id.btnCancelar);

        cadastrarp.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              if (nome.getText().toString().isEmpty()){
                                                  nome.requestFocus();
                                              }else if (email.getText().toString().isEmpty()){
                                                  email.requestFocus();

                                              }else if (cpf.getText().toString().isEmpty()){
                                                  cpf.requestFocus();
                                              }else {
                                                  Participantes p = new Participantes(nome.getText().toString(), email.getText().toString(),cpf.getText().toString());
                                                  MainActivity.participante.addParticipante(p);
                                                  nome.setText("");
                                                  email.setText("");
                                                  cpf.setText("");

                                                  Toast.makeText(Cadastro_Participantes.this, "Participante Cadastrado", Toast.LENGTH_SHORT).show();
                                              }
                                          }
                                      }
        );

        cancelarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }
}
