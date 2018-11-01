package dcc196.ufjf.br.semanacomputacao;

import java.util.ArrayList;

public class Participantes {

    private String nome;
    private String email;
    private String cpf;
    private ArrayList<Participantes> participantes = new ArrayList<>();

    public Participantes(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;

    }
    public Participantes() {
        if (participantes.isEmpty()) {
            criarParticipantes();
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

        public String getEmail () {
            return email;
        }

        public void setEmail (String email){
            this.email = email;
        }

        public String getCpf () {
            return cpf;
        }

        public void setCpf (String cpf){
            this.cpf = cpf;
        }


    public ArrayList<Participantes> getParticipantes() {

        return participantes;
    }

        public void addParticipantes (Participantes p){

            participantes.add(p);
        }

        public Participantes getParticipantes(String nome){
            for (Participantes p : this.getParticipantes()) {
                if (p.getNome().equals(nome)) {
                    return p;
                }
            }
            return null;
        }



    public Participantes getParticipantesToIndex (int index){
            for (int i = 0; i < index; i++) {
                if (i == index) {
                    return participantes.get(i);
                }
            }
            return null;
        }
        public void criarParticipantes() {
            participantes.add(new Participantes("Joao", "joao@ufjf.com","1"));
            participantes.add(new Participantes("Maria", "maria@ufjf.com","2"));
        }

    @Override
    public String toString() {

        return nome;
    }


}
