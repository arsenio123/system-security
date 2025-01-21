package com.system.credit.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@Configuration

public class OrigensCofig {


    public static Map<String,String> ORINGINS=null;
    private static Logger log= LoggerFactory.getLogger(OrigensCofig.class);

    @Bean
    @ConfigurationProperties
    public static Map<String,String> getORINGINS(){
        if(ORINGINS!=null){
            return ORINGINS;
        }else{


             try {
                 Resource resource = new ClassPathResource("origens.properties");
                 String path=resource.getURL().getPath();
                 log.info("origens.properties:"+path);


                 Properties origensProperti = new Properties();
                 origensProperti.load(new FileInputStream(path));
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
