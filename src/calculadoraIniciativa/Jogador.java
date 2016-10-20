package calculadoraIniciativa;

import static calculadoraIniciativa.Banco.LISTAJOGADORES;

/**
 *
 * @author yurialessandro
 */
public class Jogador {

    private String nome;

    public Jogador(String nome) {
        this.nome = nome;
        LISTAJOGADORES.add(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
