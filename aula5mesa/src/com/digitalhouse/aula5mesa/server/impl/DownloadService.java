package com.digitalhouse.aula5mesa.server.impl;

import com.digitalhouse.aula5mesa.server.IDownload;
import model.Usuario;

public class DownloadService implements IDownload {
    @Override
    public void download(Usuario usuario) {
        System.out.println("Você fez download com sucesso!");
    }
}
