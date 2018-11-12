/**
 * Класс <b>Repository</b> с полями <b>persons</b> и <b>numberOfPersons</b>
 * @author Никита Мидов
 */

public class Repository {
    /** Поле, которое хранит объекты людей в репозитории*/
    private Person[] persons = new Person[10];

    /** Поле количество людей в репозитории*/
    private int numberOfPersons = 0;

    /**
     * Функция получения значения поля {@link Repository#persons}
     * @return возвращает объект человека
     */
    public Person[] getPersons() {
        return persons;
    }

    /**
     * Функция добавления человека в репозиторий {@link Repository#persons}
     * @param person - человек
     */
    public void add (Person person){
        if(persons.length - 1 == numberOfPersons){
            resize(persons.length*2);
        }
        persons[numberOfPersons] = person;
        numberOfPersons++;
    }

    /**
     * Функция расширения репозитория {@link Repository#persons}
     * @param newLenght - новый размер репозитория
     */
    private void resize(int newLenght){
        Person[] newPersons = new Person[newLenght];
        System.arraycopy(persons, 0, newPersons, 0, numberOfPersons);
        persons = newPersons;
    }

    /**
     * Функция получения значения поля {@link Repository#numberOfPersons}
     * @return возвращает количество людей в репозитории
     */
    public int size(){
        return numberOfPersons;
    }

    /**
     * Функция удаления человека из репозитория {@link Repository#persons}
     * @param id - ID человека, которого нужно удалить
     */
    public void remove(int id){
        int position = id;
        for (int i = position; i <numberOfPersons ; i++) {
            persons[i] = persons[i+1];
        }
        persons[numberOfPersons] = null;
        numberOfPersons--;
    }



}