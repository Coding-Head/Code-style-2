package Interface;

import java.util.List;

public interface IGenericDao<T> {
    void salvar(T entidade);
    void atualizar(T entidade);
    void excluir(T entidade);
    T buscarPorId(Long id);
    List<T> buscarTodos();
}