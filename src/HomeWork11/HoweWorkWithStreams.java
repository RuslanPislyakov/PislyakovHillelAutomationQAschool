package HomeWork11;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HoweWorkWithStreams {


    public static void main(String[] args) {

        List<Computer> computerList = ComputerCollection.computersList();

        // 1. Из коллекции компьютеров computersList() создать новую коллекцию с только “Windows”
        List<Computer> windowsComputers = computerList.stream().filter(x -> x.getOS() == "Windows").collect(Collectors.toList());
        System.out.println("1. Из коллекции компьютеров computersList() создать новую коллекцию с только Windows");
        windowsComputers.forEach(computer -> System.out.println(computer.toString()));
        System.out.println();

        // 2. Из коллекции компьютеров computersList() вернуть новую коллекцию из 2-х компютеров с “SSD” жестким диском
        List<Computer> ssdComputers = computerList.stream().filter(x -> x.getStorage().getStorageType() == "SSD").limit(2).collect(Collectors.toList());
        System.out.println("2. Из коллекции компьютеров computersList() вернуть новую коллекцию из 2-х компютеров с “SSD” жестким диском");
        ssdComputers.forEach(computer -> System.out.println(computer.toString()));
        System.out.println();

        // 3. Из коллекции компьютеров computersList() вернуть коллекцию цен
        List<Double> priceList = computerList.stream().map(Computer::getPrice).collect(Collectors.toList());
        System.out.println("3. Из коллекции компьютеров computersList() вернуть коллекцию цен");
        priceList.forEach(System.out::println);
        System.out.println();

        //4. Отсортировать по цене и вернуть третий снизу по минимальной цене (используя skip и findFirst)
        Computer complicatedSortedComp = computerList.stream().sorted(Comparator.comparingDouble(Computer::getPrice)).skip(2).findFirst().get();
        System.out.println("4. Отсортировать по цене и вернуть третий снизу по минимальной цене (используя skip и findFirst)");
        System.out.println(complicatedSortedComp.toString());
        System.out.println();

        //5. Из коллекции компьютеров computersList() вернуть Map<Integer, Computer> где ключ будет id.
        Map<Integer, Computer> mapComputer = computerList.stream().collect(Collectors.toMap(Computer::getId, computer -> computer));
        System.out.println("5. Из коллекции компьютеров computersList() вернуть Map<Integer, Computer> где ключ будет id.");
        mapComputer.forEach((k, v) -> System.out.println(k + "----" + v));
        System.out.println();

        //6. Написать boolean - который проверяет что в коллекции нет компьютера с ОС “DOS” (noneMatch)
        boolean dosIsNotPresent = computerList.stream().noneMatch(computer -> computer.getOS().equals("DOS"));
        System.out.println("6. Написать boolean - который проверяет что в коллекции нет компьютера с ОС “DOS” (noneMatch)");
        System.out.println("dosIsNotPresent: " + dosIsNotPresent);
        System.out.println();

        //7. Написать boolean - который проверяет что в коллекции есть компьютер с ОС “MacOS” (anyMatch)
        boolean isMacOsPresent = computerList.stream().anyMatch(computer -> computer.getOS().equals("MacOS"));
        System.out.println("7. Написать boolean - который проверяет что в коллекции есть компьютер с ОС “MacOS” (anyMatch)");
        System.out.println("isMacOsPresent: " + isMacOsPresent);

    }
}
