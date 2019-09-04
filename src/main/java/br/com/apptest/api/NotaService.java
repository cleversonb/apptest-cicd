package br.com.apptest.api;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;

/**
 * Classe provedora de serviços rest de Nota. 
 * @author GIC
 * @since 1.0 
 * @version 1.0 - 17/04/19
 */
@Path("v1/nota")
public class NotaService {
	
	@Inject
	private Logger log;
			
	/**
	 * Retorna as notas do aluno por sua matrícula.
	 * @param idAluno
	 * @return
	 */
	@Path("/{id_aluno}")
	@GET
    @Produces(MediaType.TEXT_PLAIN)
	public Response listarPorMatricula(@PathParam("id_aluno") Integer idAluno) {
		
		log.debug("NotaService Acessed - Aluno:" + idAluno);
		return Response.ok().entity(new String("Nota do aluno:" + idAluno)).build();
		
	}

	
}
