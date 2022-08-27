package programas;


public class Pessoa {
    String nome;
    String sobrenome;
    int telefone;
    public Pessoa (String nome,String sobrenome,int telefone){
      this.nome = nome;
      this.sobrenome = sobrenome;
      this.telefone = telefone;
    }
    public String getNome() {
      return nome;
    }
    public void setNome(String nome) {
      this.nome = nome;
    }
    public String getSobrenome() {
      return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
      this.sobrenome = sobrenome;
    }
    public int getTelefone() {
      return telefone;
    }
    public void setTelefone(int telefone) {
      this.telefone = telefone;
    } 
    
    
  }
