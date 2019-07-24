package com.prototype.ditenun.ditenunuiprototype.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class StockImage extends RealmObject {
    @PrimaryKey
    private int id;
    private String name;
    private byte[] imageBitmap;

    public StockImage() { }

    public StockImage(String name, byte[] imageBitmap) {
        this.name = name;
        this.imageBitmap = imageBitmap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String namaMotif) {
        this.name = namaMotif;
    }

    public byte[] getBytes() {
        return imageBitmap;
    }

    public void setBytes(byte[] imageBitmap) {
        this.imageBitmap = imageBitmap;
    }
}
