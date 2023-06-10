package com.example.downsaveinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // 1 - variavel EditText no Java para capturar do conteúdo inserido pelo usuario (associada ao componente EditText "editTextXML" no layout)
    private EditText mensagemInserida;

    // 2- String contendo a mensagem a ser enviado.
    private String mensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 3- Associando a variavel mensagemInserida do Java com o componente EditText do arquivoXML
        mensagemInserida = findViewById(R.id.editTextXML);
    }

    // 4- criando o método para envio da mensagem para o proximo tela
    public void disparoNovaTela(View v) {

        //4.1 atribuição do valor digitado pelo usuario no campo do EditTexXML para a variavel mensagem

        mensagem = mensagemInserida.getText().toString();

        //4.2 Criação do itent para chamada da segunda tela com envio da mensagem.
        Intent  myIntent = new Intent(this, tela2.class);

        //4.3 Uso do método putExtra para envio da mensagem.
        myIntent.putExtra("mensagemEnviada", mensagem);

        // 4.4 Envio de solicitação
        startActivity(myIntent);
    }
}