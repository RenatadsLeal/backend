package com.digitalhouse.aula5;

import com.digitalhouse.aula5.model.Pessoa;
import com.digitalhouse.aula5.server.IVacinacao;
import com.digitalhouse.aula5.server.impl.VacinacaoProxy;
import com.digitalhouse.aula5.server.impl.VacinacaoService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formatoData.parse("14/10/2021");

        Pessoa pessoa = new Pessoa("Renata", "Leal", "34353453", "H1N1", data);

        IVacinacao proxy = new VacinacaoProxy(new VacinacaoService());

        proxy.vacinar(pessoa);
    }
}
