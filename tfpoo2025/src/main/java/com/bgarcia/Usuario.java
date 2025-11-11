package com.bgarcia;

import com.bgarcia.exceptions.EstacionamentoException;
import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {
    private String nome;
    private String CPF;
    private Set<Veiculo>veiculos;
}

public Usuario(String nome, String CPF) {
this.nome = nome;
this.CPF = CPF;
}

public String getNome() {
    return nome;
}

public String getCPF() {
    return CPF;
}

public Set<Veiculo> getVeiculos() {
    return veiculos;
}

public void addVeiculo