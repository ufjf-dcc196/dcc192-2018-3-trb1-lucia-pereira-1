package dcc196.ufjf.br.semanacomputacao;

import java.util.ArrayList;

public class Participantes {
    private String nome;
    private String email;
    private  String cpf;
    private ArrayList<Participantes> participantes = new ArrayList<>();

    public Participantes(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;

    }

    public Participantes(String nome) {
        this.nome = nome;
    }

    public Participantes() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void addParticipante(Participantes participante) {

        participantes.add(participante);
    }
}
