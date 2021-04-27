package br.com.marinhosoftware.mvc.mudi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.marinhosoftware.mvc.mudi.model.Pedido;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNome("Xiaomi Redmi Note 9");
		pedido.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/41s708mKqJL._AC_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Celular-Xiaomi-Redmi-64GB-Dual/dp/B08B3QSVM6/ref=sr_1_1?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=2OIQR9NKMOBTM&dchild=1&keywords=celular&qid=1619542482&refinements=p_89%3AXiaomi&rnid=18120432011&s=electronics&sprefix=celu%2Caps%2C346&sr=1-1");
		pedido.setDescricao("Uma descrição qualquer para esse pedido");
		List<Pedido> pedidos = new ArrayList<Pedido>();
		pedidos.add(pedido);
		model.addAttribute("pedidos", pedidos);
		return "home";
	}
}
