package newpackage3;

import lombok.Getter;
import lombok.Setter;
import newpackage1.ClasseA;

@Getter
@Setter
public class ClasseC {
    private String nome;
    private int pontuacao;

    public void jogar() {
       
        pontuacao += 20;
    }

    public void usarClasseA(ClasseA jogador) {
        
        System.out.println(nome + " está interagindo com " + jogador.getNome());
    }
}
