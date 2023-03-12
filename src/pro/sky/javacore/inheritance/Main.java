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
        System.out.println(studentsGryffindor[0].studentDescription());
        System.out.println(studentsHufflepuff[0].studentDescription());
        System.out.println(studentsRavenclaws[0].studentDescription());
        System.out.println(studentsSlytherin[0].studentDescription());

//Тестирование методов, по одному для каждого факультета, которые сравнивают между собой учеников одного факультета по свойствам
        StudentGryffindor.studentComparison(studentsGryffindor[0], studentsGryffindor[1]);
        StudentHufflepuff.studentComparison(studentsHufflepuff[0], studentsHufflepuff[1]);
        StudentRavenclaw.studentComparison(studentsRavenclaws[0], studentsRavenclaws[1]);
        StudentSlytherin.studentComparison(studentsSlytherin[0], studentsSlytherin[1]);

// Тестирование метода, который сравнивает двух любых учеников Хогвартса по силе магии и расстоянию трансгрессии
        StudentHogwarts.studentComparison(studentsRavenclaws[0], studentsSlytherin[1]);
    }
}

