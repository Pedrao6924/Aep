package aep.unicesumar.Conceito;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Avaliacao {
	
	@Id
	public String id;
	public String disciplina;
	public String professor;
	
	
	public Avaliacao(String disciplina, String professor) 
	{
		id = UUID.randomUUID().toString();
	}
	
	public String getId() 
	{
		return id;
	}
	
	public String getDisciplina() 
	{
		return disciplina;
	}
}
