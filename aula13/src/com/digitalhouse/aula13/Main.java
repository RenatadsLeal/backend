package com.digitalhouse.aula13;

import com.digitalhouse.aula13.dao.ServidorH2;
import com.digitalhouse.aula13.model.Medicamento;
import org.apache.log4j.PropertyConfigurator;

public class Main {

    public static void main(String[] args) {
        Medicamento med = new Medicamento(1, "333454", "Dorflex", "NeoQuimica", 15, 8.50);
        ServidorH2 servidor = new ServidorH2();
        PropertyConfigurator.configure("log4j.properties");

        servidor.insert(med);
        servidor.select(med.getId());
        servidor.selectAll();
        servidor.delete(med.getId());

    }
}
