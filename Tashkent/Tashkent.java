package HW26.Tashkent;

import HW26.Locality;

public class Tashkent extends Locality {
//    Бектемирский, Мирабадский, Хамзинский, Чиланзарский
//    Yangiobod кишлак
    private Bektemirskiy bektemirskiy;
    private Chilanzarskiy chilanzarskiy;
    private Hamzinskiy hamzinskiy;
    private Mirabadskiy mirabadskiy;
    public Tashkent(String head, double territory, long population) {
        super(head, territory, population);
    }

    public Bektemirskiy getBektemirskiy() {
        return bektemirskiy;
    }

    public void setBektemirskiy(Bektemirskiy bektemirskiy) {
        this.bektemirskiy = bektemirskiy;
    }

    public Chilanzarskiy getChilanzarskiy() {
        return chilanzarskiy;
    }

    public void setChilanzarskiy(Chilanzarskiy chilanzarskiy) {
        this.chilanzarskiy = chilanzarskiy;
    }

    public Hamzinskiy getHamzinskiy() {
        return hamzinskiy;
    }

    public void setHamzinskiy(Hamzinskiy hamzinskiy) {
        this.hamzinskiy = hamzinskiy;
    }

    public Mirabadskiy getMirabadskiy() {
        return mirabadskiy;
    }

    public void setMirabadskiy(Mirabadskiy mirabadskiy) {
        this.mirabadskiy = mirabadskiy;
    }
}
