package lab12.service;

import lab12.fields.Role;
import lab12.fields.User;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UserService {

    public static List<User> findUsersWhoHaveMoreThanOneAddress(List<User> users) {
        return users.stream()
                .filter(user -> user.getPersonDetails().getAddresses().size() > 1)
                .collect(Collectors.toList());
    }

    public static User findOldestPerson(List<User> users) {
        return users.stream()
                .min((user1, user2) -> Integer.compare(user1.getPersonDetails().getAge(), user2.getPersonDetails().getAge()))
                .orElse(null);
    }

    public static User findUserWithLongestUsername(List<User> users) {
        return users.stream()
                .max((user1, user2) -> Integer.compare(user1.getName().length(), user2.getName().length()))
                .orElse(null);
    }

    public static String getNamesAndSurnamesCommaSeparatedOfAllUsersAbove18(List<User> users) {
        return users.stream()
                .filter(user -> user.getPersonDetails().getAge() > 18)
                .map(user -> user.getPersonDetails().getName() + " " + user.getPersonDetails().getSurname())
                .collect(Collectors.joining(", "));
    }

    public static List<String> getSortedPermissionsOfUsersWithNameStartingWithA(List<User> users) {
        return users.stream()
                .filter(user -> user.getName().startsWith("A"))
                .flatMap(user -> user.getPersonDetails().getRole().getPermissions().stream())
                .map(permission -> permission.getName())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public static void printCapitalizedPermissionNamesOfUsersWithSurnameStartingWithS(List<User> users) {
        users.stream()
                .filter(user -> user.getPersonDetails().getSurname().startsWith("S"))
                .flatMap(user -> user.getPersonDetails().getRole().getPermissions().stream())
                .map(permission -> permission.getName().toUpperCase())
                .forEach(System.out::println);
    }

    public static Map<Role, List<User>> groupUsersByRole(List<User> users) {
        return users.stream()
                .collect(Collectors.groupingBy(user -> user.getPersonDetails().getRole()));
    }

    public static Map<Boolean, List<User>> partitionUserByUnderAndOver18(List<User> users) {
        return users.stream()
                .collect(Collectors.partitioningBy(user -> user.getPersonDetails().getAge() > 18));
    }
}
