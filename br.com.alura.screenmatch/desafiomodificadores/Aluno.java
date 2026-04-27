package desafiomodificadores;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private ArrayList<Double> notas = new ArrayList<>();


    public void adicionarNotas(double nota){
        notas.add(nota);
    }

    public double calcularMedia(){
        double media = 0;
        for(Double nota: notas){
            media += nota;
        }
        return media / notas.size();
    }


}
