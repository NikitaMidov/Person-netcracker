import java.util.Scanner;
/**
 * Класс <b>Starter</b> с полями <b>exit</b>
 * @author Никита Мидов
 */

public class Starter {
    Person person = new Person();
    Repository repository = new Repository();
    Scanner in = new Scanner(System.in);

    /** Поле выход*/
    boolean exit = false;

    /**
     * Функция запускающая меню для выбора нужных действий
     */
    public void run(){
        menu();
        while(!exit) {
            int menuInput = in.nextInt();
            in.nextLine();
            if (menuInput == 1) {
                Person newPerson = new Person();
                newPerson.setId(repository.size());
                System.out.print("Введите ФИО человека: ");
                String fullName = in.nextLine();
                newPerson.setFullName(fullName);
                System.out.print("Введите дату рождения человека: ");
                newPerson.setDateOfBirth(dateOfBirth());
                repository.add(newPerson);
            }
            else if (menuInput == 2) {
                System.out.print("Введите ID человека, которого вы хотите удалить из репозитория: ");
                repository.remove(in.nextInt());
            }
            else if (menuInput == 3) {
                if (repository.size() == 0) {
                    System.out.println("В репозитории 0 человек");
                }
                else {
                    for (int i = 0; i < repository.size(); i++) {
                        System.out.println("ID: " + repository.getPersons()[i].getId() + " ФИО: "
                                + repository.getPersons()[i].getFullName());
                    }
                }
            }
            else if(menuInput == 4){
                System.out.print("Введите ID человека, возраст которого вы хотите узнать: ");
                int tempId = in.nextInt();
                System.out.println("Возраст: " + repository.getPersons()[tempId].getAge());
            }
            else if(menuInput == 5){
                exit = true;
            }
        }

    }

    /**
     * Функция, которая показывает возможные действия в меню
     */
    private void menu(){
        System.out.println("1. Добавить человека в репозиторий");
        System.out.println("2. Удалить человека из репозитрия");
        System.out.println("3. Посмотреть список людей находящихся в репозитории");
        System.out.println("4. Посмотреть возраст человека");
        System.out.println("5. Выход");
    }

    /**
     * Фунция заполнения даты рождения консольным вводом в массив
     * @return intDate - возвращает дату рождения в виде массива
     */
    private int[] dateOfBirth(){
        String[] date = in.nextLine().split(" ");
        int[] intDate = new int[date.length];
        for (int i = 0; i < date.length; i++) {
            intDate[i] = Integer.parseInt(date[i]);
        }
        return intDate;
    }
}