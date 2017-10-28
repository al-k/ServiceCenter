package ua.alk.servicecenter.entities;

import java.sql.Timestamp;

/**
 * Created by alex on 27.03.17.
 */
public class Unit {
    private long id;
    private String serialNumber;
    private Timestamp createdDate;
    private Timestamp modifiedDate;
    private long modifiedById;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Timestamp getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public long getModifiedById() {
        return modifiedById;
    }

    public void setModifiedById(long modifiedById) {
        this.modifiedById = modifiedById;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Unit unit = (Unit) o;

        if (id != unit.id) return false;
        if (modifiedById != unit.modifiedById) return false;
        if (serialNumber != null ? !serialNumber.equals(unit.serialNumber) : unit.serialNumber != null) return false;
        if (createdDate != null ? !createdDate.equals(unit.createdDate) : unit.createdDate != null) return false;
        if (modifiedDate != null ? !modifiedDate.equals(unit.modifiedDate) : unit.modifiedDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (serialNumber != null ? serialNumber.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (modifiedDate != null ? modifiedDate.hashCode() : 0);
        result = 31 * result + (int) (modifiedById ^ (modifiedById >>> 32));
        return result;
    }
}
