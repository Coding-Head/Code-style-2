package Interface;

import java.util.List;

 public interface IGenericDao<T> {
    void salvar(T entidade);
    void atualizar(T entidade);
    void excluir(int id);
    T buscarPorId(int id);
    List<T> buscarTodos();
    List<T> search(String pesquisa);
}