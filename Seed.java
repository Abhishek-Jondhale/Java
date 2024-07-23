class Seed {
    float acres;
    float hector;
    int seedGm = 23;
    int seedForOneAcres = seedGm * 2;
    float seedForLand;

    float totalLand() {
        acres = hector * 2.471f;
        return acres;
    }

    float totalGrams() {
        seedForLand = seedForOneAcres * acres;
        return seedForLand;
    }

    float rate() {
        float amount = seedForLand * 12.35f;
        return amount;
    }

    public static void main(String args[]) {
        System.out.println("Process of calculation has Started :)");
        Seed farm = new Seed();
        farm.hector = 10.15f;
        System.out.println("Total land in Acres is : " + farm.totalLand() + " Acres");
        System.out.println("Total seed for land in gram : " + farm.totalGrams() + " gm");
        System.out.println("Total Amount of Seed of whole land in rupees : " + farm.rate() + " Rs");
    }
}
