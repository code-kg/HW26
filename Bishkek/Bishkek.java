package HW26.Bishkek;

import HW26.Locality;

public class Bishkek extends Locality {
//    у города Бишкек есть четыре района (Ленинский, Октябрьский, Первомайский, Свердловский)
    private Leninskiy leninskiy;
    private Oktiabrskiy oktiabrskiy;
    private Pervomaiskiy pervomaiskiy;
    private Sverdlovskiy sverdlovskiy;

    public Bishkek(String head, double territory, int population) {
        super(head, territory, population);
    }

    public Bishkek(String head, double territory, long population, Leninskiy leninskiy, Oktiabrskiy oktiabrskiy, Pervomaiskiy pervomaiskiy, Sverdlovskiy sverdlovskiy) {
        super(head, territory, population);
        this.leninskiy = leninskiy;
        this.oktiabrskiy = oktiabrskiy;
        this.pervomaiskiy = pervomaiskiy;
        this.sverdlovskiy = sverdlovskiy;
    }

    public Leninskiy getLeninskiy() {
        return leninskiy;
    }

    public void setLeninskiy(Leninskiy leninskiy) {
        this.leninskiy = leninskiy;
    }

    public Oktiabrskiy getOktiabrskiy() {
        return oktiabrskiy;
    }

    public void setOktiabrskiy(Oktiabrskiy oktiabrskiy) {
        this.oktiabrskiy = oktiabrskiy;
    }

    public Pervomaiskiy getPervomaiskiy() {
        return pervomaiskiy;
    }

    public void setPervomaiskiy(Pervomaiskiy pervomaiskiy) {
        this.pervomaiskiy = pervomaiskiy;
    }

    public Sverdlovskiy getSverdlovskiy() {
        return sverdlovskiy;
    }

    public void setSverdlovskiy(Sverdlovskiy sverdlovskiy) {
        this.sverdlovskiy = sverdlovskiy;
    }
}
