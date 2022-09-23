package modelo;

import java.util.ArrayList;
import java.util.List;

public class Campo {
    private final int linha;
    private final int coluna;

    //valor padrão do boolean é false
    private boolean aberto;
    private boolean minado;
    private boolean marcado;
    private List<Campo> vizinhos = new ArrayList<>();
    Campo(int linha, int coluna){
        this.linha = linha;
        this.coluna = coluna;
    }

}
