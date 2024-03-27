
public class Programa {
		public class Programa {
		    public static void main(String[] args) {
		        EventoUnico eventoUnico = new EventoUnico("Aniversário", "Festa de aniversário", "01/04/2024", "01/04/2024", "Casa");
		        eventoUnico.adicionarParticipante("João");
		        eventoUnico.adicionarParticipante("Maria");
		        eventoUnico.imprimirParticipantes();

		        EventoRecorrente eventoRecorrente = new EventoRecorrente("Reunião", "Reunião semanal", "05/04/2024", "05/04/2024", "Escritório", 7);
		        eventoRecorrente.adicionarParticipante("Carlos");
		        eventoRecorrente.imprimirParticipantes();

		        EventoPeriodico eventoPeriodico = new EventoPeriodico("Aula", "Aula de programação", "10/04/2024", "10/04/2024", "Universidade", DiaSemana.SEGUNDA);
		        eventoPeriodico.adicionarParticipante("Ana");
		        eventoPeriodico.imprimirParticipantes();
		    }
		}
	}

	}
}
