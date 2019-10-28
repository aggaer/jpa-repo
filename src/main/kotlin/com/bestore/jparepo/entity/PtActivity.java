package com.bestore.jparepo.entity;

import javax.persistence.*;
import java.time.Instant;
import java.util.Objects;

/**
 * @author Jerry
 * @since 2019-10-28 23:05
 **/
@Entity
public class PtActivity {
    private Integer id;
    private String name;
    private String area;
    private Instant endTime;

    public PtActivity() {
    }

    public PtActivity(Integer id, String name, String area, Instant endTime) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.endTime = endTime;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Basic
    public Instant getEndTime() {
        return endTime;
    }

    public void setEndTime(Instant endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PtActivity that = (PtActivity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(area, that.area) &&
                Objects.equals(endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, area, endTime);
    }
}
