package br.com.contmatic;


public class Empresa {

	private String cnpj;
	private String razaoSocial;
	private String nomeFantasia;
	private String dataDeAbertura;
	private String porteEmpresa;
	private String logradouro;
	private String numLogradouro;
	private String complemento;
	private String cep;
	private String bairro;
	private String municipio;
	private String uf;
	private String email;
	private String telefone;
	private String codCnae1;
	private String descricaoCnae1;
	private String codCnae2;
	
	public String getCodCnae2() {
		return codCnae2;
	}

	public void setCodCnae2(String codCnae2) {
		if(codCnae2 == null) {
			throw new IllegalArgumentException("Código CNAE da empresa não pode ser nulo");
		}
		this.validarCnae2NaoPodeSerMenorQue7(codCnae2);
		if (codCnae1.length() >= 8) {
			throw new IllegalArgumentException("Código CNAE da empresa não pode ser maior que 7");
		}
		this.codCnae2 = codCnae2;
		
	}

	private void validarCnae2NaoPodeSerMenorQue7(String codCnae2) {
		if (codCnae2.length() <= 6) {
			throw new IllegalArgumentException("Código CNAE da empresa não pode ser menor que 7");
		}
	}

	public String getDescricaoCnae2() {
		return descricaoCnae2;
	}

	public void setDescricaoCnae2(String descricaoCnae2) {
		this.descricaoCnae2 = descricaoCnae2;
	}

	private String descricaoCnae2;	

	public String getCodCnae1() {
		return codCnae1;
	}

	public void setCodCnae1(String codCnae1) {
		this.validarCodCnaeNaoPodeSerNulo(codCnae1);
		this.validarCodCnae1NaoPodeSerMaiorQue7(codCnae1);
		this.validarCodCnae1NaoPodeSerMenorQue7(codCnae1);
		this.codCnae1 = codCnae1;
	}

	private void validarCodCnae1NaoPodeSerMenorQue7(String codCnae1) {
		validarCnae2NaoPodeSerMenorQue7(codCnae1);
	}

	private void validarCodCnae1NaoPodeSerMaiorQue7(String codCnae1) {
		if (codCnae1.length() >= 8) {
			throw new IllegalArgumentException("Código CNAE da empresa não pode ser maior que 7");
		}
	}

	private void validarCodCnaeNaoPodeSerNulo(String codCnae1) {
		if(codCnae1 == null) {
			throw new IllegalArgumentException("O código CNAE da empresa não pode ser nulo");
		}
	}

	public String getDescricaoCnae1() {
		return descricaoCnae1;
	}

	public void setDescricaoCnae1(String descricaoCnae1) {
		this.validarDescricaoCnaeNaoPodeSerNulo(descricaoCnae1);
		this.descricaoCnae1 = descricaoCnae1;
	}

