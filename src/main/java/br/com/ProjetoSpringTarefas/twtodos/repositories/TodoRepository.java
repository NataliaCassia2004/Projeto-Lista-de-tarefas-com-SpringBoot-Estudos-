package br.com.ProjetoSpringTarefas.twtodos.repositories;

import br.com.ProjetoSpringTarefas.twtodos.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
                        //jpaRepository já tem varios metodos prontos para utilizarmos
                        //esta interface irá fazer aplicacoes como, editar, incluir e excluir metodos no meu banco de dados

public interface TodoRepository extends JpaRepository<Todo,Long> {

}
