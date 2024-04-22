package com.system.credit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@Configuration

public class OrigensCofig {


    public static Map<String,String> ORINGINS=null;

    @Bean
    public static Map<String,String> getORINGINS(){
        if(ORINGINS!=null){
            return ORINGINS;
        }else{

            //String filePath = OrigensCofig.class.getResource("/example.txt").getFile();

             try {
                 Resource resource = new ClassPathResource("origens.properties");
                 String path=resource.getURL().getPath();
                 System.out.println(path);
                 File fileOrigins;
                 try {
                     fileOrigins = Paths.get(path).toFile();
                 }
                 catch (InvalidPathException ex){
                      fileOrigins = Paths.get(path.substring(1)).toFile();

                 }
                 System.out.println("Absolute phat is: "+fileOrigins.getAbsolutePath());

                 Properties origensProperti = new Properties();
                 origensProperti.load(new FileInputStream(fileOrigins));
                 String originsStr = (String) origensProperti.get("app.origins.allowed");
                 String[] origins =originsStr.split(",");


                 ORINGINS=new HashMap<String,String>();
                 for (int i=0;i<origins.length;i++) {
                     ORINGINS.put(origins[i],origins[i]);
                 }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

        return ORINGINS;
    }

}
