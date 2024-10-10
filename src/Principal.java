
import dao.ProdutosDAO;
import dto.ProdutosDTO;
import view.cadastroVIEW;


public class Principal {
    public static void main(String args[]) {
        cadastroVIEW tela = new cadastroVIEW();
        tela.setVisible(true);
        
        /*
        ProdutosDTO p = new ProdutosDTO();
        p.setNome("Teste");
        p.setValor(350.0);
        p.setStatus("A Venda");
        
        ProdutosDAO dao = new ProdutosDAO();
        dao.cadastrarProduto(p);
        */
    }
    
}
