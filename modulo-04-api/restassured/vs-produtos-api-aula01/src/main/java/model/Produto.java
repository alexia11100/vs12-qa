package model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produto {
    private String _id;
    private String nome;
    private Integer preco;
    private String descricao;
    private Integer quantidade;

    @Override
    public String toString() {
        return "{\"nome\":\""+nome+"\", " +
                "\"preco\":"+preco+", " +
                "\"descricao\":\""+descricao+"\", " +
                "\"quantidade\":"+quantidade+"}";
    }
}