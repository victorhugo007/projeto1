package domain;

import java.util.List;

public class Animal {
    
    private String nome;

    private String sexo;

    private String idade;

    private Especie especie;

    private Cliente cliente;

    List<Tratamento> tratamentos;

    public Animal(String nome, String sexo, String idade, Especie especie, Cliente cliente) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.especie = especie;
        this.cliente = cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Tratamento> getTratamentos() {
        return tratamentos;
    }

    public void setTratamentos(List<Tratamento> tratamentos) {
        this.tratamentos = tratamentos;
    }

    @Override
    public String toString() {
        return "Animal [nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", especie=" + especie + ", cliente="
                + cliente + ", tratamentos=" + tratamentos + "]";
    }

    

}
