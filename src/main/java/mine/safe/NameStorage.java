package mine.safe;

import java.util.Arrays;

public class NameStorage {
    private static String[] names = new String[0];

    public static int getSize() {
        return names.length;
    }

    public static void setNames(String[] names) {
        NameStorage.names = names;
    }

    public static void clear() {
        names = new String[]{};
    }

    public static String[] findAll() {
        return names;
    }

    public static String find(final String fullName) {
        for (String name : names) {
            if (name.equalsIgnoreCase(fullName)) {
                return name;
            }
        }
        return "NULL";
    }

    public static boolean add(final String fullName) {
        //add new name to array
        String[] newArr = new String[0];
        for (String name : names) {
            if (name.equalsIgnoreCase(fullName)) {
                return false;
            } else {
                newArr = Arrays.copyOf(names, names.length + 1);
                newArr[newArr.length - 1] = fullName;
            }
        }
        names = newArr;
        return true;
    }


    public static String[] findByFirstName(final String firstName) {
        String[] filteredNames = new String[0];
        for (String newName : names) {
            if (newName.split(" ")[0].equalsIgnoreCase(firstName)) {
                filteredNames = Arrays.copyOf(filteredNames, filteredNames.length + 1);
                filteredNames[filteredNames.length - 1] = newName;
            }
        }
        return filteredNames;
    }


    public static String[] findByLastName(final String lastName) {
        String[] searchedNames = new String[0];
        for (String name : names) {
            if (name.split(" ")[1].equalsIgnoreCase(lastName)) {
                searchedNames = Arrays.copyOf(searchedNames, searchedNames.length + 1);
                searchedNames[searchedNames.length - 1] = name;
            }
        }
        return searchedNames;
    }

    public static boolean update(final String original, final String updatedName) {
        boolean result = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(original)) {
                names[i] = updatedName;
                return true;
            }
        }
        return result;
    }

    public static boolean remove(final String fullName) {
        int count = 0;
        for (int i = 0; i < names.length; i++) {
            if (fullName == names[i]) {
                for (int j = i; j < names.length - 1; j++) {
                    names[i] = names[j + 1];
                    return true;
                }
                break;
            }
        }
        return false;
    }

}
