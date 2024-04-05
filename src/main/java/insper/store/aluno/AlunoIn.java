package insper.store.aluno;

import java.sql.Date;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record AlunoIn (
    String nome,
    String email,
    String genero,
    Date dataNascimento,
    String cep,
    String escolaridade,
    Integer periodo,
    String ocupacao,
    Float renda_per_capita,
    String modalidade,
    Float distancia_em_km,
    String oportunidade,
    String areas_interesse,
    String descricao
) {
    
}
