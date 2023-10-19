package oficina.api;

public record DadosCadastroCarro (
        int ano,

        String modelo,

        Cliente cliente,

        Cor cor){
}
