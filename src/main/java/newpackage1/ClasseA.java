package newpackage1;

import lombok.Getter;
import lombok.Setter;
import newpackage2.ClasseB;

@Getter
@Setter
public class ClasseA {
    private String nome;
    private int pontuacao;

    public void jogar() {
        
        pontuacao += 10;
    }

    public void usarClasseB(ClasseB jogador) {
        
        System.out.println(nome + " está interagindo com " + jogador.getNome());
    }
}
