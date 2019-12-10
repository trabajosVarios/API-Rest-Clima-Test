package com.metro.apirest.domain.comuna;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {

    @JsonProperty("data_sequence")
    String data_sequence;

    @JsonProperty("value")
    String value;
    
    @JsonProperty("value2")
    String value2;
    
    @JsonProperty("valueB")
    String valueB;
    
    @JsonProperty("id")
    String id;
    
    @JsonProperty("id2")
    String id2;
    
    @JsonProperty("idB")
    String idB;
    
    public Forecast() {

    }
    
    public Forecast(String data_sequence, String value, String value2, String valueb, 
                    String id, String id2, String idB){ 
                        
        this.data_sequence = data_sequence;
        this.value = value;
        this.value2 = value2;
        this.valueB = valueb;
        this.id = id;
        this.id2 = id2;
        this.idB = idB;

    }

}
