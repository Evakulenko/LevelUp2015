package Lecture3.Task2;

import java.util.*;

/**
 * Created by ������� on 29.08.2015.
 */
public class Main {
//    1. ���� ����������, ���� ������, � ������� ���������� ��� ��������  ����� ������� ���� + ����������+ ���������
//    ������ ���� ����� �����, ����� - ���� �����������   2. �� ��������.. ������� ������...��� ���������
//
//    �.�. � ����� ���������� �� ����� �������� ���� ���, �������.������, ��� ....
//    � ����� ���������� � ����... ��������� �� ������-���� ��������� ���������, ����������� � �.�.
//
//    �������� ����: �����������  �������� [������� �.�., ������� �.�.]
//    ��������-����,� ��� ������������ ���������� Map<String, List<Employee>>���-�� ��� ��������

    public static void main(String[] args) {
        HashMap<String, ArrayList<Employee>> hashMap = new HashMap<>();

        ArrayList<Employee> list1 = new ArrayList<Employee>();
        list1.add(new Employee("Ivanov V V ","AE894456", 45562366));
        list1.add(new Employee("Petrov P.P.", "AE872836", 54421665));
        list1.add(new Employee("Vasyl`ev Nikolay Nikolayevich ", "AE894456", 54545435));
        hashMap.put("salesDepartment", list1);

        ArrayList<Employee> list2 = new ArrayList<Employee>();
        list2.add(new Employee("Lutsenko Yurii Yurievich","AE894343", 80987989));
        list2.add(new Employee("Yaresko Natalia Andreevna","AE894565", 879879879));
        list2.add(new Employee("Yatsenyk Arsinii Petrovich","AE894268", 89789898));
        hashMap.put("salesDepartment", list2);

        ArrayList<Employee> list3 = new ArrayList<Employee>();
        list3.add(new Employee("Gontareva Olga Olegovna","AE894353", 67676576));
        Employee emloyee8 = new Employee("Poroshenko Petr Petrovish ","AE894375", 454646464);
        Employee emloyee9 = new Employee("Zhukov Zkuk Zhuk ","AE894452", 399393939);
        hashMap.put("financialDepartment", list3);

        }

}
