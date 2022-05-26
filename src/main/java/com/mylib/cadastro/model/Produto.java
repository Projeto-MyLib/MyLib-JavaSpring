package com.mylib.cadastro.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cd_produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Integer quantidade;
    @Column(name = "preco_fabrica")
    private Double precoFabrica;
    @Column(name = "preco_venda")
    private Double precoVenda;
    private String descricao;
    @ManyToOne
    @JoinColumn(name = "categoria")
    private Categoria categoria;
    @Column(name = "considera_estoque")
    private Boolean consideraEstoque;
    @Column(name = "ind_ativo")
    private Boolean ativo;

}
