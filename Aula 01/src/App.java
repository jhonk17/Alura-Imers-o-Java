import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        //Fazer uma conexão HTTP e buscar os top 250 filmes.
        String url = "https://imdb-api.com/en/API/Top250Movies/k_d3ap3s2f";
        URI endereco = URI.create(url);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();
         
        
        // Extrair só os dados que intereressam (Título, poster, classificação)
        var parser = new JsonParser();
        List<Map<String, String>> listDeFilmesList = parser.parse (body);
        
        
        // Exibir e manipular os dados
        for
    }
}
