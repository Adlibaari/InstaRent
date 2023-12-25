
import java.util.Date;

/**
 *
 * @author nadaj
 */
public class Penyewaan {
    private int id_penyewaan;
    private Customer customer;
    private Kendaraan kendaraan;
    private Pembayaran pembayaran;
    private Date mulaiSewa;
    private Date selesaiSewa;
    
    public Penyewaan(int id_penyewaan, Customer customer, Kendaraan kendaraan, Pembayaran pembayaran, Date mulaiSewa, Date selesaiSewa){
        this.id_penyewaan = id_penyewaan;
        this.customer = customer;
        this.kendaraan = kendaraan;
        this.pembayaran = pembayaran;
        this.mulaiSewa = mulaiSewa;
        this.selesaiSewa = selesaiSewa;
                
    }

    public int getId_penyewaan() {
        return id_penyewaan;
    }

    public void setId_penyewaan(int id_penyewaan) {
        this.id_penyewaan = id_penyewaan;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public Pembayaran getPembayaran() {
        return pembayaran;
    }

    public void setPembayaran(Pembayaran pembayaran) {
        this.pembayaran = pembayaran;
    }

    public Date getMulaiSewa() {
        return mulaiSewa;
    }

    public void setMulaiSewa(Date mulaiSewa) {
        this.mulaiSewa = mulaiSewa;
    }

    public Date getSelesaiSewa() {
        return selesaiSewa;
    }

    public void setSelesaiSewa(Date selesaiSewa) {
        this.selesaiSewa = selesaiSewa;
    }
    
}

