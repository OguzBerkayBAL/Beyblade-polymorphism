public class Draciel extends Beyblade {
    private String kutsalCanavar;

    public Draciel(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci()+" "+kutsalCanavar+ " i ortaya cikariyor...");
        System.out.println(getBeybladeci()+ " in Savunmasi : Kale Savunmasi ");
    }
}
