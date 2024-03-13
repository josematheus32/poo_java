public class Professor extends Usuario {
    private String departamento;

    public Professor(String nome, String cpf, String endereco, String departamento) {
        super(nome, cpf, endereco);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}