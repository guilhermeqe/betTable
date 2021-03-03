package com.betTable.betTable.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "bet_table")
public class BetTable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "mercado")
    private String mercado;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "resultado")
    private String resultado;

    @Column(name = "data")
    private Date data;

    @Column(name = "odd")
    private float odd;

    @Column(name = "valor_apostado")
    private Double valorApostado;

    @Column(name = "valor_unidade")
    private String valorUnidade;

    @Column(name = "lucro")
    private Double lucro;

    @Column(name = "lucro_unidade")
    private Double lucroUnidade;

}
