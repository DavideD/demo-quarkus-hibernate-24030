package fr.uge.modules.api.model.entities;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "rawlog")
public class RawLogEntity extends PanacheEntity {
    @NotBlank(message = "Log content cannot be blank")
    public String log;

    public String getLog() {
        return log;
    }

    @Override
    public String toString() {
        return "RawLogEntity{" +
                "log='" + log + '\'' +
                '}';
    }
}