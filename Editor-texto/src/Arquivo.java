public class Arquivo {
    //atributs
    private String nome;
    private int tamanho;
    private String conteudo;

    // constructors
    public Arquivo (String nome) {
        this.nome = nome;
        this.conteudo = "";
        this.tamanho = 0;
    }

    //methods

    public void abrir () {
        System.out.println("Nome: " + nome);
        System.out.println("Conteúdo: " + conteudo);
        System.out.println("Tamanho: " + tamanho + " Bits");
    }

    public void editar (String conteudo) {
        this.conteudo += conteudo;
        this.tamanho += conteudo.length() * 8;
    }

    public void renomear (String nome) {
        this.nome = nome;
    }

    public void limpar () {
        this.conteudo = "";
        this.tamanho = 0;
    }
}
