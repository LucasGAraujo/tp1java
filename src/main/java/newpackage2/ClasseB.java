package newpackage2;

import lombok.Getter;
import lombok.Setter;
import newpackage3.ClasseC;

@Getter
@Setter
public class ClasseB {
    private String nome;
    private int pontuacao;

    public void jogar() {
      
        pontuacao += 15;
    }

    public void usarClasseC(ClasseC jogador) {
        
        System.out.println(nome + " está interagindo com " + jogador.getNome());
    }
}
