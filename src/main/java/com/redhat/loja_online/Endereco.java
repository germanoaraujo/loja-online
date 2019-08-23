package com.redhat.loja_online;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Endereco implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Logradouro")
	private java.lang.String logradouro;
	@org.kie.api.definition.type.Label("Bairro")
	private java.lang.String bairro;
	@org.kie.api.definition.type.Label("Cidade")
	private java.lang.String cidade;
	@org.kie.api.definition.type.Label("Estado")
	private java.lang.String estado;
	@org.kie.api.definition.type.Label("CEP")
	private Integer cep;

	public Endereco() {
	}

	public java.lang.String getLogradouro() {
		return this.logradouro;
	}

	public void setLogradouro(java.lang.String logradouro) {
		this.logradouro = logradouro;
	}

	public java.lang.String getBairro() {
		return this.bairro;
	}

	public void setBairro(java.lang.String bairro) {
		this.bairro = bairro;
	}

	public java.lang.String getCidade() {
		return this.cidade;
	}

	public void setCidade(java.lang.String cidade) {
		this.cidade = cidade;
	}

	public java.lang.String getEstado() {
		return this.estado;
	}

	public void setEstado(java.lang.String estado) {
		this.estado = estado;
	}

	public java.lang.Integer getCep() {
		return this.cep;
	}

	public void setCep(java.lang.Integer cep) {
		this.cep = cep;
	}

	public Endereco(java.lang.String logradouro, java.lang.String bairro,
			java.lang.String cidade, java.lang.String estado,
			java.lang.Integer cep) {
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}

}