package fr.inria.astor.core.entities.taxonomy;
/**
 * Gen prog operations.
 * @author Matias Martinez,  matias.martinez@inria.fr
 *
 */
public enum GenProgMutationOperation implements Operation{
	
	
	INSERT_AFTER,
	REPLACE,
	DELETE,
	INSERT_BEFORE;
	
	
	private GenProgMutationOperation(){
		
	}
}
