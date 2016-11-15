package duongnguyenminh.com.bai2;

/**
 * Created by Duong on 28/03/2016.
 */
public class Album {
    int hinhanh;
    String tenAlbum;

    public Album(int hinhanh, String tenAlbum, String ngayPhatHang) {
        this.hinhanh = hinhanh;
        this.tenAlbum = tenAlbum;
        this.ngayPhatHang = ngayPhatHang;
    }

    String ngayPhatHang;

    public int getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(int hinhanh) {
        this.hinhanh = hinhanh;
    }

    public String getTenAlbum() {
        return tenAlbum;
    }

    public void setTenAlbum(String tenAlbum) {
        this.tenAlbum = tenAlbum;
    }

    public String getNgayPhatHang() {
        return ngayPhatHang;
    }

    public void setNgayPhatHang(String ngayPhatHang) {
        this.ngayPhatHang = ngayPhatHang;
    }
}
