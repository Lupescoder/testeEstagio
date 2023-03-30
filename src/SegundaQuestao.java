import java.util.ArrayList;

public class SegundaQuestao {
    
    public void resposta(int num){

        int a,b,c,n;

        ArrayList<Integer> todosValores = new ArrayList<>();

        a = 1;
        b = 0;
        n = num;

        while (num > 0) {
            c = a + b;
            todosValores.add(c);

            a = b;
            b = c;
            num -= 1;
        }
       
        if(todosValores.contains(n)){
            System.out.println("O número "+n+" pertence a sequência");
        }else{
            System.out.println("O número "+n+" NÃO pertence a sequência");
        }
        

    }
}
