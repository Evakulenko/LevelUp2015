package Task1;

import java.io.*;

/**
 * Created by ������� on 27.08.2015.
 */
public class Main {

//    В файле текст (500+ слов). Считать каждое слово в тексте (предположим что слова разделены пробелом),
//    и класть эти слова в мапу (ключ - слово), значением мапы будет количество повторений данных слов..
//    После считки всего файла - вывести в консоль все слова, и сколько раз они встречались. (Т.е. если
//    слово уже есть в мапе - значение инкриментируется на 1.)

    public static void main(String[] args) throws IOException{
        File file = new File("D:\\Java\\LevelUp2015\\src\\Task1\\Task");
//      FileInputStream iR = new FileInputStream(file);
        BufferedReader reader = new BufferedReader(new FileReader(file));

        System.out.println(reader.readLine());
        System.out.println(reader.readLine());
        System.out.println(reader.readLine());
        System.out.println(reader.readLine());
    }
}
