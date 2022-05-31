package com.wanzeler.pagamento.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wanzeler.pagamento.entities.Pagamento;
import com.wanzeler.pagamento.services.PagamentoServico;

@RestController
@RequestMapping(value = "/pagamentos")
public class PagamentoResource {
	
	@Autowired
	private PagamentoServico servico;
	
	@GetMapping(value = "/{produtoId}/estoque/{estoque}")
	public ResponseEntity<Pagamento> getPagamento(@PathVariable Long produtoId, @PathVariable Integer estoque){
		Pagamento pagamento = servico.getPagamento(produtoId, estoque);
		return ResponseEntity.ok(pagamento);
	}
}
