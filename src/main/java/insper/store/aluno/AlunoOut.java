package insper.store.aluno;

import java.sql.Date;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record AlunoOut (
    String id,
    String nome,
    Date dataNascimento,
    String cep,
    String genero,
    String areas_interesse,
    String descricao,
    String ocupacao,
    Float renda_per_capita
) {
    
}
