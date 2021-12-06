package com.digitalhouse.aula5mesa;

import com.digitalhouse.aula5mesa.server.IDownload;
import com.digitalhouse.aula5mesa.server.impl.DownloadProxy;
import com.digitalhouse.aula5mesa.server.impl.DownloadService;
import model.Usuario;

public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario(365845, "Free");
        Usuario usuario2 = new Usuario(33434, "Premium");

        IDownload proxy = new DownloadProxy(new DownloadService());

        proxy.download(usuario);
        proxy.download(usuario2);
    }
}
