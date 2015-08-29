package Lecture3.Task2;

/**
 * Created by Евгений on 29.08.2015.
 */
public class Employee {

//    Класс сотрудники это отдельный класс может быть...либо можно хард кодом накидать сразу в лист
//    По поводу задания с мапами и сотрудниками...вывести кол-во сотрудников в отделе;
//    Выбрать по инн(или чему-нибудь иному) И тд

    String fullName,passNumber;
    long iNN;

    public Employee(String fullName, String passNumber, long iNN){
        this.fullName = fullName;
        this.passNumber = passNumber;
        this.iNN = iNN;
    }


}
