package persistence;

import java.util.List;

import exception.ColecaoException;
import model.Veterinario;

public interface ColecaoDeVeterinario extends Colecao<Veterinario>{
	
	public List<Veterinario> porNome( String nome ) throws ColecaoException;
	public Veterinario porCrmv ( String crmv ) throws ColecaoException;
	

}
