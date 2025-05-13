package com.fb.GestaoIgreja.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/membros")
public class MembroController {

    @GetMapping
    public String listarMembros() {
        return "Lista de Irmãos OK";
    }
}
