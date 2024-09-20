package fr.uge.modules.api.model.entities;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tokentype", schema = "public", catalog = "rootcause")
public class TokenTypeEntity extends PanacheEntity {
    public String name;
}
