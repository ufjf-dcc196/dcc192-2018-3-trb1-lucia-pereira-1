package dcc196.ufjf.br.semanacomputacao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Edicao_participantes extends AppCompatActivity {

    private EditText nome;
    private EditText email;
    private  EditText cpf;
    private ListView listaEventos;
    ArrayList<Eventos> even = new ArrayList<>();
    private Button alterar;
    private Button salvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edicao);
        nome = (EditText)  findViewById(R.id.edtNome);
        email = (EditText)findViewById(R.id.edtEmail);
        cpf = (EditText)findViewById(R.id.edtCpf);
        alterar = (Button) findViewById(R.id.btnAlterar);
        salvar = (Button) findViewById(R.id.btnSalvar);



        alterar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new  Intent(Edicao_participantes.this, Cadastro_Participantes.class);
                intent.putExtra("Nome:",nome.getText().toString());
                intent.putExtra("Email", email.getText().toString());
                intent.putExtra("Cpf:",cpf.getText().toString());
                startActivityForResult(intent,0);

            }
        });
        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("Cpf", cpf.getText().toString());
                intent.putExtra("Email", email.getText().toString());
                setResult(RESULT_OK,intent);
                finish();



            }
        });
       /* listaEventos.setOnItemClickListener(new AdapterView.OnItemLongClickListener() {
                                                @Override
                                                public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                                                }}

        );*/


        listaEventos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ArrayList<Eventos> eventos = new ArrayList<>();
                eventos = MainActivity.evento.getEventos();
                Eventos evento = eventos.get(position);
                Intent intent = new Intent();




            }
        });









    }
}
