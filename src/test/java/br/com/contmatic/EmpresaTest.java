package br.com.contmatic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmpresaTest {

	@Test
	public void nao_deve_aceitar_cnpj_nulo() {
		final Empresa empresa = new Empresa();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			empresa.setCnpj(null);
		});
	}

	@Test
	public void nao_deve_aceitar_cnpj_maior_que_14_caracteres() {
		final Empresa empresa = new Empresa();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			empresa.setCnpj("123456789012345");
		});
	}

	@Test
	public void nao_deve_aceitar_cnpj_menor_que_14_caracteres() {
		final Empresa empresa = new Empresa();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			empresa.setCnpj("1234567890123");
		});
	}

	@Test
	public void nao_deve_aceitar_letras_no_cnpj() {
		final Empresa empresa = new Empresa();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			empresa.setCnpj("21616jhihio");
		});
	}

	@Test
	public void validar_cnpj() {
		final Empresa empresa = new Empresa();
		Assertions.assertThrows(IllegalStateException.class, () -> {
			empresa.setCnpj("12345678901234");
		});
	}

	@Test
	public void nao_deve_aceitar_data_de_abertura_nula() {
		final Empresa empresa = new Empresa();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			empresa.setDataDeAbertura(null);
		});
	}

	@Test
	public void nao_deve_aceitar_nome_fantasia_nulo() {
		final Empresa empresa = new Empresa();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			empresa.setNomeFantasia(null);
		});
	}

	@Test
	public void nao_deve_aceitar_razao_social_nula() {
		final Empresa empresa = new Empresa();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			empresa.setRazaoSocial(null);
		});
	}

	@Test
	public void nao_deve_aceitar_logradouro_nulo() {
		final Empresa empresa = new Empresa();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			empresa.setLogradouro(null);
		});
	}

	@Test
	public void nao_deve_aceitar_Numero_logradouro_nulo() {
		final Empresa empresa = new Empresa();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			empresa.setNumLogradouro(null);
		});
	}

	@Test
	public void nao_deve_aceitar_letras_no_numero_loradouro() {
		final Empresa empresa = new Empresa();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			empresa.setNumLogradouro("agstrd");
		});
	}

	@Test
	public void nao_deve_aceitar_cep_nulo() {
		final Empresa empresa = new Empresa();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			empresa.setCep(null);
		});
	}

	@Test
	public void nao_deve_aceitar_bairro_nulo() {
		final Empresa empresa = new Empresa();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			empresa.setBairro(null);
		});
	}

	@Test
	public void nao_deve_aceitar_municipio_nulo() {
		final Empresa empresa = new Empresa();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			empresa.setMunicipio(null);
		});
	}

	@Test
	public void nao_deve_aceitar_uf_nulo() {
		final Empresa empresa = new Empresa();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			empresa.setUf(null);
			;
		});
	}

	@Test
	public void nao_deve_aceitar_porte_nulo() {
		final Empresa empresa = new Empresa();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			empresa.setPorteEmpresa(null);
		});
	}

	@Test
	public void nao_deve_aceitar_telefone_nulo() {
		final Empresa empresa = new Empresa();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			empresa.setTelefone(null);
		});
	}

	@Test
	public void nao_deve_aceitar_telefone_com_letras() {
		final Empresa empresa = new Empresa();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			empresa.setTelefone("huhtgygg");
		});
	}
	
	@Test 
	public void nao_deve_aceitar_codigo_cnae_nulo() {
		final Empresa empresa = new Empresa();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		empresa.setCodCnae1(null);	
		});
	}
	
	@Test
	public void nao_deve_aceitar_cod_cnae_maior_que_7_caracteres() {
		final Empresa empresa = new Empresa();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			empresa.setCodCnae1("12345678");
		});
	}
	
	@Test
	public void nao_deve_aceitar_cod_cnae_menor_que_7_caracteres() {
		final Empresa empresa = new Empresa();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			empresa.setCodCnae1("123456");
		});
	}
	
	@Test
	public void nao_deve_aceitar_descricao_cnae_nula() {
		final Empresa empresa = new Empresa();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			empresa.setCodCnae1(null);
		});
	}

}