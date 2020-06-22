
public class QuestaoComDica extends QuestaoSimples {
	private String dica;

	public QuestaoComDica(String enunciado, String resposta, String dica) {
		super(enunciado, resposta);
		this.dica = dica;

	}

	public String aplicarQuestao() {
		return enunciado+"\n"+dica;
	}
	
	@Override
	public String toString() {
		return "QuestaoComDica [dica=" + dica + ", enunciado=" + enunciado + ", resposta=" + resposta + "]";
	}
	
}
