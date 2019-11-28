package com.store.bean;


import com.alibaba.fastjson.annotation.JSONField;

public class Invoice {


    private Integer sub;
    private String nbf;
    private String prv;
    private Integer party_id;
    private String iss;
    private String exp;
    private String iat;
    private String jti;

    @JSONField(name = "sub")
    public Integer getSub() {
        return sub;
    }
    @JSONField(name = "sub")
    public void setSub(Integer sub) {
        this.sub = sub;
    }
    @JSONField(name = "nbf")
    public String getNbf() {
        return nbf;
    }
    @JSONField(name = "nbf")
    public void setNbf(String nbf) {
        this.nbf = nbf;
    }
    @JSONField(name = "prv")
    public String getPrv() {
        return prv;
    }
    @JSONField(name = "prv")
    public void setPrv(String prv) {
        this.prv = prv;
    }
    @JSONField(name = "party_id")
    public Integer getParty_id() {
        return party_id;
    }
    @JSONField(name = "party_id")
    public void setParty_id(Integer party_id) {
        this.party_id = party_id;
    }
    @JSONField(name = "iss")
    public String getIss() {
        return iss;
    }
    @JSONField(name = "iss")
    public void setIss(String iss) {
        this.iss = iss;
    }
    @JSONField(name = "exp")
    public String getExp() {
        return exp;
    }
    @JSONField(name = "exp")
    public void setExp(String exp) {
        this.exp = exp;
    }
    @JSONField(name = "iat")
    public String getIat() {
        return iat;
    }
    @JSONField(name = "iat")
    public void setIat(String iat) {
        this.iat = iat;
    }
    @JSONField(name = "jti")
    public String getJti() {
        return jti;
    }
    @JSONField(name = "jti")
    public void setJti(String jti) {
        this.jti = jti;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "sub=" + sub +
                ", nbf='" + nbf + '\'' +
                ", prv='" + prv + '\'' +
                ", party_id=" + party_id +
                ", iss='" + iss + '\'' +
                ", exp='" + exp + '\'' +
                ", iat='" + iat + '\'' +
                ", jti='" + jti + '\'' +
                '}';
    }
}
