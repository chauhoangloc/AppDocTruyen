package com.example.apptruyen.TruyenTranh;

public class TruyenTranh {
    private String nameT;
    private String tenChapter;
    private String LinkAnh;
    private String loaiTruyen;

    public TruyenTranh(){

    }
    public TruyenTranh(String nameT,String tenChapter,String linkAnh){
        this.nameT=nameT;
        this.tenChapter=tenChapter;
        LinkAnh=linkAnh;
    }
    public String getNameT() {
        return nameT;
    }

    public void setNameT(String nameT) {
        this.nameT = nameT;
    }

    public String getTenChapter() {
        return tenChapter;
    }

    public void setTenChapter(String tenChapter) {
        this.tenChapter = tenChapter;
    }

    public String getLinkAnh() {
        return LinkAnh;
    }

    public void setLinkAnh(String linkAnh) {
        LinkAnh = linkAnh;
    }

    public String getLoaiTruyen() {
        return loaiTruyen;
    }

    public void setLoaiTruyen(String loaiTruyen) {
        this.loaiTruyen = loaiTruyen;
    }
}
