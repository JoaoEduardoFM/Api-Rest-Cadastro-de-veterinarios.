package model;

public class Veterinario {
	
	private int id;
	private String nome, crmv;
	private double salario;
	
	public Veterinario() { }
	
	public Veterinario ( int id ) {
		this.setId( id );
	}
	
	public Veterinario ( String nome, String crmv) {
		this.setNome( nome );
		this.setCrmv( crmv );
	}
	
	public Veterinario (String nome, String crmv, double salario) {
		this.setNome( nome );
		this.setCrmv( crmv );
		this.setSalario( salario );
	}
	
	public Veterinario (int id, String nome, String crmv, double salario) {
		this.setId( id );
		this.setNome( nome );
		this.setCrmv( crmv );
		this.setSalario( salario );
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCrmv() {
		return crmv;
	}

	public void setCrmv(String crmv) {
		this.crmv = crmv;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
