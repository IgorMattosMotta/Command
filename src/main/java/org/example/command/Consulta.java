package org.example.command;

public class Consulta {

    private String paciente;
    private String medico;
    private String situacao;

    public Consulta(String paciente, String medico) {
        this.paciente = paciente;
        this.medico = medico;
    }

    public String getSituacao() {
        return situacao;
    }

    public void agendarConsulta() {
        this.situacao = "Consulta agendada";
    }

    public void desmarcarConsulta() {
        this.situacao = "Consulta desmarcada";
    }
}
