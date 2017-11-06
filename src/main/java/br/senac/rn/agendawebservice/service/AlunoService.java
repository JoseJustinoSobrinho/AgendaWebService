package br.senac.rn.agendawebservice.service;

import br.senac.rn.agendawebservice.dao.AlunoDao;
import br.senac.rn.agendawebservice.model.Aluno;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/aluno")
public class AlunoService {

    private final AlunoDao dao = new AlunoDao();
    
    public void salvar() {}
    
    public void editar() {}
    
    public void excluir() {}
    
    @GET    
    @Path("/matricula/{matricula}")
    @Produces({MediaType.APPLICATION_JSON})    
    public Aluno buscarPorMatricula(@PathParam("matricula") Integer matricula) {         
        return dao.selectByMatricula(matricula); 
    }
    
    @GET
    @Path("/todos")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Aluno> buscarTodos() { 
        return dao.selectAll();
    }
    
}
