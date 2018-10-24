package dcc196.ufjf.br.semanacomputacao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Cadastro_Eventos extends AppCompatActivity {

    private EditText titulo;
    private  EditText dia;
    private EditText hora;
    private EditText facilitador;
    private EditText descricao;
    private Button cadastrare;
    private Button cancelare;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventos);

        titulo = (EditText) findViewById(R.id.edtTitulo);
        dia = (EditText) findViewById(R.id.edtDia);
        hora = (EditText) findViewById(R.id.edtHora);
        facilitador = (EditText) findViewById(R.id.edtFacilitador);
        descricao = (EditText) findViewById(R.id.edtDescricao);
        cadastrare = (Button) findViewById(R.id.btnCadastrarEv);
        cancelare = (Button) findViewById(R.id.btnCancelar);

        cancelare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        cadastrare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (titulo.getText().toString().isEmpty()){
                    titulo.requestFocus();
                }else if (dia.getText().toString().isEmpty()){
                    dia.requestFocus();

                }else if (hora.getText().toString().isEmpty()){
                    hora.requestFocus();
                }else  if (facilitador.getText().toString().isEmpty()){
                    facilitador.requestFocus();
                }else if (descricao.getText().toString().isEmpty()){
                    descricao.requestFocus();
                }else {
                    Eventos e = new Eventos(titulo.getText().toString(), dia.getText().toString(),hora.getText().toString(),facilitador.getText().toString(),descricao.getText().toString());
                    MainActivity.evento.addEventos(e);
                    titulo.setText("");
                    dia.setText("");
                    hora.setText("");
                    facilitador.setText("");
                    descricao.setText("");

                    Toast.makeText(Cadastro_Eventos.this, "Evento Cadastrado!", Toast.LENGTH_SHORT).show();

                }
            }
        });





    }
}
