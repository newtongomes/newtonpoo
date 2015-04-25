package br.estacio.poo.alunos.miqueias.biblioteca;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        boolean satifeito = false;
        String biblioteca = "";
        String localizacao = "";
        while (!satifeito) {
            if (biblioteca == null || localizacao == null) {
                satifeito = true;
                System.exit(0);
            } else if (biblioteca.length() == 0) {
                biblioteca = JOptionPane.showInputDialog(null, "Nome da biblioteca:");
            } else if (localizacao.length() <= 0) {
                localizacao = JOptionPane.showInputDialog(null, "Localização:");
            } else {
                satifeito = true;
            }
        }

        Biblioteca bibi = new Biblioteca(biblioteca, localizacao);

        boolean contMenu = true;

        while (contMenu) {

            String menu = JOptionPane.showInputDialog(null, ""
                    + "Biblioteca: " + bibi.getNome() + "\n"
                    + "Localizacao: " + bibi.getLocal() + "\n"
                    + "\n"
                    + "1 - Cadastrar Livro \n"
                    + "2 - Pesquisar Livro (Codigo) \n"
                    + "3 - Pesquisar Livro (Nome) \n"
                    + "4 - Listar Livros \n"
                    + "5 - Informações \n"
                    + "6 - Finalizar \n"
                    + "\n"
                    + "Selecione uma opção:");

            if (menu == null) {
                menu = "-1";
            }

            int opcao = -1;

            try {
                opcao = Integer.parseInt(menu);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Opção inválida, escolha uma opcao do menu! Erro: " + ex.getMessage());
                continue;
            }

            if (opcao == 1) {
                int codigo = 0;
                try {
                    codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Codigo do Livro:"));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Digite um número inteiro! Erro: " + ex.getMessage());
                    continue;
                }
                String titulo = JOptionPane.showInputDialog(null, "Titulo do Livro:");
                String autor = JOptionPane.showInputDialog(null, "Autor do Livro:");
                String ISBN = JOptionPane.showInputDialog(null, "ISBN do Livro:");
                int numeroPaginas = 0;
                try {
                    numeroPaginas = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de páginas:"));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Digite um número inteiro! Erro: " + ex.getMessage());
                    continue;
                }         
                float valorLivro = 0;
                try {
                    valorLivro = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor do Livro:"));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Digite um valor valido! Erro: " + ex.getMessage());
                    continue;
                }
                Livro l1 = new Livro(codigo, titulo, autor, ISBN, numeroPaginas, valorLivro);
                bibi.addLivro(l1);
                JOptionPane.showMessageDialog(null, "Livro Salvo com sucesso!");
            } else if (opcao == 2) {
                String dados;
                int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Codigo do Livro:"));
                Livro livro = bibi.buscaLivro(codigo);
                if (livro == null) {
                    dados = "Nenhum livro foi encontrado com esse Código!";
                } else {
                    dados = ""
                            + "Titulo: " + livro.getTitulo() + "\n"
                            + "Autor : " + livro.getAutor() + "\n"
                            + "ISBN: " + livro.getISBN() + "\n"
                            + "Paginas: " + livro.getNumeroPaginas() + "\n"
                            + "Valor: " + livro.getValorLivro();
                }
                JOptionPane.showMessageDialog(null, dados);
            } else if (opcao == 3) {
                String dados;
                String titulo = JOptionPane.showInputDialog(null, "Titulo do Livro:");
                ArrayList<Livro> livro = bibi.buscaLivro(titulo);
                System.out.println(livro.size());
                if (livro.size() == 0) {
                    JOptionPane.showMessageDialog(null, "Nenhum livro foi encontrado com esse Titulo!");
                }
                for (Livro livro1 : livro) {
                    dados = ""
                            + "Titulo: " + livro1.getTitulo() + "\n"
                            + "Autor : " + livro1.getAutor() + "\n"
                            + "ISBN: " + livro1.getISBN() + "\n"
                            + "Paginas: " + livro1.getNumeroPaginas() + "\n"
                            + "Valor: " + livro1.getValorLivro();
                    JOptionPane.showMessageDialog(null, dados);
                }
            } else if (opcao == 4) {
                String dados = "";
                ArrayList<Livro> livro = bibi.buscaLivro();
                if (livro.size() == 0) {
                    JOptionPane.showMessageDialog(null, "Não existe livros no momento!");
                }
                for (Livro livro1 : livro) {
                    dados = ""
                            + "Titulo: " + livro1.getTitulo() + "\n"
                            + "Autor : " + livro1.getAutor() + "\n"
                            + "ISBN: " + livro1.getISBN() + "\n"
                            + "Paginas: " + livro1.getNumeroPaginas() + "\n"
                            + "Valor: " + livro1.getValorLivro();
                    JOptionPane.showMessageDialog(null, dados);
                }
            } else if (opcao == 5) {
                String dados = ""
                        + "Nome: " + bibi.getNome() + "\n"
                        + "Local : " + bibi.getLocal() + "\n"
                        + "Quantidade de Livros: " + bibi.quantidadeLivros();
                JOptionPane.showMessageDialog(null, dados);
            } else if (opcao == 6 || opcao == -1) {
                contMenu = false;
            }
        }
    }
}
