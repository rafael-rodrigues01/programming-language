public class Main {
    public static void main (String[] args) {
        Arquivo texto1 = new Arquivo("Meu arquivo");
        texto1.abrir();
        texto1.editar("Esse é meu editor de texto1");
        texto1.abrir();
        texto1.renomear("Rafael");
        texto1.abrir();
        texto1.limpar();
        texto1.abrir();
    }
}