	private void validarDescricaoCnaeNaoPodeSerNulo(String descricaoCnae1) {
		if(descricaoCnae1 == null) {
			throw new IllegalArgumentException("A descrição do CNAE da empresa não pode ser nula");
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.validarTelefoneNaoPodeSerNulo(telefone);
		this.telefoneNaoPodeTerLetras(telefone);
		this.telefone = telefone;
	}

	private void telefoneNaoPodeTerLetras(String telefone) {
		if (telefone.substring(0, 5).matches("[A-Z|a-z]*")) {
			throw new IllegalArgumentException("Telefone da empresa não pode ter letras");
		}
	}

	private void validarTelefoneNaoPodeSerNulo(String telefone) {
		if (telefone == null) {
			throw new IllegalArgumentException("O telefone da empresa não pode ser nulo");
		}
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.validarLogradouroNaoPodeSerNulo(logradouro);
		this.logradouro = logradouro;
	}

	private void validarLogradouroNaoPodeSerNulo(String logradouro) {
		if (logradouro == null) {
			throw new IllegalArgumentException("O logradouro da empresa não pode ser nulo");
		}
	}

	public String getNumLogradouro() {
		return numLogradouro;
	}

	public void setNumLogradouro(String numLogradouro) {
		this.validarNumLogradouroNaoPodeTerNumeroNulo(numLogradouro);
		this.validarNumLogradouroNaoPodeTerLetras(numLogradouro);
		this.numLogradouro = numLogradouro;
	}

	private void validarNumLogradouroNaoPodeTerLetras(String numLogradouro) {
		if (numLogradouro.substring(0, 5).matches("[A-Z|a-z]*")) {
			throw new IllegalArgumentException("numero do logradouro da empresa não pode ter letras");
		}
	}

	private void validarNumLogradouroNaoPodeTerNumeroNulo(String numLogradouro) {
		if (numLogradouro == null) {
			throw new IllegalArgumentException("O numero do logradouro da empresa não pode ser nulo");
		}
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.validarCepNaoPodeSerNulo(cep);
		this.validarCepNaoPodeSerMenorQue8(cep);
		this.validarCepNaoPodeSerMaiorQue8(cep);
		this.cep = cep;
	}

	private void validarCepNaoPodeSerMaiorQue8(String cep) {
		if (cep.length() >= 9) {
			throw new IllegalArgumentException("Cep da empresa não pode ser maior que 8");
		}
	}

	private void validarCepNaoPodeSerMenorQue8(String cep) {
		if (cep.length() <= 7) {
			throw new IllegalArgumentException("Cep da empresa não pode ser menor que 8");
		}
	}

	private void validarCepNaoPodeSerNulo(String cep) {
		if (cep == null) {
			throw new IllegalArgumentException("O CEP não pode ser nulo");
		}
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.validarBairroNaoPodeSerNulo(bairro);
		this.bairro = bairro;
	}

	private void validarBairroNaoPodeSerNulo(String bairro) {
		if (bairro == null) {
			throw new IllegalArgumentException("O bairro não pode ser nulo");
		}
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.validarMunicipioNaoPodeSerNulo(municipio);
		this.municipio = municipio;
	}

	private void validarMunicipioNaoPodeSerNulo(String municipio) {
		if (municipio == null) {
			throw new IllegalArgumentException("Municipio não pode ser nulo");
		}
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.validarUfNaoPodeSerNulo(uf);
		this.uf = uf;
	}

	private void validarUfNaoPodeSerNulo(String uf) {
		if (uf == null) {
			throw new IllegalArgumentException("O UF não pode ser nulo");
		}
	}

	public String getPorteEmpresa() {
		return porteEmpresa;
	}

	public void setPorteEmpresa(String porteEmpresa) {
		this.validarPorteNaoPodeSerNulo(porteEmpresa);
		this.porteEmpresa = porteEmpresa;
	}

	private void validarPorteNaoPodeSerNulo(String porteEmpresa) {
		if (porteEmpresa == null) {
			throw new IllegalArgumentException("O porte da empresa não pode ser nulo");
		}
	}

	public String getDataDeAbertura() {
		return dataDeAbertura;
	}

	public void setDataDeAbertura(String dataDeAbertura) {
		this.dataAberturaNaoPodeSerNula(dataDeAbertura);
		int dia = 0;
		int mes = 0;
		int ano = 0;
		this.validarDataAbertura(dia, mes, ano);
		this.dataDeAbertura = dataDeAbertura;
	}

	public void validarDataAbertura(int dia, int mes, int ano) {
		this.diaNaoPodeSerMaiorQue31(dia);
		this.mesNaoPodeSerMaiorque12(mes);
		this.anoSoPodeEntre1950E2020(ano);
		this.dataDeAbertura = dia + "/" + mes + "/" + ano;
	}

	private void anoSoPodeEntre1950E2020(int ano) {
		if (ano > 2020 && ano < 1950) {
			throw new IllegalArgumentException("ano invalido, valido apenas entre 1950 á 2020");
		}
	}

	private void mesNaoPodeSerMaiorque12(int mes) {
		if (mes >= 13) {
			throw new IllegalArgumentException("Invalido, mês não pode ser maior que 12");
		}
	}

	private void diaNaoPodeSerMaiorQue31(int dia) {
		if (dia >= 32) {
			throw new IllegalArgumentException("Invalido, dia não pode ser maior que 31");
		}
	}

	private void dataAberturaNaoPodeSerNula(String dataDeAbertura) {
		if (dataDeAbertura == null) {
			throw new IllegalArgumentException("A data de abertura não pode ser nula");
		}
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.validarNomeFantasiaNaoPodeSerNulo(nomeFantasia);
		this.nomeFantasia = nomeFantasia;
	}

	private void validarNomeFantasiaNaoPodeSerNulo(String nomeFantasia) {
		if (nomeFantasia == null) {
			throw new IllegalArgumentException("Nome fantasia não pode ser nulo");
		}
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.validarRazaoSocialNaoPodeSerNulo(razaoSocial);
		this.razaoSocial = razaoSocial;
	}

	private void validarRazaoSocialNaoPodeSerNulo(String razaoSocial) {
		if (razaoSocial == null) {
			throw new IllegalArgumentException("Razão social não pode ser nulo");
		}
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.validarCnpjNaoPodeSerNulo(cnpj);
		this.validarCnpjNaoPodeTerMaiorQue14(cnpj);
		this.validarCnpjNaoPodeTerMenorQue14(cnpj);
		this.validarCnpjNaoPodeTerLetra(cnpj);
		this.validarCnpj(cnpj);
		this.cnpj = cnpj;
	}

	private void validarCnpj(String cnpj) {
		if (!this.calcularCnpj(cnpj)) {
			throw new IllegalStateException("cnpj não é valido");
		}
	}

	private void validarCnpjNaoPodeTerLetra(String cnpj) {
		if (cnpj.substring(0, 13).matches("[A-Z]*")) {
			throw new IllegalArgumentException("cnpj da empresa não pode ter letras");
		}
	}

	private void validarCnpjNaoPodeTerMenorQue14(String cnpj) {
		if (cnpj.length() <= 13) {
			throw new IllegalArgumentException("cnpj da empresa não pode ser menor que 14");
		}
	}

	private void validarCnpjNaoPodeTerMaiorQue14(String cnpj) {
		if (cnpj.length() >= 15) {
			throw new IllegalArgumentException("cnpj da empresa não pode ser maior que 14");
		}
	}

	private void validarCnpjNaoPodeSerNulo(String cnpj) {
		if (cnpj == null) {
			throw new IllegalArgumentException("O cnpj da Empresa não pode ser nulo");
		}
	}

	// CNPJ: 76313808000190
	public boolean calcularCnpj(String cnpj) {
		char dig13 = validarDigito(cnpj, 11);
		char dig14 = validarDigito(cnpj, 12);
		return validar2UltimosDigitos(cnpj, dig13, dig14);
	}

	private char validarDigito(String cnpj, int quantidade) {
		char dig13;
		int sm;
		int r;
		sm = 0;
		sm = repeticao(cnpj, sm, quantidade);
		r = sm % 11;
		dig13 = validar11PrimeirosDigitos(r);
		return dig13;
	}

	private boolean validar2UltimosDigitos(String cnpj, char dig13, char dig14) {
		if ((dig13 == cnpj.charAt(12)) && (dig14 == cnpj.charAt(13))) {
			return (true);
		} else {
			return (false);
		}
	}

	private char validar11PrimeirosDigitos(int r) {
		char dig13;
		if ((r == 0) || (r == 1)) {
			dig13 = '0';
		} else {
			dig13 = (char) ((11 - r) + 48);
		}
		return dig13;
	}

	private int repeticao(String cnpj, int sm, int valor) {
		int i;
		int num;
		int peso = 2;
		for (i = valor; i >= 0; i--) {
			num = (int) (cnpj.charAt(i) - 48);
			sm = sm + (num * peso);
			peso = peso + 1;
			if (peso == 10)
				peso = 2;
		}
		return sm;
	}

	@Override
	public String toString() {
		return "Empresa [cnpj = " + cnpj 
				+ ", razaoSocial = " + razaoSocial 
				+ ", Nome Fantasia = " + nomeFantasia
				+ ", Data De Abertura = " + dataDeAbertura 
				+ ", Porte Empresa = " + porteEmpresa 
				+ ", logradouro = " + logradouro
				+ ", número Logradouro = " + numLogradouro 
				+ ", Complemento = " + complemento 
				+ ", CEP = " + cep 
				+ ", Bairro = "	+ bairro 
				+ ", Municipio = " + municipio 
				+ ", UF = " + uf 
				+ ", E-mail = " + email 
				+ ", Telefone = " + telefone
				+ ", Código Cnae1 = " + codCnae1 
				+ ", Descrição Cnae1 = " + descricaoCnae1 
				+ ", Código Cnae2 = " + codCnae2
				+ ", Descrição Cnae2 = " + descricaoCnae2 + "]";
	}

}
