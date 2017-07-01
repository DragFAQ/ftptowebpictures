package com.drag.ftptowebpictures.util.ftp;

public class FTPConnectionFactory {

    private static FTPConnection instance;

    private FTPConnectionFactory() {
    }

    public static FTPConnection getFTPConnection() {
        if (instance == null)
            instance = new FTPApacheCommonsNetConnection();

        return instance;
    }
}
