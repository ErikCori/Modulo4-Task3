package com.codeoftheweb.salvo;

import org.aspectj.weaver.GeneratedReferenceTypeDelegate;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
public class Ship {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    @OneToMany(mappedBy = "ship", fetch = FetchType.EAGER)
    private GamePlayer gamePlayer;

    private String type;

    private List locations;
    //Constructor
    public Ship(){};
    public Ship(long id, String type, List locations) {
        this.id = id;
        this.type = type;
        this.locations = locations;
    }

    //Getters
    public long getId() {
        return id;
    }
    public String getType() {
        return type;
    }
    public List getLocations() {
        return locations;
    }
}
