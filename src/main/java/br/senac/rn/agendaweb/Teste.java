package br.senac.rn.agendaweb;

import br.senac.rn.agendawebservice.dao.AlunoDao;
import br.senac.rn.agendawebservice.model.Aluno;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("paulo");
        aluno.setEndereco("Rua central, 375");
        aluno.setFone("3332-2514");
        aluno.setSite("www.sitePualo.com.br");
        aluno.setNota(5.0);
        AlunoDao dao = new AlunoDao();
        dao.insert(aluno);
        
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Josefa");
        aluno1.setEndereco("Rua das Flores, 275");
        aluno1.setFone("3422-2514");
        aluno1.setSite("www.siteJosefa.com.br");
        aluno1.setNota(3.0);
        dao.insert(aluno1);
        
        Aluno aluno3 = new Aluno();
        aluno3.setNome("Jane");
        aluno3.setEndereco("Trav. Primeira, 275");
        aluno3.setFone("4422-2514");
        aluno3.setSite("www.sitePrimeira.com.br");
        aluno3.setNota(7.0);     
        dao.insert(aluno3);
        dao.fechar();
        
        System.exit(0);
        
        
        
       


//        AlunoDao dao =  new AlunoDao();        
//        Aluno aluno = dao.selectByMatricula(2);        
//        dao.delete(aluno);
        
        
        System.exit(0);

    }

}
