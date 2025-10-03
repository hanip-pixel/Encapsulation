public class AkunBankTest {
    public static void main(String[] args) {
        AkunBank akun1 = new AkunBank(20000);
        AkunBank akun2 = new AkunBank(20000);
        AkunBank akun3 = new AkunBank(20000);

        System.out.println("Saldo awal: Rp" + akun1.getSaldo());
        System.out.println("Saldo awal: Rp" + akun2.getSaldo());
        System.out.println("Saldo awal: Rp" + akun3.getSaldo());

        // Menabung
        akun1.deposit(35000);
        System.out.println("Saldo setelah menabung: Rp" + akun1.getSaldo());
        akun2.deposit(35000);
        System.out.println("Saldo setelah menabung: Rp" + akun2.getSaldo());
        akun3.deposit(35000);
        System.out.println("Saldo setelah menabung: Rp" + akun3.getSaldo());

        // Tarik tunai berhasil
        akun1.tarik(20000);
        System.out.println("Saldo setelah tarik tunai: Rp" + akun1.getSaldo());
        akun2.tarik(20000);
        System.out.println("Saldo setelah tarik tunai: Rp" + akun2.getSaldo());
        akun3.tarik(20000);
        System.out.println("Saldo setelah tarik tunai: Rp" + akun3.getSaldo());

        // Tarik tunai gagal (minimal saldo Rp10000)
        akun1.tarik(30000);
        System.out.println("Saldo akhir: Rp" + akun1.getSaldo());
        akun2.tarik(30000);
        System.out.println("Saldo akhir: Rp" + akun2.getSaldo());
        akun3.tarik(30000);
        System.out.println("Saldo akhir: Rp" + akun3.getSaldo());
    }
}