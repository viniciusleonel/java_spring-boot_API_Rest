package med.voll.api.domain.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(

        @NotNull
        Long id,

        String nome,
        @Pattern(regexp = "\\(\\d{2}\\) \\d{7}-\\d{4}", message = "Insira um número de telefone válido no formato (xx) xxxxxx-xxxx!")
        String telefone,
        @Valid
        DadosEndereco endereco) {
}
