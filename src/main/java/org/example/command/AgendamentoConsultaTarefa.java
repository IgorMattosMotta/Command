package org.example.command;

public class AgendamentoConsultaTarefa implements Tarefa {

    private Consulta consulta;

    public AgendamentoConsultaTarefa(Consulta consulta) {
        this.consulta = consulta;
    }

    public void executar() {
        this.consulta.agendarConsulta();
    }

    public void cancelar() {
        this.consulta.desmarcarConsulta();
    }
}
