package lab12.service;
import lab12.fields.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // Tworzenie przykładowych obiektów User, Role, Permission i Address
        Permission permission1 = new Permission("Permission 1");
        Permission permission2 = new Permission("Permission 2");
        Permission permission3 = new Permission("Permission 3");
        Permission permission4 = new Permission("Permission 4");

        Role role1 = new Role("Role 1", Arrays.asList(permission1, permission2));
        Role role2 = new Role("Role 2", Arrays.asList(permission3, permission4));

        Address address1 = new Address("Street 1", 1, null, "City 1", "12345", "Country 1");
        Address address2 = new Address("Street 2", 2, null, "City 2", "67890", "Country 2");
        Address address3 = new Address("Street 3", 3, null, "City 3", "54321", "Country 3");

        Person person1 = new Person("John", "Doe", Arrays.asList("111111111", "222222222"), Arrays.asList(address1, address2), role1, 20);
        Person person2 = new Person("Alice", "Smith", Arrays.asList("333333333"), Arrays.asList(address3), role2, 25);
        Person person3 = new Person("Bob", "Johnson", Arrays.asList("444444444"), Arrays.asList(address1, address2, address3), role1, 30);

        User user1 = new User("user1", "password1", person1);
        User user2 = new User("user2", "password2", person2);
        User user3 = new User("user3", "password3", person3);

        List<User> users = Arrays.asList(user1, user2, user3);

        // Przykład użycia metod z klasy UserService
        List<User> usersWithMoreThanOneAddress = UserService.findUsersWhoHaveMoreThanOneAddress(users);
        System.out.println("Users who have more than one address: " + usersWithMoreThanOneAddress);

        User oldestPerson = UserService.findOldestPerson(users);
        System.out.println("Oldest person: " + oldestPerson);

        User userWithLongestUsername = UserService.findUserWithLongestUsername(users);
        System.out.println("User with longest username: " + userWithLongestUsername);

        String namesAndSurnamesAbove18 = UserService.getNamesAndSurnamesCommaSeparatedOfAllUsersAbove18(users);
        System.out.println("Names and surnames of users above 18: " + namesAndSurnamesAbove18);

        List<String> sortedPermissionsStartingWithA = UserService.getSortedPermissionsOfUsersWithNameStartingWithA(users);
        System.out.println("Sorted permissions of users with name starting with 'A': " + sortedPermissionsStartingWithA);

        System.out.println("Capitalized permission names of users with surname starting with 'S':");
        UserService.printCapitalizedPermissionNamesOfUsersWithSurnameStartingWithS(users);

        Map<Role, List<User>> usersGroupedByRole = UserService.groupUsersByRole(users);
        System.out.println("Users grouped by role: " + usersGroupedByRole);

        Map<Boolean, List<User>> usersPartitionedByAge = UserService.partitionUserByUnderAndOver18(users);
        System.out.println("Users partitioned by age: " + usersPartitionedByAge);
    }
}
