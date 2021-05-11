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
		
		Pedido pedido2 = new Pedido();
		pedido2.setNome("Monitor LG LED Full HD 21.5");
		pedido2.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/81lz4Tm8HvL._AC_SL1500_.jpg");
		pedido2.setUrlProduto("https://www.amazon.com.br/Monitor-LG-LED-Full-21-5/dp/B07ML9239T/ref=sr_1_2?dchild=1&pf_rd_i=16364756011&pf_rd_m=A3RN7G7QC5MWSZ&pf_rd_p=3a4566d3-19f5-4330-ba47-df1b7bbd88a2&pf_rd_r=6W64K7T9AWTBD052QHRP&pf_rd_s=merchandised-search-3&pf_rd_t=101&qid=1620761204&refinements=p_n_size_browse-bin%3A16365480011%7C16365481011%7C16365482011&s=computers&sr=1-2");
		pedido2.setDescricao("Tela LED Full HD On, Screen Control ,Reader Mode, Flicker Safe, Color Weaknes");
		pedido2.setStatus(StatusPedido.APROVADO);
		
		Pedido pedido3 = new Pedido();
		pedido3.setNome("HD SSD Kingston SA400S37 480GB");
		pedido3.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/81Yleainj1L._AC_SL1500_.jpg");
		pedido3.setUrlProduto("https://www.amazon.com.br/HD-SSD-KINGSTON-SA400S37-480GB/dp/B075BKXSCQ?ref_=Oct_s9_apbd_omwf_hd_bw_bHpofBj&pf_rd_r=QZQZYKYFRYEVYC09Y7WQ&pf_rd_p=69ed6a79-e3a1-5d62-af53-3573194453bd&pf_rd_s=merchandised-search-10&pf_rd_t=BROWSE&pf_rd_i=16339926011");
		pedido3.setDescricao("SSD deixa o computador mais rápido");
		pedido3.setStatus(StatusPedido.ENTREGUE);
		
		List<Pedido> pedidos = new ArrayList<Pedido>();
		pedidos.add(pedido);
		pedidos.add(pedido2);
		pedidos.add(pedido3);
		
		pedidoRepository.saveAll(pedidos);	
	}

}
