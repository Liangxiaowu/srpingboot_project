package com.store.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class FanweVoiceOrderLogistics {

    @Id
    @GeneratedValue
    private Integer id;


    private Integer voice_box_order_id;

    private String company;

    private String number;

    private Integer status;

    private Date created_at;

    private Date updated_at;

    public FanweVoiceOrderLogistics(){}


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVoice_box_order_id() {
        return voice_box_order_id;
    }

    public void setVoice_box_order_id(Integer voice_box_order_id) {
        this.voice_box_order_id = voice_box_order_id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

}
