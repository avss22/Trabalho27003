
public class Programa {
		public class Programa {
		    public static void main(String[] args) {
		        EventoUnico eventoUnico = new EventoUnico("Anivers�rio", "Festa de anivers�rio", "01/04/2024", "01/04/2024", "Casa");
		        eventoUnico.adicionarParticipante("Jo�o");
		        eventoUnico.adicionarParticipante("Maria");
		        eventoUnico.imprimirParticipantes();

		        EventoRecorrente eventoRecorrente = new EventoRecorrente("Reuni�o", "Reuni�o semanal", "05/04/2024", "05/04/2024", "Escrit�rio", 7);
		        eventoRecorrente.adicionarParticipante("Carlos");
		        eventoRecorrente.imprimirParticipantes();

		        EventoPeriodico eventoPeriodico = new EventoPeriodico("Aula", "Aula de programa��o", "10/04/2024", "10/04/2024", "Universidade", DiaSemana.SEGUNDA);
		        eventoPeriodico.adicionarParticipante("Ana");
		        eventoPeriodico.imprimirParticipantes();
		    }
		}
	}

	}
}
