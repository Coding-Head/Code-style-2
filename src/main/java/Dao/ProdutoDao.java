package Dao;

import Interface.IGenericDao;
import Repository.DatabaseConector;
import Model.Produto;
import java.util.List;

public class ProdutoDao implements IGenericDao<Produto> {
    
    @Override
    public void salvar(Produto produto) {
        // Implementação específica para salvar um produto no banco de dados
    }

    @Override
    public void atualizar(Produto produto) {
        // Implementação específica para atualizar um produto no banco de dados
    }

    @Override
    public void excluir(Produto produto) {
        // Implementação específica para excluir um produto no banco de dados
    }

    @Override
    public Produto buscarPorId(Long id) {
        // Implementação específica para buscar um produto por ID no banco de dados
        return null;
    }

    @Override
    public List<Produto> buscarTodos() {
        // Implementação específica para buscar todos os produtos no banco de dados
        return null;
    }
}
