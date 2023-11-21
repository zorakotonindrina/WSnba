package com.example.demo.Models;

public class Statistiques {
    DetailMatchs detail;
    int tpoints;
    int dponts;
    int lf;
    int pdp;
    int rd;
    int ro;
    
    public Statistiques() {
    }

    public Statistiques(DetailMatchs detail, int tpoints, int dponts, int lf, int pdp, int rd, int ro) {
        this.detail = detail;
        this.tpoints = tpoints;
        this.dponts = dponts;
        this.lf = lf;
        this.pdp = pdp;
        this.rd = rd;
        this.ro = ro;
    }

    public DetailMatchs getDetail() {
        return detail;
    }

    public void setDetail(DetailMatchs detail) {
        this.detail = detail;
    }

    public int getTpoints() {
        return tpoints;
    }

    public void setTpoints(int tpoints) {
        this.tpoints = tpoints;
    }

    public int getDponts() {
        return dponts;
    }

    public void setDponts(int dponts) {
        this.dponts = dponts;
    }

    public int getLf() {
        return lf;
    }

    public void setLf(int lf) {
        this.lf = lf;
    }

    public int getPdp() {
        return pdp;
    }

    public void setPdp(int pdp) {
        this.pdp = pdp;
    }

    public int getRd() {
        return rd;
    }

    public void setRd(int rd) {
        this.rd = rd;
    }

    public int getRo() {
        return ro;
    }

    public void setRo(int ro) {
        this.ro = ro;
    }

    // public Statistiques[] getstatistiques(){

    // }

                                
}
