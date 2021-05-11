package br.com.marinhosoftware.mvc.mudi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.marinhosoftware.mvc.mudi.model.Pedido;
import br.com.marinhosoftware.mvc.mudi.model.StatusPedido;
import br.com.marinhosoftware.mvc.mudi.repository.PedidoRepository;

@SpringBootApplication
public class MudiApplication implements CommandLineRunner {

	@Autowired
	private PedidoRepository pedidoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MudiApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Pedido pedido = new Pedido();
		pedido.setNome("Xiaomi Redmi Note 9");
		pedido.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/41s708mKqJL._AC_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Celular-Xiaomi-Redmi-64GB-Dual/dp/B08B3QSVM6/ref=sr_1_1?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=2OIQR9NKMOBTM&dchild=1&keywords=celular&qid=1619542482&refinements=p_89%3AXiaomi&rnid=18120432011&s=electronics&sprefix=celu%2Caps%2C346&sr=1-1");
		pedido.setDescricao("Uma descrição qualquer para esse pedido");
		pedido.setStatus(StatusPedido.AGUARDANDO);
		List<Pedido> pedidos = new ArrayList<Pedido>();
		pedidos.add(pedido);
		pedidoRepository.save(pedido);
	}
	

}
