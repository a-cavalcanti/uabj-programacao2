package Aula17.interfaces;

public class Funcionario {

    protected String nome;
    protected String cpf;
    protected double salario;
    protected String dataNascimento;

    public Funcionario(String nome, String cpf, double salario, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.dataNascimento = dataNascimento;
    }

    public double getSalario() {
        return this.salario;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    @Override
    public String toString() {
        return String.format("%-5s %-5s %-5s  R$%.2f", this.nome, this.cpf, this.dataNascimento, getSalario());
    }
}
