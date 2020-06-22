
public class QuestaoSimples {
	protected String enunciado, resposta;

	public QuestaoSimples(String enunciado, String resposta) {
		super();
		this.enunciado = enunciado;
		this.resposta = resposta;
	}

	@Override
	public String toString() {
		return "QuestaoSimples [enunciado=" + enunciado + ", resposta=" + resposta + "]";
	}
	
	public String aplicarQuestao() {
		return enunciado;
	}
	public boolean corrigir(String resposta) {
		if (this.resposta.equals(resposta)) {
			return true;
		}
		else{
			return false;	
		}
		
	}
}
