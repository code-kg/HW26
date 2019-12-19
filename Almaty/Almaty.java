package HW26.Almaty;

import HW26.Locality;

public class Almaty extends Locality {
    //    Алатауский, Алмалинский, Жетысуский, Медеуский
    private Alatauskiy alatauskiy;
    private Almalinskiy almalinskiy;
    private Jetysuiskiy jetysuiskiy;
    private Medeuskiy medeuskiy;

    public Almaty(String head, double territory, long population) {
        super(head, territory, population);
    }

    public Alatauskiy getAlatauskiy() {
        return alatauskiy;
    }

    public void setAlatauskiy(Alatauskiy alatauskiy) {
        this.alatauskiy = alatauskiy;
    }

    public Almalinskiy getAlmalinskiy() {
        return almalinskiy;
    }

    public void setAlmalinskiy(Almalinskiy almalinskiy) {
        this.almalinskiy = almalinskiy;
    }

    public Jetysuiskiy getJetysuiskiy() {
        return jetysuiskiy;
    }

    public void setJetysuiskiy(Jetysuiskiy jetysuiskiy) {
        this.jetysuiskiy = jetysuiskiy;
    }

    public Medeuskiy getMedeuskiy() {
        return medeuskiy;
    }

    public void setMedeuskiy(Medeuskiy medeuskiy) {
        this.medeuskiy = medeuskiy;
    }
}

