package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	//we are creating one constructor
	public ReadConfig(){
		//impliment the file to redconfig class
		File f=new File("./Configuration2747/config2747.properties");
		
		try{
			//it is converted the properties file into read mode
			FileInputStream fis=new FileInputStream(f);
			//local variable
			 pro=new Properties();
			 
			 //load the file by using the load method
			 pro.load(fis);
			
			
		}catch(Exception e){
			
			System.out.println(e.getMessage());
		}
		
	}
	
	//associate methods
	//void==no return type
	//non-primitive data types==>Array,string,class==>
	public String getApplicationURL(){
		
		String url=pro.getProperty("URL");
		return url;
		
	}
	
	public String getUseremailaddress(){
		String useremail=pro.getProperty("useremail");
		return useremail;
	}
	
	public String getuserpassword(){
		String userpassword=pro.getProperty("userpassword");
		return userpassword;
	}
	
	public String getchromedriverpath(){
		String cpath=pro.getProperty("chromepath");
		return cpath;
	}
	
	public String getfirefoxdriverpath(){
		String fpath=pro.getProperty("firefoxpath");
		return fpath;
	}
	
	public String getedgedriverpath(){
		String epath=pro.getProperty("edgepath");
		return epath;
	}
	

}
