import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String bldgname; //ビルの名前

        System.out.println("Please input information.");
        Scanner scan = new Scanner(System.in);

        bldgname = scan.nextLine(); //ビルの名前 入力

        System.out.println(bldgname);
        System.out.println();

        OpenCsv openCsv = new OpenCsv();
        ArrayList<ArrayList<String>> list = openCsv.openCsv(bldgname); //CSVデータ(ファイル名：建物名)生成

/*        for (ArrayList<String> record : list) {
            System.out.print(record.get(0));
            System.out.print(",");
            System.out.print(record.get(2));
            System.out.println();
        } System.out.println(); */

        returnPwd rtn = new returnPwd();

        for (ArrayList<String> record : list) {
            String pwd = rtn.returnPwd(record.get(0), record.get(1), record.get(2), record.get(3));
            record.add(4, pwd);

            System.out.println(record);
        } System.out.println();

        selenium_test.seleniumTest();

    }
}