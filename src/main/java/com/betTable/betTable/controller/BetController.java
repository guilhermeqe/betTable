package com.betTable.betTable.controller;

import com.betTable.betTable.domain.BetTable;
import com.betTable.betTable.service.BetService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/bet")
public class BetController {

    @Autowired
    private BetService service;

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public BetTable findById(@PathVariable("id") Long id) {
        return this.service.findById(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<BetTable> listAll() {
        return this.service.listAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BetTable save(@RequestBody BetTable betTable) {
        return this.service.save(betTable);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public BetTable update(@PathVariable("id") Long id, @RequestBody BetTable betTable) {
        return this.service.update(id, betTable);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id) {
        this.service.delete(id);
    }


}
