package aep.unicesumar.Conceito;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Conceito {
	
	@OneToMany
	
	@Id
	private String id;
	
	private float nota;
	
	private Avaliacao avaliacao;
	
	private Aluno aluno;
	
	
	public Conceito(Avaliacao avaliacao, Aluno aluno) 
	{
		id = UUID.randomUUID().toString();
		this.avaliacao = new Avaliacao("disciplina", "professor");
		this.aluno     = new Aluno("Aluno1");
	}
	
	public Conceito(float nota) 
	{
		try 
		{
			this.nota = nota; 
		}
		
		catch (Exception e) 
		{
			if(nota > 10.0 || nota <0) 
			{
				throw new NotaException(e);
			}
		
		}
		
	}
	
	public String getId() 
	{
		return id;
	}
	
	public float getNota() 
	{
		return nota;
	}

}
