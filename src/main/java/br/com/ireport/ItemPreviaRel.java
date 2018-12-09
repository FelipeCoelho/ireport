package br.com.ireport;

import java.math.BigDecimal;

public class ItemPreviaRel {
	private String cdItem;
	private String descricao;
	private Integer quantidade;
	private BigDecimal valorInformado;
	private BigDecimal valorReembolsavel;


	public String getCdItem() {
		return cdItem;
	}
	public void setCdItem(String cdItem) {
		this.cdItem = cdItem;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public BigDecimal getValorInformado() {
		return valorInformado;
	}
	public void setValorInformado(BigDecimal valorInformado) {
		this.valorInformado = valorInformado;
	}
	public BigDecimal getValorReembolsavel() {
		return valorReembolsavel;
	}
	public void setValorReembolsavel(BigDecimal valorReembolsavel) {
		this.valorReembolsavel = valorReembolsavel;
	}


}
