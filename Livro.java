public class Livro{
    int qtdePaginas;
    String autor;
    boolean capaDura;
    String titulo;
    double preco;
    int edicao;
    String editora;
    int paginaAtual;

    void abrir(){
        System.out.println("Abrindo livro");
    }

    void virarPagina(boolean voltar){
        if(voltar){
            paginaAtual = paginaAtual - 1 >= 0 ? paginaAtual - 1 : 0; //OPERADOR TERNARIO IF/ELSE DE UMA LINHA SÓ
        }else{
            paginaAtual = paginaAtual + 1 <= qtdePaginas ? paginaAtual + 1 : qtdePaginas;
        }
        System.out.println("Página virada. Página atual: " + paginaAtual);
    }
}