package HW26;

import HW26.Almaty.*;
import HW26.Bishkek.*;
import HW26.Tashkent.*;
import HW26.Villages.Bektobe;
import HW26.Villages.Yangiobod;

public class Main {
    Locality bishkek = new Bishkek("Head of Bishkek", 160.1,1042300);
    Bishkek leninskiy = new Bishkek("Head of Leninskiy", 59.93, 211626);
    Bishkek oktiabrskiy = new Bishkek("Head of Oktiabrskiy", 33.25, 242382);
    Bishkek pervomaiskiy = new Bishkek("Head of Pervomaiskiy", 31.75, 175894);
    Bishkek sverdlovskiy = new Bishkek("Head of Sverdlovskiy", 33.40, 235801);

    Locality almaty = new Almaty("Head of Almaty", 339.1, 2039376);;
    Almaty alatauskiy = new Almaty("Head of Alatauskiy", 75.67, 158300);
    Almaty almalinskiy = new Almaty("Head of Almalinksiy", 18.25, 200408);
    Almaty jetysuiskiy = new Almaty("Head of Jetisuiskiy", 34.5, 309478);
    Almaty medeuskiy = new Almaty("Head of Medeuskiy", 93.6, 173200);

    Locality tashkent = new Tashkent("Head of Tashkent", 334.8, 2538400);
    Tashkent bektemirskiy = new Tashkent("Head of Bektemirskiy", 21.39, 31500);
    Tashkent chilanzarskiy = new Tashkent("Head of Chilanzarskiy", 30.43, 223300);
    Tashkent hamzinskiy = new Tashkent("Head of Hamzinskiy", 35.16, 220342);
    Tashkent mirabadskiy = new Tashkent("Head of Mirabadskiy", 16.73, 130653);

    Locality bektobe = new Bektobe("Head of Bektobe", 3.1, 1482);
    Locality yangiobod = new Yangiobod("Head of Yangiobod", 6.2, 10000);


//    Сделать поиск по руководителям.




//    Задача B. Вопросы и Ответы

//    1. Что такое модификатор abstract и зачем он нам?
//       Абстрактный модификатор это расширение для класса и объекта который служит базой при наследовании.

//    2. К каким элементам можно применять abstract?
//       Абстраткными могут быть классы и объекты

//    3. Объясните применение abstract для методов.
//       Абстрактный класс может содержать абстрактные методы. Нельзя объявлять абстрактные конструкторы или абстрактные статические методы.
//       Абстрактным называется метод, который не имеет реализации в данном классе

//    4. Приведите примеры реального мира, которые теоретически следовало бы создать abstract в мире ООП.
//       Абстрактным может являтся предмет который служит базой: например слово "Машина", далее "человек" и т.д.

//    5. Объясните применение abstract для классов.
//       Некоторые или все члены абстрактного класса могут оставаться нереализованными, их реализацию должен обеспечить класс потомок.
}
