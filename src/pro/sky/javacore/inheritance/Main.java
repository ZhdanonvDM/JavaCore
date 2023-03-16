package pro.sky.javacore.inheritance;

public class Main {
    public static void main(String[] args) {
        
//Создание базы студентов
       StudentGryffindor [] studentsGryffindor = {
               new StudentGryffindor("Harry Potter", 96, 49, 57, 81, 47),
               new StudentGryffindor("Hermione Granger", 76, 69, 73, 78, 59),
               new StudentGryffindor("Ron Weasley", 67, 78, 81, 63, 39)
       };
       StudentHufflepuff [] studentsHufflepuff = {
               new StudentHufflepuff("Zacharias Smith", 89, 80, 61, 31, 49),
               new StudentHufflepuff("Cedric Diggory", 10, 74, 83, 16, 37),
               new StudentHufflepuff("Justin Finch-Fletchley", 32, 54, 25, 42, 36),
       };
        StudentRavenclaw [] studentsRavenclaws = {
                new StudentRavenclaw("Zhou Chang", 35, 44, 47, 97, 41, 78),
                new StudentRavenclaw("Padma Patil", 14, 13, 41, 23, 23, 97),
                new StudentRavenclaw("Marcus Belby", 66, 18, 44, 90, 50, 45),
        };
       StudentSlytherin [] studentsSlytherin = {
               new StudentSlytherin("Draco Malfoy", 36, 68, 26, 59, 61, 66, 100),
               new StudentSlytherin("Graham Montague", 12, 53, 67, 40, 79, 62, 78),
               new StudentSlytherin("Gregory Goyle", 76, 26, 48, 45, 53, 48, 22),
        };
//Тестирование методов, которые выводят на экран описание студента
        System.out.println(studentsGryffindor[0].toString());
        System.out.println(studentsHufflepuff[0].toString());
        System.out.println(studentsRavenclaws[0].toString());
        System.out.println(studentsSlytherin[0].toString());

//Тестирование методов, по одному для каждого факультета, которые сравнивают между собой учеников одного факультета по свойствам
        studentGryffindorComparison(studentsGryffindor[0], studentsGryffindor[1]);
        studentHufflepuffComparison(studentsHufflepuff[0], studentsHufflepuff[1]);
        studentRavenclawComparison(studentsRavenclaws[0], studentsRavenclaws[1]);
        studentSlytherinComparison(studentsSlytherin[0], studentsSlytherin[1]);

// Тестирование метода, который сравнивает двух любых учеников Хогвартса по силе магии и расстоянию трансгрессии
        StudentHogwarts.studentComparison(studentsRavenclaws[0], studentsSlytherin[1]);
    }
    public static void studentSlytherinComparison (StudentSlytherin ss1, StudentSlytherin ss2) {
        if (ss1.totalScore() > ss2.totalScore()) {
            System.out.println(ss1.getName() + " лучший Слизеринец, чем " + ss2.getName());
        } else {System.out.println(ss2.getName() + " лучший Слизеринец, чем " + ss1.getName());}
    }
    public static void studentRavenclawComparison (StudentRavenclaw sr1, StudentRavenclaw sr2) {
        if (sr1.totalScore() > sr2.totalScore()) {
            System.out.println(sr1.getName() + " лучший Когтевранец, чем " + sr2.getName());
        } else {System.out.println(sr2.getName() + " лучший Когтевранец,, чем " + sr1.getName());}
    }
    public static void studentHufflepuffComparison (StudentHufflepuff sh1, StudentHufflepuff sh2) {
        if (sh1.totalScore() > sh2.totalScore()) {
            System.out.println(sh1.getName() + " лучший Пуффендуец, чем " + sh2.getName());
        } else {System.out.println(sh2.getName() + " лучший Пуффендуец, чем " + sh1.getName());}
    }
    public static void studentGryffindorComparison (StudentGryffindor sg1, StudentGryffindor sg2) {
        if (sg1.totalScore() > sg2.totalScore()) {
            System.out.println(sg1.getName() + " лучший Гриффиндорец, чем " + sg2.getName());
        } else {System.out.println(sg2.getName() + " лучший Гриффиндорец, чем " + sg1.getName());}
    }
}

