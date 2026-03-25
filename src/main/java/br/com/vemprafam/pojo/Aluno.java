package br.com.vemprafam.pojo;

import java.util.Date;

public class Aluno {
	private int ra;
	private String nome;
	private Date dataNascimento;
	private Double salario;
	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aluno(int ra, String nome, Date dataNascimento, Double salario) {
		super();
		this.ra = ra;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.salario = salario;
	}
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Aluno [ra=" + ra + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", salario=" + salario
				+ "]";
	}
}
