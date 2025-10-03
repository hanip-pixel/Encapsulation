public class AkunBank {
    private int saldo;

    // Constructor
    public AkunBank(int saldo) {
        this.saldo = saldo;
    }

    // Setter
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    // Getter
    public int getSaldo() {
        return saldo;
    }

    // Method menabung
    public void deposit(int jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Berhasil menabung Rp" + jumlah);
        } else {
            System.out.println("Jumlah setoran tidak valid!");
        }
    }

    // Method tarik tunai dengan minimal saldo mengendap Rp10.000
    public void tarik(int jumlah) {
        if (jumlah > 0) {
            if (saldo - jumlah >= 10000) {
                saldo -= jumlah;
                System.out.println("Berhasil tarik tunai Rp" + jumlah);
            } else {
                System.out.println("Gagal tarik tunai. Minimal saldo tersisa Rp10000.");
            }
        } else {
            System.out.println("Jumlah penarikan tidak valid!");
        }
    }
}