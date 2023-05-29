package KiemTraTuan8Block2.Bai2;

import java.io.*;

public class TestIOText {
    public static void main(String[] args) {
        String[] arraySong = {"1", "2", "3", "4", "5"};
        String fileName = "list_song.txt";

        try {
            // Ghi dữ liệu vào file bằng FileWriter
            writeDataToFileWithFileWriter(arraySong, fileName);
            System.out.println("Đã ghi dữ liệu vào file " + fileName + " bằng FileWriter!");

            // Đọc dữ liệu từ file bằng FileReader
            readDataFromFileWithFileReader(fileName);
            System.out.println("Đã đọc dữ liệu từ file " + fileName + " bằng FileReader!");

            // Ghi dữ liệu vào file bằng BufferedWriter
            writeDataToFileWithBufferedWriter(arraySong, fileName);
            System.out.println("Đã ghi dữ liệu vào file " + fileName + " bằng BufferedWriter!");

            // Đọc dữ liệu từ file bằng BufferedReader
            readDataFromFileWithBufferedReader(fileName);
            System.out.println("Đã đọc dữ liệu từ file " + fileName + " bằng BufferedReader!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeDataToFileWithFileWriter(String[] arr, String fileName) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        for (String song : arr) {
            fileWriter.write(song + "\n");
        }
        fileWriter.close();
    }
//Phương thức writeDataToFileWithFileWriter() sử dụng FileWriter để ghi từng bài hát trong mảng ArraySong vào tệp trong đó:
//
//Tham số mảng là một chuỗi các bài hát cần ghi vào tệp.
//Tham số fileName là tên tệp cần ghi dữ liệu.
//FileWriter được tạo ra với tên tệp tham số, sử dụng for-each để ghi từng bài hát vào tệp, kết thúc bằng "lưới mới (dòng cấp dữ liệu)" để xuống dòng mỗi lần ghi.
// fileWriter.close() được gọi để đóng luồng ghi dữ liệu vào tệp.
    public static void readDataFromFileWithFileReader(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        int c;
        while ((c = fileReader.read()) != -1) {
            System.out.print((char) c);
        }
        fileReader.close();
    }
//    Phương thức readDataFromFileWithFileReader() sử dụng FileReader để đọc dữ liệu từ tệp trong đó:
//
//    Tham số fileName là tên tệp cần đọc dữ liệu.
//    FileReader được tạo ra với tham số fileName, sử dụng hàm read() để đọc các ký tự trong tệp rồi đưa từng ký tự đó ra màn hình.
//    Hàm read() return -1 if read all file tin.
//    fileReader.close() được gọi để đóng luồng đọc dữ liệu từ tệp.

    public static void writeDataToFileWithBufferedWriter(String[] arr, String fileName) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        for (String song : arr) {
            bufferedWriter.write(song);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
//Phương thức writeDataToFileWithBufferedWriter() sử dụng BufferedWriter để ghi từng bài hát trong mảng ArraySong vào file trong đó:
//
//Tham số mảng là một chuỗi các bài hát cần ghi vào tệp.
//Tham số fileName là tên tệp cần ghi dữ liệu.
//BufferedWriter được tạo ra với tham số FileWriter(fileName), sử dụng for-each để ghi từng bài hát vào tệp, kết thúc bằng hàm newLine() để xuống dòng mỗi lần ghi.
// bufferedWriter.close() được gọi để đóng luồng ghi dữ liệu vào tệp.
    public static void readDataFromFileWithBufferedReader(String fileName) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
    }
//    Phương thức readDataFromFileWithBufferedReader() sử dụng BufferedReader để đọc dữ liệu từ tệp trong đó:
//
//Tham số fileName là tên tệp cần đọc dữ liệu.
//BufferedReader được tạo ra với tham số FileReader(fileName), đọc lần lượt từng dòng (dòng) của tệp bằng hàm readLine(), sau đó trong dòng đó ra màn hình.
//Hàm readLine() return value null if read hết file tin.
// bufferedReader.close() được gọi để đóng luồng đọc dữ liệu từ tệp.
}
