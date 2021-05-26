package HomeWork7.Task3_Phone;

/*
3.Создать абстрактный класс телефон (у него метод
набор номера с реализацией (просто выводит в консоль что выполняется набор
телефона), а методы
- Операционная Система, - абстрактный
- Интерфейс Зарядки и абстрактный
- Магазин Приложений ---- абстрактный) у которого будет 2 наследника -
iOSSmartphone and AndroidSmartphone - они реализуют абстрактные методы
суперкласса
В классе SmartphoneTester создать ссылки на объекты телефонов и вывести в консоль
техническую информацию об устройстве с помощью геттеров.
 */
public abstract class Phone {



    public void numberDialing() {
        System.out.println("Phone is dialing the number");
    }

    abstract void operationalSystem();

    abstract void chargerInterface();

    abstract void applicationsStore();
}
