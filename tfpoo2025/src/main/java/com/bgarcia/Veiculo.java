package com.bgarcia;

public class Veiculo {
    private String placa;
}

public Veiculo(String placa) {
    if (placa == null || placa.trim().isEmpty()) {
            throw new IllegalArgumentException("Placa cannot be null or empty");
    }
    this.placa = placa;
}

public String getPlaca() {
    return placa;
}

@Override
public String toString() {
    return "Veiculo [placa=" + placa + "]";
}

@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Veiculo veiculo = (Veiculo) obj;
        return placa.equals(veiculo.placa);
    }

    @Override
    public int hashCode() {
        return placa.hashCode();
    }
}

