package com.betTable.betTable.repository;

import com.betTable.betTable.domain.BetTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BetRepository extends JpaRepository<BetTable, Long> {
}
