public class Pessoa{
        
    private String nome;
    private int idade;
    private String sexo;
    private String corOlhos;
    private String corCabelos;
    private double altura;

    public Pessoa(String nome, int idade, String sexo, String corOlhos, String corCabelos, double altura){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.corOlhos = corOlhos;
        this.corCabelos = corCabelos;
        this.altura = altura;
    }

    public Pessoa(){
        
    }

    public String getNome(String nome){
        return nome;
    } 
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(int idade){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getSexo(String sexo){
        return sexo;
    } 
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public String getCorOlhos(String corOlhos){
        return corOlhos;
    } 
    public void setCorOlhos(String corOlhos){
        this.corOlhos = corOlhos;
    }
    public String getCorCabelos(String corCabelos){
        return corCabelos;
    } 
    public void setCorCabelos(String corCabelos){
        this.corCabelos = corCabelos;
    }
    public double getAltura(double altura){
        return altura;
    } 
    public void setAltura(double altura){
        this.altura = altura;
    }
    
}