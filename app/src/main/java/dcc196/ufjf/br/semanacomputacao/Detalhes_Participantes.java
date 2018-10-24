package dcc196.ufjf.br.semanacomputacao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Detalhes_Participantes extends AppCompatActivity {

    private Button edicao;
    private Button inscricao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);

        edicao = (Button) findViewById(R.id.btnEdicao);

        edicao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Detalhes_Participantes.this,Edicao_dados.class);
                startActivity(intent);

            }
        });
    }
}
