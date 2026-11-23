package org.example.command;

public class DesmarcacaoConsultaTarefa implements Tarefa {

    private Consulta consulta;

    public DesmarcacaoConsultaTarefa(Consulta consulta) {
        this.consulta = consulta;
    }

    public void executar() {
        this.consulta.desmarcarConsulta();
    }

    public void cancelar() {
        this.consulta.agendarConsulta();
    }
}
