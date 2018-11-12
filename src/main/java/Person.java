import org.joda.time.LocalDate;
import org.joda.time.Years;

/**
 * Класс <b>Person</b> с полями <b>fullName</b>, <b>dateOfBirth</b>, <b>age</b> и <b>id</b>.
 * @author Никита Мидов
 */

public class Person {
    Repository repository = new Repository();
    /** Поле ФИО*/
    private String fullName;

    /** Поле дата рождения*/
    private int[] dateOfBirth = new int[3];

    /** Поле возраст*/
    private int age;

    /** Поле ID*/
    private int id;

    /**
     * Функция получения значения поля {@link Person#fullName}
     * @return возвращает ФИО человека
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Функция получения значения поля {@link Person#dateOfBirth}
     * @return возвращает дату рождения человека
     */
    public int[] getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Функция получения значения поля {@link Person#id}
     * @return возвращает ID человека
     */
    public int getId() {
        return id;
    }

    /**
     * Функция получения значения поля {@link Person#age}
     * @return возвращает возраст человека
     */
    public int getAge() {
        LocalDate birthdate = new LocalDate (dateOfBirth[2], dateOfBirth[1], dateOfBirth[0]);
        LocalDate now = new LocalDate();
        Years years = Years.yearsBetween(birthdate, now);
        age = years.getYears();
        return age;
    }

    /**
     * Функция определения значения поля {@link Person#fullName}
     * @param fullName определяет ФИО человека
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Функция определения значения поля {@link Person#dateOfBirth}
     * @param dateOfBirth определяет дату рождения человека
     */
    public void setDateOfBirth(int[] dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Функция определения значения поля {@link Person#id}
     * @param id определяет ID человека
     */
    public void setId(int id) {
        this.id = id;
    }

}