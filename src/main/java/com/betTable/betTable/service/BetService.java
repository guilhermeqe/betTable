package com.betTable.betTable.service;

import com.betTable.betTable.domain.BetTable;
import com.betTable.betTable.repository.BetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class BetService {

    @Autowired
    private BetRepository repository;

    public BetTable findById(Long id) {
        Optional<BetTable> betTableOptional = this.repository.findById(id);
        if (betTableOptional.isPresent()) {
            return betTableOptional.get();
        } else {
            throw new RuntimeException("Registro não encontrado.");
        }
    }

    public List<BetTable> listAll() {
        return this.repository.findAll();
    }

    public BetTable save(BetTable betTable) {
        return this.repository.save(betTable);
    }

    public BetTable update(Long id, BetTable betTable) {
        Optional<BetTable> betTableOptional = this.repository.findById(id);
        if (betTableOptional.isPresent()) {
            return this.repository.save(betTable);
        } else {
            throw new RuntimeException("Não foi possivel atualizar o registro.");
        }
    }

    public void delete(Long id) {
        Optional<BetTable> betTableOptional = this.repository.findById(id);
        if (betTableOptional.isPresent()) {
            this.repository.delete(betTableOptional.get());
        } else {
            throw new RuntimeException("Não foi possivel deletar o registro");
        }
    }
}
