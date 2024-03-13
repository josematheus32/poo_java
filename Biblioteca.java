import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Usuario> usuarios;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    // Métodos para adicionar e remover livros e usuários

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void removerLivro(Livro livro) {
        livros.remove(livro);
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void removerUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

    // Outros métodos relevantes, como emprestimo e devolucao de livros

    public boolean emprestarLivro(Livro livro, Usuario usuario) {
        if (!livro.isEmprestado() && usuarios.contains(usuario)) {
            livro.setEmprestado(true);
            return true;
        }
        return false;
    }

    public boolean devolverLivro(Livro livro) {
        if (livro.isEmprestado()) {
            livro.setEmprestado(false);
            return true;
        }
        return false;
    }
}