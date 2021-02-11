package com.example.ProjetoCurso.domain.enums;

public enum TipoCliente {
    PESSOAFISICA(1, "PESSOA fÍSICA"),
    PESSOAJURIDICA(2, "PESSOA JURÍDICA");

    private int cod;
    private String descicao;

    private TipoCliente(int cod, String descicao){
        this.cod = cod;
        this.descicao = descicao;

    }

    public int getCod(){
        return cod;
    }

    public String getDescicao(){
        return descicao;
    }

    public static TipoCliente toEnum(Integer cod){
        if(cod == null){
            return null;
        }
        for(TipoCliente x : TipoCliente.values()){
            if(cod.equals((x.getCod()))){
                return x;
            }
        }
        throw  new IllegalArgumentException(("Id inválido: " + cod));


    }
}
