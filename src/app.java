import java.util.Scanner;
public class app {
	public static void main(String[] args) {
		QuestaoSimples questoes[] = new QuestaoSimples[3];
		Scanner teclado = new Scanner(System.in);
		String resposta; int score =0;	
		questoes[0]= new  QuestaoSimples("Qual é a cor do mar?", "azul");
		questoes[1]= new QuestaoMultiplaEscolha("Quatno é 3x3?", "9", "3", "6", "9", "33");
		questoes[2]= new QuestaoComDica("Qual país é o maior?", "Russia", "Dica: Fala-se Russo por lá");
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
		teclado.close();System.out.println("fim da prova.\nAcertos: "+score+"/3\n");
	}
}
