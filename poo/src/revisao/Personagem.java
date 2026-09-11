package revisao;


public class Personagem {
    private String nome;
    private int vida;


    public Personagem(){}

    public Personagem(String nome, int vida) {
        if(nome.length() < 3){
           throw new RuntimeException("O nome deve ser maior que 3 caracteres");
        }
        this.nome = nome;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length() < 3){
            //faço algo
        }
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void atacar(){

    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", vida=" + vida +
                '}';
    }
}
