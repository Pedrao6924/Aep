package aep.unicesumar.Conceito;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aluno {
    
	@Id
	private String id;
	
	private String nome;
	
	public Aluno(String nome) 
	{
		id = UUID.randomUUID().toString();
		this.nome = nome;
		
	}

	public String getId()
	{
		return id;
	}
}
