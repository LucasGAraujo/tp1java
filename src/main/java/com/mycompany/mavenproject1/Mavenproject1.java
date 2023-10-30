/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import newpackage1.ClasseA;
import newpackage2.ClasseB;
import newpackage3.ClasseC;

/**
 *
 * @author lukin
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        int valor1 = 0;
        int valor2 = 4;
        int valor3 = valor1 + valor2; 
        
        ClasseA jogadorA = new ClasseA();
        ClasseB jogadorB = new ClasseB();
        ClasseC jogadorC = new ClasseC();

        
        jogadorA.setNome("Jogador A");
        jogadorB.setNome("Jogador B");
        jogadorC.setNome("Jogador C");

   
        jogadorA.jogar();
        jogadorB.jogar();
        jogadorC.jogar();

        jogadorA.usarClasseB(jogadorB);
        jogadorB.usarClasseC(jogadorC);
        jogadorC.usarClasseA(jogadorA);

       
        System.out.println(jogadorA.getNome() + " Pontuação Final: " + jogadorA.getPontuacao());
        System.out.println(jogadorB.getNome() + " Pontuação Final: " + jogadorB.getPontuacao());
        System.out.println(jogadorC.getNome() + " Pontuação Final: " + jogadorC.getPontuacao());
    }
}

