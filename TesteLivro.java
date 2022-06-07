import javax.swing.JOptionPane;

public class TesteLivro {
    public static void main(String[] args) {
        Livro meuLivro = new Livro();

        meuLivro.preco = 150;
        meuLivro.qtdePaginas = 500;

        System.out.println("Meu livro custa: "+ meuLivro.preco);

        meuLivro.abrir();
        
        meuLivro.virarPagina(false);

        meuLivro.virarPagina(false);

        meuLivro.virarPagina(true);
    }
}
