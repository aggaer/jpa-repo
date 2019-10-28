package com.bestore.jparepo.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author Jerry
 * @since 2019-10-28 23:05
 **/
@Entity
public class PtCollect {
    private Integer id;
    private Integer activityId;
    private String name;
    private Integer num;

    public PtCollect() {
    }

    public PtCollect(Integer id, Integer activityId, String name, Integer num) {
        this.id = id;
        this.activityId = activityId;
        this.name = name;
        this.num = num;
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
    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer avtivityId) {
        this.activityId = avtivityId;
    }

    @Basic
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PtCollect that = (PtCollect) o;
        return id.equals(that.id) &&
                Objects.equals(activityId, that.activityId) &&
                Objects.equals(name, that.name) &&
                Objects.equals(num, that.num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, activityId, name, num);
    }
}
