package wagnerribas.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wagnerribas.com.model.Cliente;
import wagnerribas.com.repository.ClientesRepository;

@Service
public class ClientesService {

    private ClientesRepository clientesRepository;

    @Autowired
    public ClientesService(ClientesRepository clientesRepo) {
        this.clientesRepository = clientesRepo;
    }

    public void salvarCliente(Cliente cliente) {
        validarCliente(cliente);

        clientesRepository.salvar(cliente);
    }

    public void validarCliente(Cliente cliente) {
        // valida
    }
}
