public class Aluno extends Usuario {
    private int matricula;

    public Aluno(String nome, String cpf, String endereco, int matricula) {
        super(nome, cpf, endereco);
        this.matricula = matricula;
    }

    // Getters e setters

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}