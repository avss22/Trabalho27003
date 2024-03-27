
public class EventoRecorrente {
		class EventoRecorrente extends Evento {
		    private int frequenciaDias;

		    public EventoRecorrente(String titulo, String descricao, String dataInicio, String dataFim, String localizacao, int frequenciaDias) {
		        super(titulo, descricao, dataInicio, dataFim, localizacao);
		        this.frequenciaDias = frequenciaDias;
		    }
		}
}
		