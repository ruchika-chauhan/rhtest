/*package com.ts.demo;


import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.ProxyHTTP;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;
import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Properties;
import java.util.Vector;

*//**
 *
 * @author Dinesh.Lomte
 *//*
public class SftpUtil {

    *//**
     * 
     * @param fileName
     * @throws Exception 
     *//*
    public static void upload(String fileName)
    throws Exception {

        String method = "upload(String fileName)";
        Session session = null;
        Channel channel = null;
        ChannelSftp channelSftp = null;
        try {
            JSch jsch = new JSch();
            session = jsch.getSession("<sftp.user.name>",
                    "<sftp.host>",
                    Integer.valueOf("<sftp.port>"));
            session.setPassword("<sftp.user.password>");
            Properties config = new Properties();
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);            
            isSftpProxyEnabled(session);
            long lStartTime = new Date().getTime();
            System.out.println("Connecting to the sftp...");
            session.connect();
            System.out.println("Connected to the sftp.");            
            long lEndTime = new Date().getTime();
            System.out.println("---------------------------------------------");
            System.out.println("Connected to SFTP in : " + (lEndTime - lStartTime));
            channel = session.openChannel("sftp");
            channel.connect();
            channelSftp = (ChannelSftp) channel;
            channelSftp.cd("<sftp.output.folder.url>");
            File file = new File(fileName);
            FileInputStream fileInputStream = new FileInputStream(file);
            channelSftp.put(fileInputStream, file.getName());
            fileInputStream.close();
            fileInputStream = null;
        } catch (Exception exception) {
            throw exception;
        } finally {
            if (channelSftp != null) {
                channelSftp.exit();
            }
            if (channel != null) {
                channel.disconnect();
            }
            if (session != null) {
                session.disconnect();
            }
        }
    }

    *//**
     * 
     * @param session 
     *//*
    private static void isSftpProxyEnabled(Session session) {
        boolean isSftpProxyEnabled = Boolean.valueOf("true");
        if (isSftpProxyEnabled) {
            session.setProxy(new ProxyHTTP("10.32.11.245", 
                    Integer.valueOf("22")));
        }
        System.out.println("Proxy status: " + isSftpProxyEnabled);
    }

    *//**
     * 
     * @param folder
     * @param event
     * @param locale
     *//*
    public static void download(String folder, String event, String locale) {

        String method = "download(String folder, String event, String locale)";
        Session session = null;
        Channel channel = null;
        ChannelSftp channelSftp = null;
        try {
            // Creating and instantiating the jsch specific instance
            JSch jsch = new JSch();
            // Fetching and setting the parameters like: user name, host and port 
            // from the properties file
            session = jsch.getSession("<sftp.user.name>",
                    "<sftp.host>",
                    Integer.valueOf("<sftp.port>"));
            // Fetching and setting the password as configured in properties files
            session.setPassword("<sftp.user.password>");
            // Setting the configuration specific properties
            Properties config = new Properties();
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);            
            // Validating if proxy is enabled to access the sftp
            isSftpProxyEnabled(session);
            // Execution start time
            long lStartTime = new Date().getTime();
            System.out.println("Connecting to the sftp...");
            // Connecting to the sftp 
            session.connect();
            System.out.println("Connected to the sftp.");            
            // Execution end time
            long lEndTime = new Date().getTime();
            System.out.println("---------------------------------------------");
            System.out.println("Connected to SFTP in : " + (lEndTime - lStartTime));
            channel = session.openChannel("SFTP");
            // Establishing the connection
            channel.connect();
            channelSftp = (ChannelSftp) channel;
            try {
                channelSftp.cd("<sftp.input.folder.url>");
            } catch (SftpException sftpException) {
                System.out.println("Failed to change the directory in sftp.");                
            }
            Vector<ChannelSftp.LsEntry> lsEntries = channelSftp.ls(
                    new StringBuilder("*").append("<sys.code>").append("*").append(event)
                    .append("*").append(locale).append("*").append(".csv").toString());
            if (lsEntries.isEmpty()) {
                System.out.println("No file exist in the specified sftp folder location.");
            }
            for (ChannelSftp.LsEntry entry : lsEntries) {
                try {
                    channelSftp.get(entry.getFilename(), new StringBuilder(folder)
                            .append(File.separator).append(entry.getFilename()).toString());
                } catch (SftpException sftpException) {
                    System.out.println("Failed to download the file the sftp folder location.");                    
                }                
            }
            for (ChannelSftp.LsEntry entry : lsEntries) {
                try {
                    channelSftp.rm(entry.getFilename());
                } catch (SftpException sftpException) {
                    System.out.println("Failed to delete the file from the sftp folder location.");                    
                }                
            }
        } catch (Exception exception) {
            System.out.println("Failed to download the file(s) from SFTP.");            
        } finally {
            if (channelSftp != null) {
                channelSftp.exit();
            }
            if (channel != null) {
                channel.disconnect();
            }
            if (session != null) {
                session.disconnect();
            }
        }
    }
}*/