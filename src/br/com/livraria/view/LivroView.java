package br.com.livraria.view;

import br.com.livraria.model.Livro;
import java.util.List;
import java.util.Scanner;

public class LivroView {
    private final Scanner scanner;
    public LivroView(Scanner scanner) { this.scanner = scanner; }
    public void menu() {
        System.out.println("\n=== CADASTRO DE LIVROS ===");
        System.out.println("1 - Cadastrar\n2 - Listar\n3 - Buscar por código");
        System.out.println("4 - Alterar\n5 - Excluir\n0 - Sair");
    }
    public String lerTexto(String mensagem) {
        System.out.print(mensagem);
        if (!scanner.hasNextLine()) throw new java.util.NoSuchElementException();
        return scanner.nextLine();
    }
    public int lerInteiro(String mensagem) {
        while (true) {
            try { return Integer.parseInt(lerTexto(mensagem).trim()); }
            catch (NumberFormatException e) { mostrar("Digite um número inteiro válido."); }
        }
    }
    public void mostrar(String mensagem) { System.out.println(mensagem); }
    public void mostrar(Livro l) {
        System.out.printf("Código: %d | Livro: %s | Autor: %s | Ano: %d%n",
                l.getId(), l.getNome(), l.getAutor(), l.getAnoLancamento());
        System.out.printf("          Edição: %d | Editora: %s | Unidades: %d%n",
                l.getEdicao(), l.getEditora(), l.getNumeroUnidades());
    }
    public void listar(List<Livro> livros) {
        if (livros.isEmpty()) mostrar("Nenhum livro cadastrado.");
        else livros.forEach(this::mostrar);
    }
}
