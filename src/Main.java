//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*

Öğrenci ekleme,
Öğrenci listeleme,
Öğrenci silme,
Hata yönetimi(try-catch),
Konsoldan kullanıcı etkileşimi(scanner)

*/

import model.School;
import service.StudentService;

public class Main {
    public static void main(String[] args) {
        School school = new School("Istanbul Tech School");
        StudentService service = new StudentService(school);
        service.showMenu();
    }
}
