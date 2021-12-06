package com.digitalhouse.aula5mesa.server.impl;

import com.digitalhouse.aula5mesa.server.IDownload;
import model.Usuario;

public class DownloadProxy implements IDownload {

    private DownloadService downloadService;

    public DownloadProxy(DownloadService downloadService) {
        this.downloadService = downloadService;
    }

    @Override
    public void download(Usuario usuario) {
        if(usuario.getTipo().equals("Premium")){
            downloadService.download(usuario);
        } else {
            System.out.println("Você precisa ser um usuário Premium para fazer download de músicas!");
        }

    }
}
