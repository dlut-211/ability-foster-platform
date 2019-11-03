package edu.dlut.ssdut.abilityfosterplatform.utils.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.util.Date;

/**
 * @Author: raymond
 * @Date: 2019/10/28 9:00
 * @Description: 解决返回日期格式问题
 * 修改前 2019-09-16T15:58:29.000+0000
 * 修改后 1568649509
 **/
public class Date2LongSerializer extends JsonSerializer<Date> {
    @Override
    public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeNumber(date.getTime() / 1000);
    }
}
