package com.doublechaintech.retailscm.consumerorderconfirmation;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.doublechaintech.retailscm.RetailscmObjectPlainCustomSerializer;
public class ConsumerOrderConfirmationSerializer extends RetailscmObjectPlainCustomSerializer<ConsumerOrderConfirmation>{

	@Override
	public void serialize(ConsumerOrderConfirmation consumerOrderConfirmation, JsonGenerator jgen,
			SerializerProvider provider) throws IOException,
			JsonProcessingException {
			
		this.writeBaseEntityField(jgen, null, consumerOrderConfirmation, provider);
		
	}
}


