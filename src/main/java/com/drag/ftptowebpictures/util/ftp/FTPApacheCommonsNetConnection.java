package com.drag.ftptowebpictures.util.ftp;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

import java.io.IOException;

public class FTPApacheCommonsNetConnection extends AbstractFTPConnection {
    
    @Override
    public boolean checkLogin(String login, String password) {
        Boolean result = false;

        String server = SERVER;
        int port = 21;
        String user = login;
        String pass = password;

        FTPClient ftpClient = new FTPClient();
        try {
            ftpClient.connect(server, port);
            if( ftpClient.login(user, pass) ) {
                ftpClient.enterLocalPassiveMode();
                if( ftpClient.setFileType(FTP.BINARY_FILE_TYPE) )
                    result = true;
            }
        } catch (IOException e) {

        } finally {
            try {
                if (ftpClient.isConnected()) {
                    ftpClient.logout();
                    ftpClient.disconnect();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        return result;
    }
}
