package command;

import org.example.command.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RecepcaoTest {

    Recepcao recepcao;
    Consulta consulta;

    @BeforeEach
    void setUp() {
        recepcao = new Recepcao();
        consulta = new Consulta("Maria", "Dr. Joao");
    }

    @Test
    void deveAgendarConsulta() {
        Tarefa agendamentoConsulta = new AgendamentoConsultaTarefa(consulta);
        recepcao.executarTarefa(agendamentoConsulta);

        assertEquals("Consulta agendada", consulta.getSituacao());
    }

    @Test
    void deveDesmarcarConsulta() {
        Tarefa desmarcacaoConsulta = new DesmarcacaoConsultaTarefa(consulta);
        recepcao.executarTarefa(desmarcacaoConsulta);

        assertEquals("Consulta desmarcada", consulta.getSituacao());
    }

    @Test
    void deveCancelarDesmarcacaoConsulta() {
        Tarefa agendamentoConsulta = new AgendamentoConsultaTarefa(consulta);
        Tarefa desmarcacaoConsulta = new DesmarcacaoConsultaTarefa(consulta);

        recepcao.executarTarefa(agendamentoConsulta);
        recepcao.executarTarefa(desmarcacaoConsulta);

        recepcao.cancelarUltimaTarefa();

        assertEquals("Consulta agendada", consulta.getSituacao());
    }

    @Test
    void deveCancelarAgendamentoConsulta() {
        Tarefa agendamentoConsulta = new AgendamentoConsultaTarefa(consulta);

        recepcao.executarTarefa(agendamentoConsulta);
        recepcao.cancelarUltimaTarefa();

        assertEquals("Consulta desmarcada", consulta.getSituacao());
    }

}
