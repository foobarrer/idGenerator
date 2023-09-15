package org.vin.idGenerator.core;

/**
 * @Description
 * @Date 2023/9/13 19:05
 * @Created by fjyulu
 */
public interface IGenerator {


    /**
     * create a new serial number by mappingId;
     * @return serial number
     */
    String createSerial(String mappingId);
    String createSerial(String mappingId, String previous);
    String createSerial(String mappingId, String previous, String amount);



    /**
     * create a new mapping as the beginning
     * @return mapping id
     */
    String createMapping();
    String createMapping(int power);

    /**
     * convert the input serial to real decimal number with the help of mappingId
     *
     * @return decimal number
     */
    Long decodeSerial(String serial, String mappingId);





}
