package br.com.marinhosoftware.mvc.mudi.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.marinhosoftware.mvc.mudi.model.Pedido;
import br.com.marinhosoftware.mvc.mudi.model.StatusPedido;
import br.com.marinhosoftware.mvc.mudi.repository.PedidoRepository;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoRest {
	
	@Autowired
	public PedidoRepository pedidoRepository;
	
	@GetMapping("aguardando")
	public List<Pedido> getPedidosAguardandoOfertas() {
		Sort sort = Sort.by("id").descending();
		PageRequest page =  PageRequest.of(0, 10, sort);
		
		return pedidoRepository.findByStatus(StatusPedido.AGUARDANDO, page);
	}

}