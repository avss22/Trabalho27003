
public class EventoPeriodico {
	class EventoPeriodico extends Evento {
	    private DiaSemana diaSemana;

	    public EventoPeriodico(String titulo, String descricao, String dataInicio, String dataFim, String localizacao, DiaSemana diaSemana) {
	        super(titulo, descricao, dataInicio, dataFim, localizacao);
	        this.diaSemana = diaSemana;
	    }
	}

	

}
