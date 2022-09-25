package modelo;

import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {
     private int linhas;
     private int colunas;
     private int minas;

     private final List<Campo> campos = new ArrayList<>();

    public Tabuleiro(int linha, int colunas, int minas) {
        this.linhas = linha;
        this.colunas = colunas;
        this.minas = minas;

        gerarCampos();
        associarOsVizinhos();
        sortearMinas();

    }
    // i linha j coluna
    private void gerarCampos() {
        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++){
               campos.add(new Campo(i,j));
            }
        }
    }

    private void associarOsVizinhos(){
      for (Campo c1: campos){
          for(Campo c2: campos){
              c1.adicionarVizinho(c2);
          }
      }
    }
    private void sortearMinas() {
    }


}
