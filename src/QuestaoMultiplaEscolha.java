
public class QuestaoMultiplaEscolha extends QuestaoSimples {
	private String alternativa1,alternativa2,alternativa3,alternativa4;

	public QuestaoMultiplaEscolha(String enunciado, String resposta, String alternativa1, String alternativa2, String alternativa3, String alternativa4) {
		super(enunciado, resposta);
		this.alternativa1 = alternativa1;
		this.alternativa2 = alternativa2;
		this.alternativa3 = alternativa3;
		this.alternativa4 = alternativa4;
	}

	
	public String aplicarQuestao() {
		return enunciado+"\n"+alternativa1+"\n"+alternativa2+"\n"+alternativa3+"\n"+alternativa4;
	}
	
	
	@Override
	public String toString() {
		return "QuestaoMultiplaEscolha [alternativa1=" + alternativa1 + ", alternativa2=" + alternativa2
				+ ", alternativa3=" + alternativa3 + ", alternativa4=" + alternativa4 + ", enunciado=" + enunciado
				+ ", resposta=" + resposta + "]";
	}
		
}
