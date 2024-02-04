package com.company.base.repository.model;


import com.company.base.PojaGenerated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@PojaGenerated
@Entity
@Getter
@Setter
public class Report {
    @Id String id;
    String content;

}
