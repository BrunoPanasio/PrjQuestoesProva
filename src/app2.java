import java.util.ArrayList;
import java.util.Scanner;
public class app2 {
	public static void main(String[] args) {
		//QuestaoSimples questoes[] = new QuestaoSimples[3];
		/*
		questoes[0]= new  QuestaoSimples("Qual � a cor do mar?", "azul");
		questoes[1]= new QuestaoMultiplaEscolha("Quatno � 3x3?", "9", "3", "6", "9", "33");
		questoes[2]= new QuestaoComDica("Qual pa�s � o maior?", "Russia", "Dica: Fala-se Russo por l�");
		*/
		Scanner teclado = new Scanner(System.in);
		String resposta; int score =0;
		ArrayList<QuestaoSimples> questoes;
		questoes = new ArrayList<QuestaoSimples>();
		questoes.add(new QuestaoSimples("Qual � a cor do mar?", "azul"));
		questoes.add(new QuestaoMultiplaEscolha("Quatno � 3x3?", "9", "3", "6", "9", "33"));
		questoes.add(new QuestaoComDica("Qual pa�s � o maior?", "Russia", "Dica: Fala-se Russo por l�"));
		
		System.out.println("Boa sorte na prova!\n");
		for (QuestaoSimples q : questoes) {
			System.out.println(q.aplicarQuestao());
			resposta = teclado.nextLine();
			if (q.corrigir(resposta)) {
				System.out.println("Resposta correta!\n"); score++;
			}
			else {
				System.out.println("Resposta incorreta\n");
			}
		}
		teclado.close();System.out.println("fim da prova.\nAcertos: "+score+ "/"+ questoes.size()+"\n");
	}
}
