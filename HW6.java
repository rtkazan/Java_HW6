public class HW6 {
    public static void main(String[] args) {
        phonebook phonebook = new phonebook();
        phonebook.add("123456789", "Алиса");
        phonebook.add("987654321", "Иван");
        phonebook.add("456789123", "Владимир");
        phonebook.add("321654987", "Давид");
        phonebook.add("789123456", "Алексадра");
        phonebook.add("654987321", "Сергей");
        phonebook.add("234567891", "Иван");
        phonebook.add("876543219", "Пётр");
        phonebook.add("345678912", "Александра");
        phonebook.add("432165498", "Андрей");
        phonebook.add("876543219", "Степан");
        phonebook.add("234567891", "Сергей");
        phonebook.add("654987321", "Владимир");
        phonebook.add("435455423", "Владимир");
        phonebook.add("789123446", "Викторя");
        phonebook.add("321654987", "Давид");
        phonebook.add("321654987", "Виталий");
        phonebook.add("321654987", "Виталий");
        System.out.println(phonebook.getPhoneNum("654987321"));
        System.out.println(phonebook.getByName("Давид"));
        System.out.println(phonebook.getAll());
    }
}