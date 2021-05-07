package br.com.marinhosoftware.mvc.mudi.dto;

import br.com.marinhosoftware.mvc.mudi.model.Pedido;

public class RequisicaoNovoPedido {
	
	private String nomeProduto;
	private String urlProduto;
	private String urlImagem;
	private String descricao;
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getUrlProduto() {
		return urlProduto;
	}
	public void setUrlProduto(String urlProduto) {
		this.urlProduto = urlProduto;
	}
	public String getUrlImagem() {
		return urlImagem;
	}
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Pedido toPedido() {
		Pedido pedido = new Pedido();
		pedido.setNome(descricao);
		pedido.setDescricao(nomeProduto);
		pedido.setUrlImagem(urlImagem);
		pedido.setUrlProduto(urlProduto);
		return pedido;
	}
	
}
