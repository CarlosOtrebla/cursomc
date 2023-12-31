package com.carlosotrebla.cursomc.domain;

import com.carlosotrebla.cursomc.domain.enums.EstadoPagamento;
import jakarta.persistence.Entity;

import java.io.Serial;

@Entity
public class PagamentoComCartao extends Pagamento{

    @Serial
    private static final long serialVersionUID = 1L;
    private Integer numeroDeParcelas;

    public PagamentoComCartao() {
    }

    public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcelas) {
        super(id, estado, pedido);
        this.numeroDeParcelas = numeroDeParcelas;
    }

    public Integer getNumeroDeParcelas() {
        return numeroDeParcelas;
    }

    public void setNumeroDeParcelas(Integer numeroDeParcelas) {
        this.numeroDeParcelas = numeroDeParcelas;
    }
}
