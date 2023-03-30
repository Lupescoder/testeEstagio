public class App {
    public static void main(String[] args) throws Exception {
        
        PrimeiraQuestao primeiraQuestao = new PrimeiraQuestao();
        SegundaQuestao segundaQuestao = new SegundaQuestao();

        System.out.println(primeiraQuestao.resposta());
        segundaQuestao.resposta(10);
        
    }
}
