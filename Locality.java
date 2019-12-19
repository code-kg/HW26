package HW26;

public abstract class Locality {
//    абстрактный класс населенный пункт "Locality" в моем задании состоит из трех свойств(глава,территория и населенеие)
//    от него наследуются непосредственно три города и два села которые находятся в отдельных папках
//    и далее создал районы которые находятся в городах, там тоже есть свои главы районов "акимы"
    private String head;
    private double territory;
    private long population;

    public Locality(String head, double territory, long population) {
        this.head = head;
        this.territory = territory;
        this.population = population;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public double getTerritory() {
        return territory;
    }

    public void setTerritory(double territory) {
        this.territory = territory;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }
}
