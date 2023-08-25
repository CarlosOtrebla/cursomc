package com.carlosotrebla.cursomc.services;


import java.util.Optional;
import com.carlosotrebla.cursomc.domain.Pedido;
import com.carlosotrebla.cursomc.repositories.PedidoRepository;
import com.carlosotrebla.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;
    public Pedido find(Integer id) {
        Optional<Pedido> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
    }

}


