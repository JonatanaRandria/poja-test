package com.company.base.endpoint.event.gen;


import com.company.base.PojaGenerated;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.annotation.processing.Generated;
import javax.persistence.Id;
import java.io.Serializable;

@PojaGenerated
@Generated("EventBridge")
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Data
@EqualsAndHashCode
@ToString
public class Report implements Serializable {
    @JsonProperty("id")
    String id;
    @JsonProperty("content")
    String content;
}
