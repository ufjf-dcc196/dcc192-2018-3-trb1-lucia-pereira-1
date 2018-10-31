package dcc196.ufjf.br.semanacomputacao;


import java.util.ArrayList;

public class Eventos {

    private String titulo;
    private String dia;
    private String hora;
    private String facilitador;
    private String descricao;
    private ArrayList<Eventos> eventos = new ArrayList<>();


    public Eventos(String titulo, String dia, String hora, String facilitador, String descricao) {
        this.titulo = titulo;
        this.dia = dia;
        this.hora = hora;
        this.facilitador = facilitador;
        this.descricao = descricao;
    }

    public Eventos() {
        if(this.eventos.isEmpty()) {
            criarLista();
        }
    }

    private void criarLista() {
        eventos.add(new Eventos("palestra","segunda","10","joao",""));
        eventos.add(new Eventos("curso1","terca","11","joao",""));
        eventos.add(new Eventos("palestra 2","quarta","11","joao",""));
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFacilitador() {
        return facilitador;
    }

    public void setFacilitador(String facilitador) {
        this.facilitador = facilitador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void  addEventos(Eventos evento){
        eventos.add(evento);
    }

    public ArrayList<Eventos> getEventos() { return eventos; }

    public Eventos getEventos(String titulo) {
        for(Eventos e: this.getEventos()){
            if(e.getTitulo().equals(titulo)) {
                return e;
            }
        }
        return null;
    }

    @Override
    public String toString() {

        return titulo;
    }


}
