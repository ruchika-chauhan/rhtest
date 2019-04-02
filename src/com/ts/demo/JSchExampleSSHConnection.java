/*package com.ts.demo;

import java.io.InputStream;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;


public class JSchExampleSSHConnection {
	

	*//**
	 * JSch Example Tutorial
	 * Java SSH Connection Program
	 *//*
	public static void main(String[] args) {
	    String host="10.32.11.245";
	    String user="oracle";
	    try{
	    	
	    	java.util.Properties config = new java.util.Properties(); 
	    	config.put("StrictHostKeyChecking", "no");
	    	JSch jsch = new JSch();
	    	Session session=jsch.getSession(user, host, 22);
	    	session.setPassword("oracleemes");
	    	session.setConfig(config);
	    	session.connect();
	    	System.out.println("Connected");
	    	Channel channel = session.openChannel( "sftp" );
	    	channel.connect();

	    	ChannelSftp sftpChannel = (ChannelSftp) channel;

	    	sftpChannel.get("/home/oracle/edi/test/book_ftp/EGALYELC111PRASH13NN20180413TRIZMELC111PRASH13NN20180430ARKALY0000017171.edi", "E:\\SFTP" );
	    	//InputStream in = sftpChannel.get( "remote-file" );
	    	  // process inputstream as needed

	    	sftpChannel.exit();
	    	session.disconnect();
	}catch (Exception e) {
		// TODO: handle exception
	}
	}

}*/