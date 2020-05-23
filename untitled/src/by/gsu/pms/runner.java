package by.gsu.pms;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class runner {
    private static Scanner scan;
    private static int x;
    private static int y;
    private static String search, s;

    public static String column(String str, int b) {
        for (int i = 0; i < b; i++) {
            if (str.length() < b) {
                str = str + " ";
            }
        }
        return str;
    }

    public static void main(String[] args) {
        int n;
        int action;

        String[] name_ = {"Игорь", "Виктор", "Михаил", "Генадий", "Анатолий", "Сергей", "Дмитрий", "Юрий", "Александр"};
        String name;
        String[] serName_ = {"Спицын", "Шурупин", "Кранч", "Шпак", "Долото", "Забияка", "Тарман", "Жулев", "Пчелов"};
        String serName;
        String[] midName_ = {"Викторович", "Генадьевич", "Александрович", "Леонидович", "Олегович", "Дмитриевич", "Юрьевич", "Евгеньевич", "Станиславович"};
        String midName;
        String[] Adress_ = {"Ленина 53", "Интернациональная 2", "Гагарина 8", "Гагарина 23", "Лесная 9", "Городская 14", "Дорожная 11", "Веселая 17", "Забавная 1"};
        String Adress;
        int Phone = 0;
        String[] diagnosis_ = {"Грипп", "Ветрянка", "Коронавирус", "Простуда", "Пневмония", "Лихорадка", "Язва", "Катаракта", "Гангрена"};
        String diagnosis;
        scan = new Scanner(System.in);
        System.out.print("Количество пациентов: ");
        n = scan.nextInt();
        Patient patient[] = new Patient[n];
        Random random = new Random();

        for (int j = 0; j < n; j++) {
            name = name_[random.nextInt(name_.length)];
            serName = serName_[random.nextInt(serName_.length)];
            midName = midName_[random.nextInt(midName_.length)];
            Adress = Adress_[random.nextInt(Adress_.length)];
            diagnosis = diagnosis_[random.nextInt(diagnosis_.length)];
            Phone = 10000 + random.nextInt(9999);
            patient[j] = new Patient(column(name, 12), column(serName, 10), column(midName, 12), column(Adress, 12), column(diagnosis, 10), Phone, 1000 + j, j);
        }

        for (int i = 0; i < n; i++) {
            patient[i].ShowInfo();
        }

        System.out.println("Выберете фильтр для списка:");
        System.out.println("1: Поиск по номеру карты");
        System.out.println("2: Поиск по диагнозу");
        action = scan.nextInt();
        scan.nextLine();
        switch (action) {
            case 1:
                System.out.println("Укажите интервал номеров карт: ");
                x = scan.nextInt();
                y = scan.nextInt();
                for (int l = 0; l < n; l++) {
                    if ((patient[l].getCard() >= x) && (patient[l].getCard()) <= y) {
                        patient[l].ShowInfo();
                    }
                }
            break;
            case 2:
                System.out.print("Введите диагноз для поиска:");
                search=scan.nextLine();
                for (int k=0;k<n;k++){
                    s=patient[k].getDiagnosis();
                    if(s.trim().equalsIgnoreCase(search.trim())==true){
                        patient[k].ShowInfo();
                    }
                }
             break;
        }
    }
}
