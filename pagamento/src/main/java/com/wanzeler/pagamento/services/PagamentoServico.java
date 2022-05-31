package com.wanzeler.pagamento.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wanzeler.pagamento.entities.Pagamento;
import com.wanzeler.pagamento.entities.Produto;

@Service
public class PagamentoServico {
	
	@Value("${produto.host}")
	private String produtoHost;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public Pagamento getPagamento(long produtoId, Integer estoque) {
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("id", "" +produtoId);
		
		Produto produto = restTemplate.getForObject(produtoHost + "/produtos/{id}", Produto.class, uriVariables);
		return new Pagamento(produtoId, produto.getEstoque());
	}
}
