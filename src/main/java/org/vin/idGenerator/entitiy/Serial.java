package org.vin.idGenerator.entitiy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @Description TODO
 * @Date 2023/9/13 19:11
 * @Created by fjyulu
 */



@Slf4j
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Serial {


    /**
     * two bytes
     */
    private byte[] header;

    /**
     * two bytes
     */
    private byte[] version;

    private int length;

    private String number;


    public String convert() {

//        String header =
        return "";
    }
}
