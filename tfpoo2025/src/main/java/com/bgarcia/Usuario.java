package com.bgarcia;
import java.util.Duration;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

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

public Set<Veiculo> getVeiculos