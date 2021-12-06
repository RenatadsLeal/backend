import model.Roupa;
import model.Tamanho;
import model.Tipo;

import java.util.HashMap;
import java.util.Map;

public class RoupaFactory {
    private static Integer contador = 0;

    private static Map<String, Roupa> flyweight = new HashMap<>();

    public Roupa buscarRoupa(Tamanho tamanho, Tipo tipo, Boolean eNova, Boolean eImportada){
        String id = "tamanho" + tamanho + "tipo" + tipo;

        if(!flyweight.containsKey(id)){
            flyweight.put(id, new Roupa(tamanho, tipo, eNova, eImportada));
            contador++;
            System.out.println("Molde de roupa foi criado!");
            System.out.println(flyweight.get(id).toString());
        } else {
            System.out.println("Esse molde de roupa já existe!");
        }

        return flyweight.get(id);
    }

    public static Integer getContador() {
        return contador;
    }
}
