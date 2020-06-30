package app.encapsulation.entities;

public class Funcionario
{
	protected Integer id;
	protected String name;
	protected Integer matr;
	protected Double salario;
	protected String depart;
	protected Data admissao;
	
	public Funcionario(){
	}
	
	public Funcionario (int id, String name, Data admissao){
		this.id = id;
		this.name = name;
		this.admissao = admissao;
	}
	
	public Funcionario (int id){
		this.id = id;
	}
	
	public Integer getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName (String name){
		this.name = name;
	}

	public Integer getMatr(){
		return matr;
	}

	public void setMatr (int matr){
		this.matr = matr;
	}
	
	public Double getSalario(){
		return salario;
	}

	public void setSalario (double salario){
		this.salario = salario;
	}
	
	public String getDepart(){
		return depart;
	}

	public void setDepart (String depart){
		this.depart = depart;
	}

	@Override
	public String toString()
	{
		return
		"\nIdentificador: "+ id +
		"\nNome do Funcionario: "+ this.name+
		"\nMatricula: "+this.matr +
		"\nSalario: "+ this.salario +
		"\nDepartamento: "+ this.depart +
		"\nAdmissão: "+ admissao;
	}

	public Double getBonificao(){
		return this.salario * 0.10;
	}	
}
