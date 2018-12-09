package br.com.ireport;

import java.time.LocalDateTime;

public class PreviaReembolsoRel {
	private Long numRbl;
	private String numeroCarteira;
	private String nomeTitular;
	private String nomeEstipulante;
	private String nomeSubEstipulante;
	private String plano;
	private String rede;
	private LocalDateTime dataSolicitacao;
	private String protocolo;
	private String nomeBeneficiario;
	private String numeroCarteiraTitular;

	public Long getNumRbl() {
		return numRbl;
	}

	public void setNumRbl(Long numRbl) {
		this.numRbl = numRbl;
	}

	public String getNumeroCarteira() {
		return numeroCarteira;
	}

	public void setNumeroCarteira(String numeroCarteira) {
		this.numeroCarteira = numeroCarteira;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getNomeEstipulante() {
		return nomeEstipulante;
	}

	public void setNomeEstipulante(String nomeEstipulante) {
		this.nomeEstipulante = nomeEstipulante;
	}

	public String getNomeSubEstipulante() {
		return nomeSubEstipulante;
	}

	public void setNomeSubEstipulante(String nomeSubEstipulante) {
		this.nomeSubEstipulante = nomeSubEstipulante;
	}

	public String getPlano() {
		return plano;
	}

	public void setPlano(String plano) {
		this.plano = plano;
	}

	public String getRede() {
		return rede;
	}

	public void setRede(String rede) {
		this.rede = rede;
	}

	public LocalDateTime getDataSolicitacao() {
		return dataSolicitacao;
	}

	public void setDataSolicitacao(LocalDateTime dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}

	public String getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}

	public String getNomeBeneficiario() {
		return nomeBeneficiario;
	}

	public void setNomeBeneficiario(String nomeBeneficiario) {
		this.nomeBeneficiario = nomeBeneficiario;
	}

	public String getNumeroCarteiraTitular() {
		return numeroCarteiraTitular;
	}

	public void setNumeroCarteiraTitular(String numeroCarteiraTitular) {
		this.numeroCarteiraTitular = numeroCarteiraTitular;
	}

}
