package models;

public abstract class Peca {
    private Integer posicaoInicialLinha;
    private String posicaoInicialColuna;
    private Integer posicaoFinalLinha;
    private String posicaoFinalColuna;
    private boolean emJogo; //Armazena se a peça ainda está em jogo
    private boolean primeiroMovimento; //Armazena se é o primeiro movimento da peça

    public void Movimento(){
        //Método que vai ser sobrescrito pelas peças herdeiras
    }
}
