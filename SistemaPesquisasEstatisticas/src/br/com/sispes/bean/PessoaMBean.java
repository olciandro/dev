package br.com.sispes.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.sispes.model.Pessoa;

@ManagedBean(name="MBPessoa")
@ViewScoped
public class PessoaMBean {
	private Pessoa pessoa;

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}
