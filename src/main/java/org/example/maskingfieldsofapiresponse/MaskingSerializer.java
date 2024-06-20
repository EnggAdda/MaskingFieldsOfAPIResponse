package org.example.maskingfieldsofapiresponse;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class MaskingSerializer extends JsonSerializer<String> {
    @Override
    public void serialize(String value, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if(value != null){
            jsonGenerator.writeString("*****");
        }
    }
}
