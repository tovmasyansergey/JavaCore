package homework.homework20.fileutil;

import java.io.File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileUtil {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws IOException {
       // fileSearch();
       // contentSearch();
       //intSizeOfPackage();
        createFileWithContent();
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch() {
        String path = scanner.nextLine();
        String fileName = scanner.nextLine();
        String mmm = "C:\\Users\\user1\\IdeaProjects\\JavaCore\\src\\" + path + "\\" + fileName;
        File file1 = new File(mmm);
        System.out.println(file1.isFile());

    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() {
        String path = scanner.nextLine();
        String keyword = scanner.nextLine();
        String mmm = "C:\\Users\\user1\\IdeaProjects\\JavaCore\\src\\" + path + "\\" + keyword + ".txt.java";
        File file = new File(mmm);
        if (file.isFile()) {
            System.out.println(keyword + ".txt");

        }

        //այս մեթոդը պետք է սքաններով վերցնի երկու string.
        // 1 - txtPath txt ֆայլի փաթը
        // 2 - keyword - ինչ որ բառ
        // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
       // static void findLines () {

        }

        //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
        // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
        // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
        static void printSizeOfPackage () {

            String path = scanner.nextLine();
            File file = new File( "C:\\Users\\user1\\IdeaProjects\\JavaCore\\src\\" + path );
            String[] list = file.list();
            int length = list.length;
            System.out.println(length);
        }

        //այս մեթոդը պետք է սքաններով վերցնի երեք string.
        // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
        // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
        // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
        // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
        static void createFileWithContent () throws IOException {
            String path = scanner.nextLine();
            String fileName = scanner.nextLine();
            String nn = "C:\\Users\\user1\\IdeaProjects\\JavaCore\\src\\" + path +"\\"+ fileName;
            File file = new File(nn);
            file.createNewFile();
        }

    }
