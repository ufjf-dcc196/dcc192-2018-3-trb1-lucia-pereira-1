package dcc196.ufjf.br.semanacomputacao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listPartcipantes;
    private ListView listEventos;
    private Button btnEventos;
    private Button btnParticipante;
    public static Participantes participante = new Participantes();
    public static Eventos evento = new Eventos();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnParticipante = (Button) findViewById(R.id.btnParticipantes);
        btnEventos = (Button) findViewById(R.id.btnEventos);

        btnParticipante.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    Intent intent = new Intent(MainActivity.this,Cadastro_Participantes.class);
                                                    startActivity(intent);
                                                }
                                            }

        );

        btnEventos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Cadastro_Eventos.class);
                startActivity(intent);

            }
        });
        listPartcipantes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                ArrayList<Participantes> part;

                part = participante.getParticipantes();
                Participantes p = part.get(position);



                Intent i = new Intent(MainActivity.this, Cadastro_Participantes.class);
                i.putExtra("participante", p.getNome());
                startActivity(i);
            }

        });
        listEventos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

    }
    private void obterParticipantes(){
        ArrayAdapter<Participantes> adapter = new ArrayAdapter<Participantes>(this,android.R.layout.simple_list_item_1,participante.getParticipantes());
        listPartcipantes.setAdapter(adapter);

    }
}
