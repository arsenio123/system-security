package com.system.credit;

import com.system.credit.util.EncryptionUtil;
import org.junit.Test;
//import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EncryptionUtilTest {

    //@Test
    public void encrypted(){
        String encrypt= EncryptionUtil.decrypt("J+IC+9VCwqtu7T+4w/Gf4Q==");
        System.out.println(encrypt);
    }

    @Test
    public void decrypt(){
        String decrypted =EncryptionUtil.decrypt("J+IC+9VCwqtu7T+4w/Gf4Q==");
        System.out.println(decrypted);

    }

}
